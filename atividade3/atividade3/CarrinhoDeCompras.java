package atividade3;

import java.util.HashMap;

public class CarrinhoDeCompras {
	private HashMap<ProdutoComTamanho, Integer> produtosNoCarrinho;

	public CarrinhoDeCompras() {
		this.produtosNoCarrinho = new HashMap<>();
	}

	public void adicionaProduto(ProdutoComTamanho produto, int quantidade) {
		if (produtosNoCarrinho.containsKey(produto)) {
			int quantidadeAtual = produtosNoCarrinho.get(produto);
			produtosNoCarrinho.put(produto, quantidadeAtual + quantidade);
		} else {
			produtosNoCarrinho.put(produto, quantidade);
		}
	}

	public void removeProduto(ProdutoComTamanho produto, int quantidade) {
		if (produtosNoCarrinho.containsKey(produto)) {
			int quantidadeAtual = produtosNoCarrinho.get(produto);
			if (quantidadeAtual > quantidade) {
				produtosNoCarrinho.put(produto, quantidadeAtual - quantidade);
			} else {
				produtosNoCarrinho.remove(produto);
			}
		}
	}

	public double calcularTotalCompra() {
		double total = 0;
		for (ProdutoComTamanho produto : produtosNoCarrinho.keySet()) {
			int quantidade = produtosNoCarrinho.get(produto);
			total += produto.getPreco() * quantidade;
		}
		return total;
	}

	public int getQuantidadeProduto(ProdutoComTamanho produto) {
		return produtosNoCarrinho.getOrDefault(produto, 0);
	}
}
