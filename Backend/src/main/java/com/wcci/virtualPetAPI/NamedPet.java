package com.wcci.virtualPetAPI;

abstract public class NamedPet{
    final private long petID;
    final private String petName;

    public NamedPet(long petID, String petName) {
        this.petID = petID;
        this.petName = petName;
    }

    public long getId() {
        return petID;
    }

    public String getName() {
        return petName;
    }
}
