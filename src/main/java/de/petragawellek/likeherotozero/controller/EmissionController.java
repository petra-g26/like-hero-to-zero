package de.petragawellek.likeherotozero.controller;
import de.petragawellek.likeherotozero.repository.EmissionRecordRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class EmissionController {
    private final EmissionRecordRepository repository;
    public EmissionController(
            EmissionRecordRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/emissions")
    public String showEmissions(Model model) {
        model.addAttribute(
                "emissions",
                repository.findAll()
        );
        return "emissions";
    }
}