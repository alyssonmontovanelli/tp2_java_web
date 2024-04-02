package org.example;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String cliente;
    private List<Produto> produtos;
    private double valorTotal;

    public Pedido(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        valorTotal += produto.getPreco();
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
        valorTotal -= produto.getPreco();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
