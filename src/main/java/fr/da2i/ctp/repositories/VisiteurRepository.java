package fr.da2i.ctp.repositories;

import fr.da2i.ctp.model.Visiteur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisiteurRepository extends CrudRepository<Visiteur, Integer> {
    public Iterable<Visiteur> findByIp(String ip);
}
