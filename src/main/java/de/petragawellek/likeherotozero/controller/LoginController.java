package de.petragawellek.likeherotozero.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class LoginController {
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session,
                        Model model) {
        if (username.equals("wissenschaftler")
                && password.equals("climate2026")) {
            session.setAttribute("loggedIn", true);
            return "redirect:/scientist";
        }
        model.addAttribute(
                "errorMessage",
                "Falsche Login-Daten!"
        );
        return "login";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}