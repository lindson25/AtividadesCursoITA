package atividade1;

public class Main {
	public static void main(String[] args) {
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("Queijo");
		pizza1.adicionaIngrediente("Tomate");

		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("Queijo");
		pizza2.adicionaIngrediente("Tomate");
		pizza2.adicionaIngrediente("Presunto");

		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("Queijo");
		pizza3.adicionaIngrediente("Tomate");
		pizza3.adicionaIngrediente("Cebola");

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaPizza(pizza1);
		carrinho.adicionaPizza(pizza2);
		carrinho.adicionaPizza(pizza3);

		System.out.println("Total do Carrinho: R$" + carrinho.getTotal());

		System.out.println("Total de ingredientes utilizados em todas as pizzas: " + Pizza.getTotalIngredientes());
	}
}
