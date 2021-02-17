package fr.da2i.ctp.repositories;

import fr.da2i.ctp.model.Lycee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LyceeRepository extends CrudRepository<Lycee, Integer> {
}
