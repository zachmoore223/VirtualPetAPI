package com.wcci.virtualPetAPI;

public class OrganicDog {

    private long id;
    private String name;

    public OrganicDog(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }

    public void setName() {
    }
}
