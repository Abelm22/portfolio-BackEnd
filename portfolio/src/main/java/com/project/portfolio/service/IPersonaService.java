/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.project.portfolio.service;

import com.project.portfolio.model.Persona;
import java.util.List;

/**
 *
 * @author aagm
 */
public interface IPersonaService {
    
    public List <Persona> verPersonas ();
    public void crearPersona (Persona per);
    public void borrarPersona (Long Id);
    public Persona buscarPersona (Long Id);
    
    
}
