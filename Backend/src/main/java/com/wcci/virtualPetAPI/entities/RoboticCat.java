package com.wcci.virtualPetAPI.entities;

import javax.persistence.Entity;

@Entity
public class RoboticCat extends NamedPet {

    private int oil;

    public RoboticCat(String name) {
        super(name);
    }

    public RoboticCat() {
        super();
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

    @Override
    public void tick() {
        oil++;
    }
}
