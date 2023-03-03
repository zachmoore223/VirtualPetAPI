package com.wcci.virtualPetAPI;

public class Shelter {

    final private long id;
    final private String name;

    public Shelter(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
