package br.com.alurasenac.farmacia.testes;

import br.com.alurasenac.farmacia.dao.ProdutoDao;
import br.com.alurasenac.farmacia.modulo.produto.Produto;
import br.com.alurasenac.farmacia.util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class ListarTodosProdutos {
    public static void main(String[] args) {

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);

        List<Produto> produtos = produtoDao.listarTodos();
        produtos.forEach(p -> System.out.println(p.toString()));
    }
}
