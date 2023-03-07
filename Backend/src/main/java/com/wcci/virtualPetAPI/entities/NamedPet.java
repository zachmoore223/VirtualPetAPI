package com.wcci.virtualPetAPI.entities;

import com.wcci.virtualPetAPI.entities.Shelter;

import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract public class NamedPet {
    @Id
    private long petID;
    private String petName;
    @ManyToOne()
    private Shelter shelter;

    public NamedPet(long petID, String petName) {
        this.petID = petID;
        this.petName = petName;
    }

    public NamedPet() {
    }

    public long getId() {
        return petID;
    }

    public String getName() {
        return petName;
    }
}
