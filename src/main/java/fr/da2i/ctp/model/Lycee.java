package fr.da2i.ctp.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Lycee implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lno;
    private String codepostal;
    private String commune;
    private String nom;

    @OneToMany(mappedBy="lycee")
    private List<Visiteur> visiteurs;
}