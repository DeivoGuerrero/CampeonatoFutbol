/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mundo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ingenieria
 */
@Entity
@Table(name = "partido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Partido.findAll", query = "SELECT p FROM Partido p"),
    @NamedQuery(name = "Partido.findById", query = "SELECT p FROM Partido p WHERE p.id = :id"),
    @NamedQuery(name = "Partido.findByFehcaHora", query = "SELECT p FROM Partido p WHERE p.fehcaHora = :fehcaHora"),
    @NamedQuery(name = "Partido.findByIdCancha", query = "SELECT p FROM Partido p WHERE p.idCancha = :idCancha"),
    @NamedQuery(name = "Partido.findByIdEquipoLocal", query = "SELECT p FROM Partido p WHERE p.idEquipoLocal = :idEquipoLocal"),
    @NamedQuery(name = "Partido.findByIdEquipoVisitante", query = "SELECT p FROM Partido p WHERE p.idEquipoVisitante = :idEquipoVisitante"),
    @NamedQuery(name = "Partido.findByIdArbitroCentral", query = "SELECT p FROM Partido p WHERE p.idArbitroCentral = :idArbitroCentral"),
    @NamedQuery(name = "Partido.findByIdArbitroL1", query = "SELECT p FROM Partido p WHERE p.idArbitroL1 = :idArbitroL1"),
    @NamedQuery(name = "Partido.findByIdArbitroL2", query = "SELECT p FROM Partido p WHERE p.idArbitroL2 = :idArbitroL2"),
    @NamedQuery(name = "Partido.findByIdArbitroAux", query = "SELECT p FROM Partido p WHERE p.idArbitroAux = :idArbitroAux")})
public class Partido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fehca_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fehcaHora;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cancha")
    private int idCancha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_equipo_local")
    private int idEquipoLocal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_equipo_visitante")
    private int idEquipoVisitante;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_arbitro_central")
    private int idArbitroCentral;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_arbitro_l1")
    private int idArbitroL1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_arbitro_l2")
    private int idArbitroL2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_arbitro_aux")
    private int idArbitroAux;

    public Partido() {
    }

    public Partido(Integer id) {
        this.id = id;
    }

    public Partido(Integer id, Date fehcaHora, int idCancha, int idEquipoLocal, int idEquipoVisitante, int idArbitroCentral, int idArbitroL1, int idArbitroL2, int idArbitroAux) {
        this.id = id;
        this.fehcaHora = fehcaHora;
        this.idCancha = idCancha;
        this.idEquipoLocal = idEquipoLocal;
        this.idEquipoVisitante = idEquipoVisitante;
        this.idArbitroCentral = idArbitroCentral;
        this.idArbitroL1 = idArbitroL1;
        this.idArbitroL2 = idArbitroL2;
        this.idArbitroAux = idArbitroAux;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFehcaHora() {
        return fehcaHora;
    }

    public void setFehcaHora(Date fehcaHora) {
        this.fehcaHora = fehcaHora;
    }

    public int getIdCancha() {
        return idCancha;
    }

    public void setIdCancha(int idCancha) {
        this.idCancha = idCancha;
    }

    public int getIdEquipoLocal() {
        return idEquipoLocal;
    }

    public void setIdEquipoLocal(int idEquipoLocal) {
        this.idEquipoLocal = idEquipoLocal;
    }

    public int getIdEquipoVisitante() {
        return idEquipoVisitante;
    }

    public void setIdEquipoVisitante(int idEquipoVisitante) {
        this.idEquipoVisitante = idEquipoVisitante;
    }

    public int getIdArbitroCentral() {
        return idArbitroCentral;
    }

    public void setIdArbitroCentral(int idArbitroCentral) {
        this.idArbitroCentral = idArbitroCentral;
    }

    public int getIdArbitroL1() {
        return idArbitroL1;
    }

    public void setIdArbitroL1(int idArbitroL1) {
        this.idArbitroL1 = idArbitroL1;
    }

    public int getIdArbitroL2() {
        return idArbitroL2;
    }

    public void setIdArbitroL2(int idArbitroL2) {
        this.idArbitroL2 = idArbitroL2;
    }

    public int getIdArbitroAux() {
        return idArbitroAux;
    }

    public void setIdArbitroAux(int idArbitroAux) {
        this.idArbitroAux = idArbitroAux;
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
        if (!(object instanceof Partido)) {
            return false;
        }
        Partido other = (Partido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mundo.Partido[ id=" + id + " ]";
    }
    
}
