package atividade1;

public class Pizza {
    public static int totalIngredientes = 0;
    public int quantidadeIngredientes;

    public void adicionaIngrediente(String ingrediente){
        if (ingrediente != null && !ingrediente.trim().isEmpty()) {
            quantidadeIngredientes++;
            totalIngredientes++;
        } else {
            System.out.println("Ingrediente inválido");
        }
    }

    public int getPreco(){
        if (quantidadeIngredientes <= 2) {
            return 15;
        } else if (quantidadeIngredientes >= 3 && quantidadeIngredientes <= 5){
            return 20;
        } else {
            return 23;
        }
    }

    public static int getTotalIngredientes() {
        return totalIngredientes;
    }
}

