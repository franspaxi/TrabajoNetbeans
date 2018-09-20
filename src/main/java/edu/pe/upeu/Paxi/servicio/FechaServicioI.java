/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pe.upeu.Paxi.servicio;

import java.util.List;
import edu.pe.upeu.Paxi.modelo.Fecha;
/**
 *
 * @author TOSHIBA
 */
public interface FechaServicioI {
    public List<Fecha> listarEntidad();
    public Fecha buscarEntidadId(int id);
    public void guardarEntidad(Fecha fecha);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Fecha fecha);
}
