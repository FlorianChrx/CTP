package fr.da2i.ctp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
public class Visiteur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vno;
    private String prenom;
    private String nom;
    private String ip;
    @ManyToOne
    @JoinColumn(name="lno")
    private Lycee lycee;

    public Visiteur(String nom, String prenom, Lycee lycee, String remoteAddr) {
        this.nom = nom;
        this.prenom = prenom;
        this.ip = remoteAddr;
        this.lycee = lycee;
    }
}
