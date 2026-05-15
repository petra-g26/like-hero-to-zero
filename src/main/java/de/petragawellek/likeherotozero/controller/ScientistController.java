package de.petragawellek.likeherotozero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import de.petragawellek.likeherotozero.model.EmissionData;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ScientistController {
    private final List<EmissionData> emissions = new ArrayList<>();

    @PostMapping("/scientist")
    public String saveEmission(
            @RequestParam String country,
            @RequestParam Integer year,
            @RequestParam Double co2,
            Model model) {
        EmissionData data =
                new EmissionData(country, year, co2);
        emissions.add(data);
        model.addAttribute(
                "successMessage",
                "CO₂-Daten wurden erfolgreich gespeichert.");
        model.addAttribute("emissions", emissions);
        return "scientist";
    }
    @GetMapping("/scientist")
    public String scientistPage(Model model) {
        model.addAttribute("emissions", emissions);
        return "scientist";
    }
}