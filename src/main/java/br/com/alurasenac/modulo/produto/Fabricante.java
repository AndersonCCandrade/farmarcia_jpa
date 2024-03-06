package br.com.alurasenac.modulo.produto;

public class Fabricante {
    private Long id;
    private String nome;

    public Fabricante(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
