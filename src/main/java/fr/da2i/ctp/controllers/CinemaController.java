package fr.da2i.ctp.controllers;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public class CinemaController
{
    @GetMapping
    public String getCinemas(Model model) {
        return "index";
    }
}
