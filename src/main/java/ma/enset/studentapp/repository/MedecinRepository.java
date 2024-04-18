package ma.enset.studentapp.repository;
import ma.enset.studentapp.entities.Medecin;
import ma.enset.studentapp.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
     Medecin findByName(String name);
}
