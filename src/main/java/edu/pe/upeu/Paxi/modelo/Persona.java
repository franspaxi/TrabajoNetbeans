/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pe.upeu.Paxi.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author TOSHIBA
 */
@Entity
@Table(name = "persona")
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "idpersona")
    @Getter @Setter
    private Integer idpersona;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    @Getter @Setter
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "apellido")
    @Getter @Setter
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "dni")
    @Getter @Setter
    private String dni;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "telefono")
    @Getter @Setter
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "carrera")
    @Getter @Setter
    private String carrera;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpersona")
    private Collection<Fecha> fechaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpersona")
    private Collection<Total> totalCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpersona")
    private Collection<Comida> comidaCollection;

    public Persona() {
    }

    public Persona(Integer idpersona) {
        this.idpersona = idpersona;
    }

    public Persona(Integer idpersona, String nombre, String apellido, String dni, String telefono, String carrera) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.carrera = carrera;
    }

    public Collection<Fecha> getFechaCollection() {
        return fechaCollection;
    }

    public void setFechaCollection(Collection<Fecha> fechaCollection) {
        this.fechaCollection = fechaCollection;
    }

    public Collection<Total> getTotalCollection() {
        return totalCollection;
    }

    public void setTotalCollection(Collection<Total> totalCollection) {
        this.totalCollection = totalCollection;
    }

    public Collection<Comida> getComidaCollection() {
        return comidaCollection;
    }

    public void setComidaCollection(Collection<Comida> comidaCollection) {
        this.comidaCollection = comidaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpersona != null ? idpersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.idpersona == null && other.idpersona != null) || (this.idpersona != null && !this.idpersona.equals(other.idpersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + idpersona ;
    }
    
}
