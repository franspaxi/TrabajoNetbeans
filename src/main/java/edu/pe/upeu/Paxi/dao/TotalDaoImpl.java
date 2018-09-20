/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pe.upeu.Paxi.dao;

import edu.pe.upeu.Paxi.SysDataAccess;
import edu.pe.upeu.Paxi.modelo.Total;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author TOSHIBA
 */
@Repository
public class TotalDaoImpl extends SysDataAccess<Integer, Total> implements TotalDaoI{
    @SuppressWarnings("unchecked")
    
    @Override
        public List<Total> listarEntidad(){ return getListAll();}    
    @Override
        public Total buscarEntidadId(int id){ return getById(id);}
    @Override
        public void guardarEntidad(Total total){savev(total);}
    @Override
        public void eliminarEntidad(int id){delete(id);}
    @Override
        public void modificarEntidad(Total total){update(total);}
}
