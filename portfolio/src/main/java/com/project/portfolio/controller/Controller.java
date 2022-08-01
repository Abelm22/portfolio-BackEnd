/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.portfolio.controller;
import com.project.portfolio.model.Persona;
import com.project.portfolio.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
@Autowired
private IPersonaService persoServ;


@PostMapping ("new/persona")
public void agregarPersona(@RequestBody Persona pers) {
    persoServ.crearPersona(pers);
}

@GetMapping ("ver/personas")
public List<Persona> verPersonas () {
    return persoServ.verPersonas();
}

@DeleteMapping ("delete/{id}")
public void borrarPersona (@PathVariable Long Id) {
    persoServ.borrarPersona(Id);
}

}
