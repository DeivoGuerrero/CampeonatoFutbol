/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import com.mundo.Gol;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ingenieria
 */
@Stateless
public class GolFacade extends AbstractFacade<Gol> {
    @PersistenceContext(unitName = "CampeonatoFutbolPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GolFacade() {
        super(Gol.class);
    }
    
}
