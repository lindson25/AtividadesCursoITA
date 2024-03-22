package atividade2;

public class CarrinhoDeCompras {
    public int total;

    public void adicionaPizza(Pizza pizza) {
        if (pizza != null && pizza.getPreco() > 0) {
            total += pizza.getPreco();
        } else {
            System.out.println("Pizza inválida");
        }
    }

    public int getTotal() {
        return total;
    }
}