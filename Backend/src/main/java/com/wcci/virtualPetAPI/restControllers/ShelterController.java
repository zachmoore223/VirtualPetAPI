package com.wcci.virtualPetAPI.restControllers;

import com.wcci.virtualPetAPI.entities.Shelter;
import com.wcci.virtualPetAPI.repositories.ShelterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShelterController {
    final ShelterRepository shelterRepository;

    public ShelterController(@Autowired ShelterRepository shelterRepository) {
        this.shelterRepository = shelterRepository;
    }

    //curl -X GET http://localhost:8080/shelter -H 'Content-Type: application/json'
    @GetMapping("/shelter")
    public Iterable<Shelter> getShelters() {
        return shelterRepository.findAll();
    }

    //curl -X GET http://localhost:8080/shelter/1 -H 'Content-Type: application/json'
    @GetMapping("/shelter/{shelter_id}")
    public Shelter getShelter(@PathVariable final long shelter_id) {
        return shelterRepository.findById(shelter_id).get();
    }
}