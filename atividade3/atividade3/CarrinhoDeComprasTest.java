package atividade3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CarrinhoDeComprasTest {
	@Test
	void testAdicionaProduto() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		ProdutoComTamanho produto = new ProdutoComTamanho("Produto A", 1, 10.0, "Tamanho P");

		carrinho.adicionaProduto(produto, 2);
		assertEquals(2, carrinho.getQuantidadeProduto(produto));
	}

	@Test
	void testRemoveProduto() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		ProdutoComTamanho produto = new ProdutoComTamanho("Produto A", 1, 10.0, "Tamanho P");

		carrinho.adicionaProduto(produto, 3);
		carrinho.removeProduto(produto, 2);
		assertEquals(1, carrinho.getQuantidadeProduto(produto));
	}

	@Test
	void testCalculaValorTotal() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		ProdutoComTamanho produto1 = new ProdutoComTamanho("Produto A", 1, 10.0, "Tamanho P");
		ProdutoComTamanho produto2 = new ProdutoComTamanho("Produto B", 2, 20.0, "Tamanho M");

		carrinho.adicionaProduto(produto1, 2);
		carrinho.adicionaProduto(produto2, 1);

		assertEquals(40.0, carrinho.calcularTotalCompra());
	}
}
