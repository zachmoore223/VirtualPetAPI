package com.wcci.virtualPetAPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrganicDogTest {

    @Test
    public void testAddOrganicDogReturnsId() {
        OrganicDog organicDog = new OrganicDog(1);
        assertEquals(1, organicDog.getId());
    }

    @Test
    public void testSetAndReturnName() {
        OrganicDog organicDog = new OrganicDog(1);
        organicDog.setName(),"Fido";
        assertEquals("Fido", organicDog.getName());
}