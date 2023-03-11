package com.wcci.virtualPetAPI.entities;

import javax.persistence.Entity;

import static com.wcci.virtualPetAPI.entities.NamedPet.PET_TYPE.ROBOTIC_DOG;

@Entity
public class RoboticDog extends NamedPet {

    private int oil = 6;
    private final PET_TYPE type = ROBOTIC_DOG;

    public PET_TYPE getType() {
        return type;
    }


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
