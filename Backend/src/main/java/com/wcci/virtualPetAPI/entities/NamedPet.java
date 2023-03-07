package com.wcci.virtualPetAPI.entities;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.wcci.virtualPetAPI.entities.Shelter;

import javax.persistence.*;

// @JsonDeserialize(as = OrganicDog.class)
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract public class NamedPet {
    @Id
    @GeneratedValue()
    private long id;
    private String petName;
    @ManyToOne()
    private Shelter shelter;

    public NamedPet(String petName) {
        this.petName = petName;
    }

    public NamedPet() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id= id;
    }

    public String getPetName() {
        return petName;
    }
}
