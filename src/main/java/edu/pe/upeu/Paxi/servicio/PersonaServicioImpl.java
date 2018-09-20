/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pe.upeu.Paxi.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.pe.upeu.Paxi.dao.PersonaDaoI;
import edu.pe.upeu.Paxi.modelo.Persona;

@Service
@Transactional
public class PersonaServicioImpl implements PersonaServicioI{
    @Autowired
    public PersonaDaoI dao;
    
    @Override
    public List<Persona> listarEntidad(){return dao.listarEntidad();}
    @Override
    public Persona buscarEntidadId(int id){return dao.buscarEntidadId(id);}
    @Override
    public void guardarEntidad(Persona persona){dao.guardarEntidad(persona);}
    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);}
    @Override
    public void modificarEntidad(Persona persona){dao.modificarEntidad(persona);}
}
