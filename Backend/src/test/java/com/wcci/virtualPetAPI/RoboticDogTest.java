package com.wcci.virtualPetAPI;

import com.wcci.virtualPetAPI.entities.RoboticDog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoboticDogTest {

    @Test
    public void testAddRoboticDogReturnsId() {
        RoboticDog roboticDog = new RoboticDog(1, "Fido");
        assertEquals(1, roboticDog.getId());
    }

    @Test
    public void testConstructAndReturnName() {
        RoboticDog roboticDog = new RoboticDog(1, "Fido");
        assertEquals("Fido", roboticDog.getName());
    }

    @Test
    public void testSetAndGetOil() {
        RoboticDog roboticDog = new RoboticDog(1, "Fido");
        roboticDog.setOil(1);
        assertEquals(1, roboticDog.getOil());
    }

    @Test
    public void testGiveOilSetsOilToZero() {
        RoboticDog roboticDog = new RoboticDog(1, "Fido");
        roboticDog.setOil(10);
        roboticDog.giveOil();
        assertEquals(0, roboticDog.getOil());
    }
}