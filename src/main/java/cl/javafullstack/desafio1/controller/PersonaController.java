package cl.javafullstack.desafio1.controller;

import cl.javafullstack.desafio1.model.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/persona")
public class PersonaController {

    @GetMapping("/{nombre}/{apellido}/{edad}")
    public String getPersona(@PathVariable("nombre") String nombre, @PathVariable("apellido") String apellido, @PathVariable("edad") int edad, Model model) {
        Persona persona = new Persona(nombre, apellido, edad);
        model.addAttribute("persona",persona);
        System.out.println(persona.toString());
        return "persona";
    }

}
