package de.petragawellek.likeherotozero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScientistController {

    @GetMapping("/scientist")
    public String scientistPage() {

        return "scientist";
    }
}