package com.wcci.virtualPetAPI.restControllers;

import com.fasterxml.jackson.databind.util.Named;
import com.wcci.virtualPetAPI.entities.NamedPet;
import com.wcci.virtualPetAPI.entities.OrganicDog;
import com.wcci.virtualPetAPI.entities.Shelter;
import com.wcci.virtualPetAPI.repositories.NamedPetRepository;
import com.wcci.virtualPetAPI.repositories.OrganicDogRepository;
import com.wcci.virtualPetAPI.repositories.ShelterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShelterController {
    final ShelterRepository shelterRepository;
    final NamedPetRepository namedPetRepository;
    final OrganicDogRepository organicDogRepository;

    public ShelterController(@Autowired ShelterRepository shelterRepository,
                             @Autowired NamedPetRepository namedPetRepository,
                             @Autowired OrganicDogRepository organicDogRepository) {
        this.shelterRepository = shelterRepository;
        this.namedPetRepository = namedPetRepository;
        this.organicDogRepository = organicDogRepository;
    }

    //curl -X GET http://localhost:8080/shelter -H 'Content-Type: application/json'
    @GetMapping("/api/shelter")
    public Iterable<Shelter> getShelters() {
        return shelterRepository.findAll();
    }

    //curl -X GET http://localhost:8080/shelter/1 -H 'Content-Type: application/json'
    @GetMapping("/api/shelter/{shelter_id}")
    public Shelter getShelter(@PathVariable final long shelter_id) {
        return shelterRepository.findById(shelter_id).get();
    }

    /* curl -X POST http://localhost:8080/api/shelter -H 'Content-Type: application/json' -d '{"name": "test"}' */
    @PostMapping("/api/shelter")
    public Shelter addShelter(@RequestBody Shelter shelter) {
        return shelterRepository.save(shelter);
    }


    /* curl -X POST http://localhost:8080/api/shelters/1/pets -H 'Content-Type: application/json' -d '{"id": "1", "name": "Dog"}' */
    @PostMapping("/api/pets")
    public NamedPet addPet(@RequestBody NamedPet namedPet) {
        return namedPetRepository.save(namedPet);
    }

    @PostMapping("/api/organicDogs")
    public NamedPet addPet(@RequestBody OrganicDog organicDog) {
        return organicDogRepository.save(organicDog);
    }

    /* curl -X PUT http://localhost:8080/api/shelter/1 -H 'Content-Type: application/json' -d '{"id":1, "name": "test"}' */
    @PutMapping("/api/shelter/{shelter_id}")
    public void putShelter(@PathVariable final long shelter_id, @RequestBody Shelter shelter) throws Exception {
        if (shelter.getId() != shelter_id) {
            throw new Exception("Shelter body has id " + shelter.getId() + " but url had id " + shelter_id);
        }
        shelterRepository.save(shelter);
    }

    //curl -X DELETE http://localhost:8080/api/shelter/1 -H 'Content-Type: application/json'
    @DeleteMapping("/api/shelter/{shelter_id}")
    public void deleteShelter(@PathVariable final long shelter_id) {
        shelterRepository.delete(shelterRepository.findById(shelter_id).get());
    }


}