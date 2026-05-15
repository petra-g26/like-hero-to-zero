package de.petragawellek.likeherotozero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CountriesController {

    @GetMapping("/countries")
    public String countriesPage() {

        return "countries";
    }
}