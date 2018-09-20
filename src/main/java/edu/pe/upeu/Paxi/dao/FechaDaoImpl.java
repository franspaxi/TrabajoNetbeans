/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pe.upeu.Paxi.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import edu.pe.upeu.Paxi.SysDataAccess;
import edu.pe.upeu.Paxi.modelo.Fecha;
/**
 *
 * @author TOSHIBA
 */
@Repository
public class FechaDaoImpl extends SysDataAccess<Integer, Fecha> implements FechaDaoI{
   
    @SuppressWarnings("unchecked")
    
    @Override
        public List<Fecha> listarEntidad(){ return getListAll();}    
    @Override
        public Fecha buscarEntidadId(int id){ return getById(id);}
    @Override
        public void guardarEntidad(Fecha fecha){savev(fecha);}
    @Override
        public void eliminarEntidad(int id){delete(id);}
    @Override
        public void modificarEntidad(Fecha fecha){update(fecha);}
}
