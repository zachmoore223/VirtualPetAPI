package com.wcci.virtualPetAPI.entities;

import javax.persistence.Entity;

@Entity
public class OrganicCat extends NamedPet {

    private int hunger = 6;

    public OrganicCat(String name) {
        super(name);
    }

    public OrganicCat() {
        super();
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void feed() {
        hunger--;
    }

    @Override
    public void tick() {
        hunger++;
    }
}
