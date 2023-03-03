package com.wcci.virtualPetAPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NamedPetTest {

    @Test
    void getPetID() {
        NamedPet tester = new NamedPet(123, "Ranger");
        assertEquals(123, tester.getPetID());
    }

    @Test
    void getName() {
        NamedPet tester = new NamedPet(123, "Ranger");
        assertEquals("Ranger", tester.getName());
    }
}