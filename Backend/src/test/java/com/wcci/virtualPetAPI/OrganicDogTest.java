package com.wcci.virtualPetAPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrganicDogTest {

    @Test
    public void addOrganicDogReturnsId() {
        OrganicDog organicDog = new OrganicDog(1);
        assertEquals(1, organicDog.getId());
    }

}