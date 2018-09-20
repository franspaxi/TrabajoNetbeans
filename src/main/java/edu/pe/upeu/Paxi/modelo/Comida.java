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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "comida")
@NamedQueries({
    @NamedQuery(name = "Comida.findAll", query = "SELECT c FROM Comida c")})
public class Comida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcomida")
    @Getter @Setter
    private Integer idcomida;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "desayuno")
    @Getter @Setter
    private String desayuno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "almuerzo")
    @Getter @Setter
    private String almuerzo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "cena")
    @Getter @Setter
    private String cena;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "costo")
    @Getter @Setter
    private String costo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "observaciones")
    @Getter @Setter
    private String observaciones;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcomida")
    @Getter @Setter
    private Collection<Total> totalCollection;
    @JoinColumn(name = "idpersona", referencedColumnName = "idpersona")
    @Getter @Setter
    @ManyToOne(optional = false)
    private Persona idpersona;

    public Comida() {
    }

    public Comida(Integer idcomida) {
        this.idcomida = idcomida;
    }

    public Comida(Integer idcomida, String desayuno, String almuerzo, String cena, String costo, String observaciones) {
        this.idcomida = idcomida;
        this.desayuno = desayuno;
        this.almuerzo = almuerzo;
        this.cena = cena;
        this.costo = costo;
        this.observaciones = observaciones;
    }

    public Collection<Total> getTotalCollection() {
        return totalCollection;
    }

    public void setTotalCollection(Collection<Total> totalCollection) {
        this.totalCollection = totalCollection;
    }

    public Persona getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Persona idpersona) {
        this.idpersona = idpersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcomida != null ? idcomida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comida)) {
            return false;
        }
        Comida other = (Comida) object;
        if ((this.idcomida == null && other.idcomida != null) || (this.idcomida != null && !this.idcomida.equals(other.idcomida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + idcomida;
    }
    
}
