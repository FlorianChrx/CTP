package fr.da2i.ctp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(path = "/")
    public String home(Model model) {
        model.addAttribute("test", "Hello bitches");
        return "index";
    }

}
