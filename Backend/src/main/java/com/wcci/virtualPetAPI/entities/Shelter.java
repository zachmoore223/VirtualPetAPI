package com.wcci.virtualPetAPI.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Entity()
public class Shelter {
    @Id
    @GeneratedValue()
    private long id;
    private String name;
    @OneToMany()
    private Map<Long, NamedPet> pets = new HashMap<>();

    protected Shelter() {
    }

    public Shelter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public Map<Long, NamedPet> getPets() {
        return pets;
    }

    public void setPets(Map<Long, NamedPet> pets) {
        this.pets = pets;
    }

    public NamedPet getPet(long id) {
        return pets.get(id);
    }

    public void addPet(NamedPet namedPet) {
        pets.put(namedPet.getId(), namedPet);
    }

    public void removePet(NamedPet namedPet) {
        pets.remove(namedPet.getId());
    }

    public Collection<NamedPet> getAllPets() {
        return pets.values();
    }

    public void setId() {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
