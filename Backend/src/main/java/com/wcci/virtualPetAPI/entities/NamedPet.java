package com.wcci.virtualPetAPI.entities;

import com.wcci.virtualPetAPI.entities.Shelter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity()
abstract public class NamedPet {
    @Id
    final private long petID;
    final private String petName;
    @ManyToOne()
    private Shelter shelter;

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
