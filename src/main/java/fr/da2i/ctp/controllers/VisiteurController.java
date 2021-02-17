package fr.da2i.ctp.controllers;

import fr.da2i.ctp.model.Lycee;
import fr.da2i.ctp.model.Visiteur;
import fr.da2i.ctp.repositories.LyceeRepository;
import fr.da2i.ctp.repositories.VisiteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class VisiteurController {

    @Autowired
    private VisiteurRepository visiteurRepository;

    @Autowired
    private LyceeRepository lyceeRepository;

    @Autowired
    private HttpServletRequest request;

    @GetMapping(path = "/add")
    public String addVisiteur(Model model, @RequestParam String nom, @RequestParam String prenom, @RequestParam Integer lycee) {
        if(List.of(visiteurRepository.findByIp(request.getRemoteAddr())).size() != 1) return "error";
        visiteurRepository.save(new Visiteur(nom, prenom, lyceeRepository.findById(lycee).get(), request.getRemoteAddr()));
        return "done";
    }
}
