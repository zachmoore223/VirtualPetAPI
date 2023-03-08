package com.wcci.virtualPetAPI.templateController;

import com.wcci.virtualPetAPI.entities.Shelter;
import com.wcci.virtualPetAPI.repositories.ShelterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ShelterTemplateController {
    final private ShelterRepository shelterRepository;

    public ShelterTemplateController(@Autowired ShelterRepository shelterRepository) {
        this.shelterRepository = shelterRepository;
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
        return "shelter.html";
    }

    @PostMapping("/shelters")
    public String postShelters(final Shelter shelter) {
        shelterRepository.save(shelter);
        return "redirect:/shelters";
    }

}