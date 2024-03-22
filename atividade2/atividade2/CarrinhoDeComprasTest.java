package atividade2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CarrinhoDeComprasTest {
    @Test
    public void testAdicionaPizza() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();

        carrinho.adicionaPizza(pizza1);
        assertEquals(0, carrinho.getTotal());

        pizza2.adicionaIngrediente("Queijo");
        carrinho.adicionaPizza(pizza2);
        assertEquals(15, carrinho.getTotal());
    }

    @Test
    public void testAdicionaPizzaInvalida() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        carrinho.adicionaPizza(null);
        assertEquals(0, carrinho.getTotal());
    }
}