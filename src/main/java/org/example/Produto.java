package org.example;

public class Produto {
    private String nome;
    private double preco;
    private String categoria;
    private boolean disponivel;

    public Produto(String nome, double preco, String categoria, boolean disponivel) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.disponivel = disponivel;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String exibirInformacoes() {
        return "Nome: " + nome + ", Preço: R$" + preco + ", Categoria: " + categoria + ", Disponível: " + (disponivel ? "Sim" : "Não");
    }
}