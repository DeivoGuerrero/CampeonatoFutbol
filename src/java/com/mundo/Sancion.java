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
@Table(name = "sancion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sancion.findAll", query = "SELECT s FROM Sancion s"),
    @NamedQuery(name = "Sancion.findById", query = "SELECT s FROM Sancion s WHERE s.id = :id"),
    @NamedQuery(name = "Sancion.findByIdPartido", query = "SELECT s FROM Sancion s WHERE s.idPartido = :idPartido"),
    @NamedQuery(name = "Sancion.findByIdEquipoJugador", query = "SELECT s FROM Sancion s WHERE s.idEquipoJugador = :idEquipoJugador"),
    @NamedQuery(name = "Sancion.findByIdTipoSancion", query = "SELECT s FROM Sancion s WHERE s.idTipoSancion = :idTipoSancion")})
public class Sancion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_partido")
    private int idPartido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_equipo_jugador")
    private int idEquipoJugador;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tipo_sancion")
    private int idTipoSancion;

    public Sancion() {
    }

    public Sancion(Integer id) {
        this.id = id;
    }

    public Sancion(Integer id, int idPartido, int idEquipoJugador, int idTipoSancion) {
        this.id = id;
        this.idPartido = idPartido;
        this.idEquipoJugador = idEquipoJugador;
        this.idTipoSancion = idTipoSancion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public int getIdEquipoJugador() {
        return idEquipoJugador;
    }

    public void setIdEquipoJugador(int idEquipoJugador) {
        this.idEquipoJugador = idEquipoJugador;
    }

    public int getIdTipoSancion() {
        return idTipoSancion;
    }

    public void setIdTipoSancion(int idTipoSancion) {
        this.idTipoSancion = idTipoSancion;
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
        if (!(object instanceof Sancion)) {
            return false;
        }
        Sancion other = (Sancion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mundo.Sancion[ id=" + id + " ]";
    }
    
}
