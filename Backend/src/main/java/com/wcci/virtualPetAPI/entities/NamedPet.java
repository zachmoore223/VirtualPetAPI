package com.wcci.virtualPetAPI.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

// @JsonDeserialize(as = OrganicDog.class)
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract public class NamedPet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    @ManyToOne()
    @JsonIgnore
    private Shelter shelter;

    public NamedPet(String name) {
        this.name = name;
    }

    public NamedPet() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void tick() {

    }
}
