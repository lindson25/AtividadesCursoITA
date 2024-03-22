package atividade3;

public class ProdutoComTamanho extends Produto {

	private String tamanho;

	public ProdutoComTamanho(String nome, int codigo, double preco, String tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ProdutoComTamanho)) {
			return false;
		}
		if (!super.equals(o)) {
			return false;
		}
		ProdutoComTamanho that = (ProdutoComTamanho) o;
		return tamanho.equals(that.tamanho);
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + tamanho.hashCode();
		return result;
	}
}
