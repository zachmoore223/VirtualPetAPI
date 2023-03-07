package com.wcci.virtualPetAPI.entities;

import javax.persistence.*;
import java.util.*;

@Entity()
public class Shelter {
    @Id
    @GeneratedValue()
    private long id;
    private String name;
    @OneToMany(mappedBy = "shelter")
    private Set<NamedPet> pets = new HashSet<>();

    protected Shelter() {
    }

    public Shelter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }






    public void addPet(NamedPet namedPet) {
        pets.add(namedPet);
    }

    public void removePet(NamedPet namedPet) {
        pets.remove(namedPet);
    }


    public Collection<NamedPet> getAllPets() {
        return pets;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
