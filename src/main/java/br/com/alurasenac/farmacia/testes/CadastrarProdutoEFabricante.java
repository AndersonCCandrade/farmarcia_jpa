package br.com.alurasenac.farmacia.testes;

import br.com.alurasenac.farmacia.dao.FabricanteDao;
import br.com.alurasenac.farmacia.dao.ProdutoDao;
import br.com.alurasenac.farmacia.modulo.produto.Fabricante;
import br.com.alurasenac.farmacia.modulo.produto.Produto;
import br.com.alurasenac.farmacia.util.JPAUtil;

import javax.persistence.EntityManager;

public class CadastrarProdutoEFabricante {
    public static void main(String[] args) {

        Fabricante fabricante = new Fabricante("Bayer");
        Fabricante fabricante1 = new Fabricante("Medley");
        Fabricante fabricante2 = new Fabricante("Aché");

        Produto produto = new Produto(
                "Aspirina",
                "Contra dor de cabeça",
                9.69,
                fabricante);

        Produto produto1 = new Produto(
                "Dipirona Sódica",
                "Contra dor de cabeça",
                20.45,
                fabricante1);

        Produto produto2 = new Produto(
                "Decladron",
                "Colírio",
                15.51,
                fabricante2);

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);
        FabricanteDao fabricanteDao = new FabricanteDao(em);

        em.getTransaction().begin();

        fabricanteDao.cadastrar(fabricante);
        fabricanteDao.cadastrar(fabricante1);
        fabricanteDao.cadastrar(fabricante2);
        produtoDao.cadastrar(produto);
        produtoDao.cadastrar(produto1);
        produtoDao.cadastrar(produto2);

        em.getTransaction().commit();
        em.close();

    }
}
