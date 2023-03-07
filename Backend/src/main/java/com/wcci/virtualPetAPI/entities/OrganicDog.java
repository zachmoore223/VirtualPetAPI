package com.wcci.virtualPetAPI.entities;

import javax.persistence.Entity;

@Entity
public class OrganicDog extends NamedPet {

    private int hunger;

    public OrganicDog(long id, String name) {
        super(id, name);
    }

    public OrganicDog() {

    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void feed() {
        this.hunger = 0;
    }
}
