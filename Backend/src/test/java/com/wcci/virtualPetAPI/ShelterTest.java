package com.wcci.virtualPetAPI;

import com.wcci.virtualPetAPI.entities.OrganicDog;
import com.wcci.virtualPetAPI.entities.RoboticDog;
import com.wcci.virtualPetAPI.entities.Shelter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShelterTest {

    @Test
    public void testGetShelter() {
        Shelter shelter = new Shelter("Shelter 1");
        assertEquals("Shelter 1", shelter.getName());

    }

    @Test
    public void addPetToShelter() {
        OrganicDog tester = new OrganicDog("tester");
        Shelter shelter = new Shelter("Shelter 1");
        shelter.addPet(tester);
        assertTrue(shelter.getAllPets().contains(tester));
    }

    @Test
    public void removePetFromShelter() {
        OrganicDog tester = new OrganicDog("tester");
        Shelter shelter = new Shelter("Shelter 1");
        shelter.addPet(tester);
        shelter.removePet(tester);
        assertNotEquals(tester, shelter.getAllPets().contains(tester));
    }

    @Test
    public void testReturnAllPetsFromAShelterWithOnePet() {
        OrganicDog tester1 = new OrganicDog("tester");
        Shelter shelter = new Shelter("Shelter 1");
        shelter.addPet(tester1);
        assertEquals(1, shelter.getAllPets().size());

    }

    @Test
    public void testReturnAllPetsFromAShelterWithTwoPet() {
        OrganicDog tester1 = new OrganicDog("tester1");
        RoboticDog tester2 = new RoboticDog("tester2");
        Shelter shelter = new Shelter("Shelter 1");
        shelter.addPet(tester1);
        shelter.addPet(tester2);
        assertEquals(2, shelter.getAllPets().size());

    }

}