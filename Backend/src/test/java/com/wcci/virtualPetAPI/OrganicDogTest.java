package com.wcci.virtualPetAPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrganicDogTest {

    @Test
    public void testAddOrganicDogReturnsId() {
        OrganicDog organicDog = new OrganicDog(1, "Fido");
        assertEquals(1, organicDog.getId());
    }

    @Test
    public void testConstructAndReturnName() {
        OrganicDog organicDog = new OrganicDog(1, "Fido");
        assertEquals("Fido", organicDog.getName());
    }

    @Test
    public void testSetAndGetHunger() {
        OrganicDog organicDog = new OrganicDog(1, "Fido");
        organicDog.setHunger(1);
        assertEquals(1, organicDog.getHunger());
    }
}