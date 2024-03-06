package br.com.alurasenac.farmacia.testes;

import br.com.alurasenac.farmacia.dao.FabricanteDao;
import br.com.alurasenac.farmacia.dao.ProdutoDao;
import br.com.alurasenac.farmacia.modulo.produto.Fabricante;
import br.com.alurasenac.farmacia.modulo.produto.Produto;
import br.com.alurasenac.farmacia.util.JPAUtil;

import javax.persistence.EntityManager;

public class DeletarProduto {
    public static void main(String[] args) {

        Fabricante fabricante = new Fabricante("Neo Quimica");
        Produto produto = new Produto(
                "Buscopan",
                "Dores abdominais",
                35.00,
                fabricante);

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);
        FabricanteDao fabricanteDao = new FabricanteDao(em);

        em.getTransaction().begin();

        fabricanteDao.cadastrar(fabricante);
        produtoDao.cadastrar(produto);

        em.flush();
        em.clear();

        produtoDao.remover(produto);
        em.getTransaction().commit();
        em.close();
    }
}
