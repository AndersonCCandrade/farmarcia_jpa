package br.com.alurasenac.farmacia.modulo.produto;

import javax.persistence.*;

@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    private String descricao;
    private double preco;
    @ManyToOne(fetch = FetchType.LAZY)
    private Fabricante fabricante;
    private boolean ativo;

    public Produto() {
    }
    public Produto(String name, String descricao, double preco, Fabricante fabricante) {
        this.name = name;
        this.descricao = descricao;
        this.preco = preco;
        this.fabricante = fabricante;
        this.ativo = true;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Produto:  " +
                "iD: " + id +
                " NOME: " + name +
                " DESCRIÇÃO: " + descricao +
                " PREÇO: R$" + preco +
                " FABRICANTE:" + fabricante;
    }
}
