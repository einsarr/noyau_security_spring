package security_spring_test_userdetails.security_spring_test_userdetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import security_spring_test_userdetails.security_spring_test_userdetails.dao.UtilisateurRepository;
import security_spring_test_userdetails.security_spring_test_userdetails.model.Utilisateur;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Utilisateur u = utilisateurRepository.findByUsername(username);
        return u;
    }
}
