package ma.enset.studentapp.repository;

import ma.enset.studentapp.entities.Consultation;
import ma.enset.studentapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String userName);
}
