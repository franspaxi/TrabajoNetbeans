/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pe.upeu.Paxi.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import edu.pe.upeu.Paxi.SysDataAccess;
import edu.pe.upeu.Paxi.modelo.Persona;
/**
 *
 * @author TOSHIBA
 */
@Repository
public class PersonaDaoImpl extends SysDataAccess<Integer, Persona> implements PersonaDaoI{
    
    @SuppressWarnings("unchecked")
    
    @Override
        public List<Persona> listarEntidad(){ return getListAll();}    
    @Override
        public Persona buscarEntidadId(int id){ return getById(id);}
    @Override
        public void guardarEntidad(Persona persona){savev(persona);}
    @Override
        public void eliminarEntidad(int id){delete(id);}
    @Override
        public void modificarEntidad(Persona persona){update(persona);}
}
