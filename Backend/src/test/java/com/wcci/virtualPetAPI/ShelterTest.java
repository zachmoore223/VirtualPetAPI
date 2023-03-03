package com.wcci.virtualPetAPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShelterTest {

    @Test
    public void testGetShelter() {
        Shelter shelter = new Shelter (1, "Shelter 1");
        assertEquals("Shelter 1", shelter.getName());
        
    }

}