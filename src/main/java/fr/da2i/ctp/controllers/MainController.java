package fr.da2i.ctp.controllers;

import fr.da2i.ctp.repositories.LyceeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    LyceeRepository lyceeRepository;

    @GetMapping(path = "/")
    public String home(Model model) {
        model.addAttribute("lycees", lyceeRepository.findAll());
        return "saisie";
    }

}
