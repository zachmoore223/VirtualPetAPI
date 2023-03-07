package com.wcci.virtualPetAPI.entities;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class OrganicDog extends NamedPet {

    private int hunger =12;

    public OrganicDog(long id, String name) {
        super(id, name);
    }

    public OrganicDog() {
        super();
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void feed() {
        this.hunger = 10;
    }
}
