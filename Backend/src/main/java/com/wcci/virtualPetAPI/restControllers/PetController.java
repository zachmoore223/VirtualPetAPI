package com.wcci.virtualPetAPI.restControllers;

import com.wcci.virtualPetAPI.entities.NamedPet;
import com.wcci.virtualPetAPI.entities.OrganicDog;
import com.wcci.virtualPetAPI.repositories.NamedPetRepository;
import com.wcci.virtualPetAPI.repositories.OrganicDogRepository;
import com.wcci.virtualPetAPI.repositories.ShelterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class PetController {
    final ShelterRepository shelterRepository;
    final NamedPetRepository namedPetRepository;
    final OrganicDogRepository organicDogRepository;

    public PetController(@Autowired ShelterRepository shelterRepository,
                         NamedPetRepository namedPetRepository,
                         OrganicDogRepository organicDogRepository) {
        this.shelterRepository = shelterRepository;
        this.namedPetRepository = namedPetRepository;
        this.organicDogRepository = organicDogRepository;
    }

    //    curl -X GET http://localhost:8080/api/shelters/1/pets -H 'Content-Type: application/json'
    @GetMapping("/api/shelters/{shelter_id}/pets")
    public Collection<NamedPet> getShelters(@PathVariable final long shelter_id) {
        return shelterRepository.findById(shelter_id).get().getAllPets();
    }

    @PostMapping("/api/pets")
    public NamedPet addPet(@RequestBody NamedPet namedPet) {
        return namedPetRepository.save(namedPet);
    }

//    curl -s -X POST http://localhost:8080/api/shelters/1/organicDogs -H 'Content-Type: application/json' -d '{"petName": "testDog"}'

    @PostMapping("/api/shelters/{shelter_id}/organicDog")
    public OrganicDog addPet(@RequestBody OrganicDog organicDog, final @PathVariable Long shelter_id) {
        organicDog.setShelter(shelterRepository.findById(shelter_id).get());
        namedPetRepository.save(organicDog);
        return organicDog;
    }
}
