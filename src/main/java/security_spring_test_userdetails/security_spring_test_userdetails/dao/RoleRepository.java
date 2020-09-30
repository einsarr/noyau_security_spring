package security_spring_test_userdetails.security_spring_test_userdetails.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import security_spring_test_userdetails.security_spring_test_userdetails.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
