import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Pedido;
import org.example.Produto;

public class PedidoTest {

    // Teste para verificar se o método adicionarProduto adiciona corretamente um produto ao pedido
    @Test
    public void testAdicionarProduto() {
        Pedido pedido = new Pedido("Cliente");
        Produto produto = new Produto("Hambúrguer", 10.0, "Sanduíches", true);
        pedido.adicionarProduto(produto);
        List<Produto> produtos = pedido.getProdutos();
        assertEquals(1, produtos.size());
        assertEquals(produto, produtos.get(0));
    }

    // Teste para verificar se o método removerProduto remove corretamente um produto do pedido
    @Test
    public void testRemoverProduto() {
        Pedido pedido = new Pedido("Cliente");
        Produto produto1 = new Produto("Hambúrguer", 10.0, "Sanduíches", true);
        Produto produto2 = new Produto("Refrigerante", 5.0, "Bebidas", true);
        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        pedido.removerProduto(produto1);
        List<Produto> produtos = pedido.getProdutos();
        assertEquals(1, produtos.size());
        assertEquals(produto2, produtos.get(0));
    }

    // Teste para verificar se o método getValorTotal retorna o valor total corretamente
    @Test
    public void testGetValorTotal() {
        Pedido pedido = new Pedido("Cliente");
        Produto produto1 = new Produto("Hambúrguer", 10.0, "Sanduíches", true);
        Produto produto2 = new Produto("Refrigerante", 5.0, "Bebidas", true);
        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        assertEquals(15.0, pedido.getValorTotal());
    }
}