package atividade3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProdutoTest {
	@Test
	void testEquals() {
		Produto produto1 = new Produto("Produto A", 1, 10.0);
		Produto produto2 = new Produto("Produto B", 1, 20.0);

		assertEquals(produto1, produto2);
	}

	@Test
	void testHashCode() {
		Produto produto = new Produto("Produto A", 1, 10.0);
		assertEquals(1, produto.hashCode());
	}
}
