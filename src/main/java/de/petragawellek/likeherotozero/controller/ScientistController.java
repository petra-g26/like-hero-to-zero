package de.petragawellek.likeherotozero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ScientistController {
    @GetMapping("/scientist")
    public String scientistPage() {
        return "scientist";
    }
    @PostMapping("/scientist")
    public String saveEmission(
            @RequestParam String country,
            @RequestParam Integer year,
            @RequestParam Double co2,
            Model model) {
        model.addAttribute(
                "successMessage",
                "CO₂-Daten wurden erfolgreich gespeichert.");
        model.addAttribute("country", country);
        model.addAttribute("year", year);
        model.addAttribute("co2", co2);
        return "scientist";
    }
}