package com.wcci.virtualPetAPI.entities;

import javax.persistence.Entity;

@Entity
public class RoboticDog extends NamedPet {

    private int oil = 6;

    public RoboticDog(String name) {
        super(name);
    }

    public RoboticDog() {
        super();
    }

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public void giveOil() {
        oil--;
    }

    @Override
    public void tick() {
        oil++;
    }
}
