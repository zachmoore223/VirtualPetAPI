package com.wcci.virtualPetAPI.templateController;

import com.wcci.virtualPetAPI.entities.OrganicDog;
import com.wcci.virtualPetAPI.entities.Shelter;
import com.wcci.virtualPetAPI.repositories.NamedPetRepository;
import com.wcci.virtualPetAPI.repositories.OrganicDogRepository;
import com.wcci.virtualPetAPI.repositories.ShelterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ShelterTemplateController {
    final private ShelterRepository shelterRepository;
    final private OrganicDogRepository organicDogRepository;

    public ShelterTemplateController(@Autowired ShelterRepository shelterRepository, NamedPetRepository namedPetRepository, OrganicDogRepository organicDogRepository) {
        this.shelterRepository = shelterRepository;
        this.organicDogRepository = organicDogRepository;
    }

    @GetMapping("/shelters")
    public String getShelters(Model model) {
        model.addAttribute("shelters", shelterRepository.findAll());
        return "shelters.html";
    }

    @GetMapping("/shelters/{shelter_id}")
    public String getShelter(Model model, @PathVariable long shelter_id) {
        model.addAttribute("shelter", shelterRepository.findById(shelter_id).get());
        model.addAttribute("pets", shelterRepository.findById(shelter_id).get().getAllPets());
        return "specificShelter.html";
    }

    @PostMapping("/shelters")
    public String postShelters(final Shelter shelter) {
        shelterRepository.save(shelter);
        return "redirect:/shelters";
    }

    @PostMapping("/shelters/{shelter_id}/organicDog")
    public String addPet(@RequestParam String name, @PathVariable Long shelter_id) {
        OrganicDog organicDog = new OrganicDog(name);
        organicDog.setShelter(shelterRepository.findById(shelter_id).get());
        organicDogRepository.save(organicDog);
        String returnAddress = "redirect:/shelters/" + shelter_id;
        return returnAddress;
    }

    @PutMapping("/shelters/{shelter_id}/organicDog/{organicDog_id}")
    public void feedPet(@PathVariable Long shelter_id, @PathVariable Long organicDog_id) {
        organicDogRepository.findById(organicDog_id).get().feed();
        organicDogRepository.save(organicDogRepository.findById(organicDog_id).get());
    }


}
