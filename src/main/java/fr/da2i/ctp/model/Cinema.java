package fr.da2i.ctp.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Cinema {
    @Id
    private int id;
    private String nom;
}
