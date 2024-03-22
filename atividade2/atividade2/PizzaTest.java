package atividade2;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PizzaTest {

    @Before
    public void before() {
        Pizza.resetIngredientes();
    }

    @After
    public void after() {
        Pizza.resetIngredientes();
    }

    @Test
    public void testAdicionaIngrediente() {
        Pizza pizza = new Pizza();

        pizza.adicionaIngrediente("Queijo");
        assertEquals(1, pizza.quantidadeIngredientes);
        assertEquals(1, Pizza.getTotalIngredientes());

        pizza.adicionaIngrediente("Tomate");
        assertEquals(2, pizza.quantidadeIngredientes);
        assertEquals(2, Pizza.getTotalIngredientes());
    }

    @Test
    public void testAdicionaIngredienteInvalido() {
        Pizza pizza = new Pizza();

        pizza.adicionaIngrediente(null);
        assertEquals(0, pizza.quantidadeIngredientes);
        assertEquals(0, Pizza.getTotalIngredientes());

        pizza.adicionaIngrediente("");
        assertEquals(0, pizza.quantidadeIngredientes);
        assertEquals(0, Pizza.getTotalIngredientes());
    }

    @Test
    public void testGetPreco() {
        Pizza pizza = new Pizza();

        assertEquals(0, pizza.getPreco());

        pizza.adicionaIngrediente("Queijo");
        assertEquals(15, pizza.getPreco());

        pizza.adicionaIngrediente("Tomate");
        assertEquals(15, pizza.getPreco());

        pizza.adicionaIngrediente("Pepperoni");
        assertEquals(20, pizza.getPreco());

        pizza.adicionaIngrediente("Cogumelos");
        pizza.adicionaIngrediente("Azeitonas");
        pizza.adicionaIngrediente("Cebola");
        assertEquals(23, pizza.getPreco());
    }
}
