package de.petragawellek.likeherotozero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ScientistController {

    @GetMapping("/scientist")
    public String scientistPage() {

        return "scientist";
    }

    @PostMapping("/scientist")
    public String saveEmission(Model model) {

        model.addAttribute(
                "successMessage",
                "CO₂-Daten wurden erfolgreich gespeichert.");

        return "scientist";
    }
}