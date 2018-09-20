/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pe.upeu.Paxi.dao;

import edu.pe.upeu.Paxi.SysDataAccess;
import edu.pe.upeu.Paxi.modelo.Comida;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author TOSHIBA
 */
@Repository
public class ComidaDaoImpl extends SysDataAccess<Integer, Comida> implements ComidaDaoI{
   @SuppressWarnings("unchecked")
    
    @Override
        public List<Comida> listarEntidad(){ return getListAll();}    
    @Override
        public Comida buscarEntidadId(int id){ return getById(id);}
    @Override
        public void guardarEntidad(Comida comida){savev(comida);}
    @Override
        public void eliminarEntidad(int id){delete(id);}
    @Override
        public void modificarEntidad(Comida comida){update(comida);}
    
}
