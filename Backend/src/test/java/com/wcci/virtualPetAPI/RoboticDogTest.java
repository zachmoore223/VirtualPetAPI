package com.wcci.virtualPetAPI;

import com.wcci.virtualPetAPI.entities.RoboticDog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoboticDogTest {

    @Test
    public void testAddRoboticDogReturnsId() {
        RoboticDog roboticDog = new RoboticDog("Fido");
        assertEquals(1, roboticDog.getId());
    }

    @Test
    public void testConstructAndReturnName() {
        RoboticDog roboticDog = new RoboticDog("Fido");
        assertEquals("Fido", roboticDog.getPetName());
    }

    @Test
    public void testSetAndGetOil() {
        RoboticDog roboticDog = new RoboticDog("Fido");
        roboticDog.setOil(1);
        assertEquals(1, roboticDog.getOil());
    }

    @Test
    public void testGiveOilSetsOilToZero() {
        RoboticDog roboticDog = new RoboticDog("Fido");
        roboticDog.setOil(10);
        roboticDog.giveOil();
        assertEquals(0, roboticDog.getOil());
    }
}