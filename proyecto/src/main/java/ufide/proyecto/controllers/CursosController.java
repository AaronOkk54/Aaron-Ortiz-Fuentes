package ufide.proyecto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CursosController {
    @GetMapping("/cursos")
    public String cursos(org.springframework.ui.Model model){
    //no reconocia solo Model como un tipo
 
        model.addAttribute(
            "cursos",
            java.util.List.of(
                "Java",
                "Spring Boot",
                "Thymeleaf",
                "Bootstrap 5",
                "MySQL"
            )
        );
 
        return "cursos";
    }
}

