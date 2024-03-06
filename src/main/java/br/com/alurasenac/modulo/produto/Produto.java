package br.com.alurasenac.modulo.produto;

public class Produto {
    private Long id;
    private String name;
    private String descricao;
    private double preco;
    private Fabricante fabricante;

    public Produto(String name, String descricao, double preco, Fabricante fabricante) {
        this.name = name;
        this.descricao = descricao;
        this.preco = preco;
        this.fabricante = fabricante;
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
}
