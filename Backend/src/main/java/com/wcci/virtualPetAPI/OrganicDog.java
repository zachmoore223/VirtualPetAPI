package com.wcci.virtualPetAPI;

public class OrganicDog extends NamedPet{

    private int hunger;

    public OrganicDog(long id, String name) {
        super(id, name);
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
