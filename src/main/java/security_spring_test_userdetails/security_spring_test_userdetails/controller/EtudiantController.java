package security_spring_test_userdetails.security_spring_test_userdetails.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/medecin")
public class EtudiantController {
    @RequestMapping("/etudiants")
    public String home(){
        return "etudiants";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/all")
    public String all(){
        return "login";
    }
    @RequestMapping("/add")
    public String add(){
        return "add";
    }
}
