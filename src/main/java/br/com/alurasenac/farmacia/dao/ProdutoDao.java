package br.com.alurasenac.farmacia.dao;

import br.com.alurasenac.farmacia.modulo.produto.Produto;

import javax.persistence.EntityManager;
import java.util.List;

public class ProdutoDao {
    private EntityManager em;
    public ProdutoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Produto produto){
        this.em.persist(produto);
    }

    public List<Produto> listarTodos(){
        String jpql = "SELECT p FROM Produto  p";
        return em.createQuery(jpql, Produto.class).getResultList();
    }
}
