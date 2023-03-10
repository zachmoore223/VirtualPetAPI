package com.wcci.virtualPetAPI.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrganicCatTest {

    @Test
    public void testAddOrganicCatReturnsId() {
        OrganicCat organicCat = new OrganicCat("Tom");
        organicCat.setId(1);
        assertEquals(1, organicCat.getId());
    }

    @Test
    public void testConstructAndReturnName() {
        OrganicCat organicCat = new OrganicCat("Tom");
        assertEquals("Tom", organicCat.getName());
    }

    @Test
    public void testSetAndGetHunger() {
        OrganicCat organicCat = new OrganicCat("Tom");
        organicCat.setHunger(1);
        assertEquals(1, organicCat.getHunger());
    }

    @Test
    public void testFeedReducerHunger() {
        OrganicCat organicCat = new OrganicCat("Tom");
        organicCat.setHunger(10);
        organicCat.feed();
        assertEquals(9, organicCat.getHunger());
    }
}