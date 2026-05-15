package de.petragawellek.likeherotozero.controller;
import de.petragawellek.likeherotozero.model.EmissionRecord;
import de.petragawellek.likeherotozero.repository.EmissionRecordRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;
@Controller
public class ScientistController {
    private final EmissionRecordRepository repository;
    public ScientistController(
            EmissionRecordRepository repository) {
        this.repository = repository;
    }
    private final List<EmissionRecord> emissions = new ArrayList<>();
    @GetMapping("/scientist")
        public String scientistPage(Model model) {
        List<EmissionRecord> emissions =
                repository.findAll();
        model.addAttribute("emissions", emissions);
        double average = emissions.stream()
                .mapToDouble(EmissionRecord::getCo2)
                .average()
                .orElse(0);
        double max = emissions.stream()
                .mapToDouble(EmissionRecord::getCo2)
                .max()
                .orElse(0);
        model.addAttribute("count", emissions.size());
        model.addAttribute("average", average);
        model.addAttribute("max", max);
        List<String> countries = emissions.stream()
                .map(EmissionRecord::getCountry)
                .toList();
        List<Double> co2Values = emissions.stream()
                .map(EmissionRecord::getCo2)
                .toList();
        model.addAttribute("countries", countries);
        model.addAttribute("co2Values", co2Values);
        return "scientist";
    }
    @PostMapping("/scientist")
    public String saveEmission(
            @RequestParam String country,
    @RequestParam Integer year,
    @RequestParam Double co2,
            Model model) {
        if (country.isBlank() || year <= 0 || co2 <= 0) {
            model.addAttribute("errorMessage", "Bitte gültigen Wert eingeben!");
            model.addAttribute("emissions", emissions);
            return "scientist";
        }
        EmissionRecord record =
                new EmissionRecord(country, year, co2);
        repository.save(record);
        EmissionRecord data =
                new EmissionRecord(country, year, co2);
        emissions.add(data);
        double average = emissions.stream()
                        .mapToDouble(EmissionRecord::getCo2)
                                .average()
                                        .orElse(0);
        double max = emissions.stream()
                        .mapToDouble(EmissionRecord::getCo2)
                                .max()
                                        .orElse(0);
        model.addAttribute(
                "successMessage",
                "CO₂-Daten wurden erfolgreich gespeichert.");
        model.addAttribute("emissions", emissions);
        model.addAttribute("count", emissions.size());
        model.addAttribute("average", average);
        model.addAttribute("max", max);
        List<String> countries = emissions.stream()
                .map(EmissionRecord::getCountry)
                .toList();

        List<Double> co2Values = emissions.stream()
                .map(EmissionRecord::getCo2)
                .toList();

        model.addAttribute("countries", countries);
        model.addAttribute("co2Values", co2Values);
        return "scientist";
    }
}