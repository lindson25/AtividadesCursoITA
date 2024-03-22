package atividade3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;

public class ProdutoComTamanhoTest {
	@Test
	void testEquals() {
		ProdutoComTamanho produto1 = new ProdutoComTamanho("Produto A", 1, 10.0, "P");
		ProdutoComTamanho produto2 = new ProdutoComTamanho("Produto B", 1, 20.0, "M");

		assertNotEquals(produto1, produto2);
	}

	@Test
	void testHashCode() {
		ProdutoComTamanho produto = new ProdutoComTamanho("Produto A", 1, 10.0, "P");
		assertEquals(produto.hashCode(), produto.hashCode());
	}
}
