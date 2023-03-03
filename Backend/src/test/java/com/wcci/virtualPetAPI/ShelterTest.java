package com.wcci.virtualPetAPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShelterTest {

    @Test
    public void testGetShelter() {
        Shelter shelter = new Shelter(1, "Shelter 1");
        assertEquals("Shelter 1", shelter.getName());

    }

    @Test
    public void addPetToShelter() {
        OrganicDog tester = new OrganicDog(1, "tester");
        Shelter shelter = new Shelter(1, "Shelter 1");
        shelter.addPet(tester);
        assertEquals(tester, shelter.getPet(1));
    }

    @Test
    public void removePetFromShelter() {
        OrganicDog tester = new OrganicDog(1, "tester");
        Shelter shelter = new Shelter(1, "Shelter 1");
        shelter.addPet(tester);
        shelter.removePet(tester);
        assertNotEquals(tester, shelter.getPet(1));
    }

    @Test
    public void testReturnAllPetsFromAShelterWithOnePet() {
        OrganicDog tester1 = new OrganicDog(1, "tester");
        Shelter shelter = new Shelter(1, "Shelter 1");
        shelter.addPet(tester1);
        assertEquals(1,shelter.getAllPets().size());

    }
    @Test
    public void testReturnAllPetsFromAShelterWithTwoPet() {
        OrganicDog tester1 = new OrganicDog(1, "tester1");
        RoboticDog tester2 = new RoboticDog(2, "tester2");
        Shelter shelter = new Shelter(1, "Shelter 1");
        shelter.addPet(tester1);
        shelter.addPet(tester2);
        assertEquals(2,shelter.getAllPets().size());

    }

}