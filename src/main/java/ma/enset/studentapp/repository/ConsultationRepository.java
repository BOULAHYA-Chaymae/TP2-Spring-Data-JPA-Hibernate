package ma.enset.studentapp.repository;
import ma.enset.studentapp.entities.Consultation;
import ma.enset.studentapp.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
     List<Patient> findByNameContains(String mc);
     List<Patient> findPriceGreaterThan(double price);
     @Query("select p from Patient p where p.name like :x")
     List<Patient> search(@Param("x") String mc);
}
