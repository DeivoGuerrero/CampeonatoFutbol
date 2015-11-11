/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mundo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ingenieria
 */
@Entity
@Table(name = "equipo_jugador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EquipoJugador.findAll", query = "SELECT e FROM EquipoJugador e"),
    @NamedQuery(name = "EquipoJugador.findById", query = "SELECT e FROM EquipoJugador e WHERE e.id = :id"),
    @NamedQuery(name = "EquipoJugador.findByIdEquipo", query = "SELECT e FROM EquipoJugador e WHERE e.idEquipo = :idEquipo"),
    @NamedQuery(name = "EquipoJugador.findByIdJugador", query = "SELECT e FROM EquipoJugador e WHERE e.idJugador = :idJugador")})
public class EquipoJugador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_equipo")
    private int idEquipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_jugador")
    private int idJugador;

    public EquipoJugador() {
    }

    public EquipoJugador(Integer id) {
        this.id = id;
    }

    public EquipoJugador(Integer id, int idEquipo, int idJugador) {
        this.id = id;
        this.idEquipo = idEquipo;
        this.idJugador = idJugador;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquipoJugador)) {
            return false;
        }
        EquipoJugador other = (EquipoJugador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mundo.EquipoJugador[ id=" + id + " ]";
    }
    
}
