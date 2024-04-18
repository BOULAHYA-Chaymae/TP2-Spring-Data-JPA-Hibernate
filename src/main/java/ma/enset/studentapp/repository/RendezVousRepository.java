package ma.enset.studentapp.repository;
import ma.enset.studentapp.entities.Patient;
import ma.enset.studentapp.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RendezVousRepository extends JpaRepository<RendezVous, String> {
}
