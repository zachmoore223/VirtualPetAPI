package com.wcci.virtualPetAPI.entities;

import javax.persistence.Entity;

@Entity
public class RoboticDog extends NamedPet {

    private int oil;

    public RoboticDog(long id, String name) {
        super(id, name);
    }

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public void giveOil() {
        this.oil = 0;
    }
}
