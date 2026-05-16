package de.petragawellek.likeherotozero.controller;
import de.petragawellek.likeherotozero.repository.EmissionRecordRepository;
import de.petragawellek.likeherotozero.model.EmissionRecord;
import de.petragawellek.likeherotozero.repository.CountryRepository;
import de.petragawellek.likeherotozero.model.Country;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HomeController {
    private final EmissionRecordRepository emissionRepository;
private final CountryRepository countryRepository;

    public HomeController(
            EmissionRecordRepository emissionRepository,
            CountryRepository countryRepository) {
        this.emissionRepository =
                emissionRepository;
        this.countryRepository =
                countryRepository;
    }
    @GetMapping("/")
    public String home(
            @RequestParam(required = false)
            String country,
            Model model) {
        model.addAttribute(
                "selectedCountry",
                country
        );
        if (country != null
                && !country.isBlank()) {
            EmissionRecord latest =
                    emissionRepository
                            .findTopByCountryOrderByYearDesc(
                                    country
                            );
            model.addAttribute(
                    "latestEmission",
                    latest
            );
        }
        model.addAttribute(
                "countries",
                emissionRepository.findDistinctCountries()
        );
        return "index";
    }
}