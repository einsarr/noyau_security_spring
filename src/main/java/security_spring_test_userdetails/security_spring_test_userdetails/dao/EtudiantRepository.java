package security_spring_test_userdetails.security_spring_test_userdetails.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import security_spring_test_userdetails.security_spring_test_userdetails.model.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
