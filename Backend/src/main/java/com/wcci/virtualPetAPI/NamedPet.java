package com.wcci.virtualPetAPI;

public class NamedPet {
    final private long petID;
    final private String petName;

    public NamedPet(long petID, String petName) {
        this.petID = petID;
        this.petName = petName;
    }

    public long getPetID() {
        return petID;
    }

    public String getName() {
        return petName;
    }
}
