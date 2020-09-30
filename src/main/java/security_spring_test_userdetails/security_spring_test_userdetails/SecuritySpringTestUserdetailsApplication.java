package security_spring_test_userdetails.security_spring_test_userdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;
import security_spring_test_userdetails.security_spring_test_userdetails.dao.UtilisateurRepository;

@SpringBootApplication
public class SecuritySpringTestUserdetailsApplication implements CommandLineRunner {
    @Autowired
    PasswordEncoder passwordEncoder;
    public static void main(String[] args) {
        SpringApplication.run(SecuritySpringTestUserdetailsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(passwordEncoder.encode("passer"));
    }
}
