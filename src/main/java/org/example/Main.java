package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Instanciando novos produtos
        Produto produto01 = new Produto("Coxinha", 18.45, "Salgados", true);
        Produto produto02 = new Produto("Guaraviton", 9.9, "Bebidas", true);
        Produto produto03 = new Produto("Biscoito Globo", 5.9, "Biscoitos", true);

        // Pedido
        Pedido pedido = new Pedido("Alysson");
        pedido.adicionarProduto(produto01);
        pedido.adicionarProduto(produto02);
        pedido.adicionarProduto(produto03);

        // Retorno dos pedidos e valores
        System.out.println("\nProdutos no pedido:");
        for (Produto produto: pedido.getProdutos()) {
            System.out.println("- " + produto.getNome() + ": R$ " + produto.getPreco());
        }
        System.out.println("Valor total do pedido: R$" + pedido.getValorTotal());
    }
}