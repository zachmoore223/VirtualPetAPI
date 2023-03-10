package com.wcci.virtualPetAPI.restControllers;

import com.wcci.virtualPetAPI.entities.RoboticDog;
import com.wcci.virtualPetAPI.repositories.NamedPetRepository;
import com.wcci.virtualPetAPI.repositories.RoboticDogRepository;
import com.wcci.virtualPetAPI.repositories.ShelterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class RoboticDogController {
    final ShelterRepository shelterRepository;
    final NamedPetRepository namedPetRepository;

    final RoboticDogRepository roboticDogRepository;

    public RoboticDogController(@Autowired ShelterRepository shelterRepository,
                                NamedPetRepository namedPetRepository,
                                RoboticDogRepository roboticDogRepository) {
        this.shelterRepository = shelterRepository;
        this.namedPetRepository = namedPetRepository;
        this.roboticDogRepository = roboticDogRepository;
    }

    //    curl -s -X POST http://localhost:8080/api/shelters/1/roboticDogs -H 'Content-Type: application/json' -d '{"name": "testRobotDog"}'
    @PostMapping("/api/shelters/{shelter_id}/roboticDogs")
    public RoboticDog addRoboticPet(@RequestBody RoboticDog roboticDog, final @PathVariable Long shelter_id) {
        roboticDog.setShelter(shelterRepository.findById(shelter_id).get());
        namedPetRepository.save(roboticDog);
        return roboticDog;
    }
}
