package com.wcci.virtualPetAPI;
import java.util.HashMap;
import java.util.Map;

public class Shelter {

    final private long id;
    final private String name;
    private Map<Long, NamedPet> pets = new HashMap<>();

    public Shelter(long id, String name) {
        this.id = id;
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
}
