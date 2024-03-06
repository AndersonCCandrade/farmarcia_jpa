package br.com.alurasenac.farmacia.dao;

import br.com.alurasenac.farmacia.modulo.produto.Fabricante;

import javax.persistence.EntityManager;

public class FabricanteDao {
    private EntityManager em;
    public FabricanteDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Fabricante fabricante){
        this.em.persist(fabricante);
    }
}
