package br.com.alurasenac.farmacia.testes;

import br.com.alurasenac.farmacia.dao.FabricanteDao;
import br.com.alurasenac.farmacia.dao.ProdutoDao;
import br.com.alurasenac.farmacia.modulo.produto.Fabricante;
import br.com.alurasenac.farmacia.modulo.produto.Produto;
import br.com.alurasenac.farmacia.util.JPAUtil;

import javax.persistence.EntityManager;

public class AdicionarAtributo {
    public static void main(String[] args) {

        Fabricante fabricante = new Fabricante("Takeda");
        Produto produto = new Produto(
                "DORFLEX",
                "Dor nas juntas",
                19.29,
                fabricante);

        EntityManager em = JPAUtil.getEntityManager();
        FabricanteDao fabricanteDao = new FabricanteDao(em);
        ProdutoDao produtoDao = new ProdutoDao(em);

        em.getTransaction().begin();
        fabricanteDao.cadastrar(fabricante);
        produtoDao.cadastrar(produto);
        em.getTransaction().commit();
        em.close();

        //Script execultado:  alter table produtos add column ativo bit not null
        //Foi inserido na tabela o campo ativo com valor 0 ou 1.

    }
}
