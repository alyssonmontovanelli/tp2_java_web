import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Pedido;
import org.example.Produto;

public class ProdutoTest {

    // Teste para verificar se o método getNome retorna o nome corretamente
    @Test
    public void testGetNome() {
        Produto produto = new Produto("Salsichão", 10.0, "Churrasco", true);
        assertEquals("Salsichão", produto.getNome());
    }

    // Teste para verificar se o método setPreco atualiza o preço corretamente
    @Test
    public void testSetPreco() {
        Produto produto = new Produto("Hambúrguer", 10.0, "Sanduíches", true);
        produto.setPreco(15.5);
        assertEquals(15.5, produto.getPreco());
    }

    // Teste para verificar se o produto está disponível quando criado com disponibilidade verdadeira
    @Test
    public void testIsDisponivel() {
        Produto produto = new Produto("Hambúrguer", 10.0, "Sanduíches", true);
        assertEquals(true, produto.isDisponivel());
    }
}