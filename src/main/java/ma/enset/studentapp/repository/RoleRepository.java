package ma.enset.studentapp.repository;

import ma.enset.studentapp.entities.Consultation;
import ma.enset.studentapp.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RoleRepository extends JpaRepository<Role, String> {
 Role findByRoleName(String roleName);

}
