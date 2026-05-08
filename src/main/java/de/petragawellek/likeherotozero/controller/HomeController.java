package de.petragawellek.likeherotozero.controller;

import de.petragawellek.likeherotozero.repository.CountryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    private final CountryRepository countryRepository;
    public HomeController(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("countries",
                countryRepository.findAll());
        return "index";
    }
}