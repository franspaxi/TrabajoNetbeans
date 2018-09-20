/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pe.upeu.Paxi.servicio;

import edu.pe.upeu.Paxi.modelo.Total;
import java.util.List;

/**
 *
 * @author TOSHIBA
 */
public interface TotalServicioI {
    public List<Total> listarEntidad();
    public Total buscarEntidadId(int id);
    public void guardarEntidad(Total total);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Total total); 
}
