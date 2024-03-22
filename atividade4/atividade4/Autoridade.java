package atividade4;

public class Autoridade {
	public String nome;
	public String sobrenome;
	FormatadorNome formatador;

	public Autoridade(String nome, String sobrenome, FormatadorNome formatador) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.formatador = formatador;
	}

	public String getTratamento() {
		return formatador.formatarNome(nome, sobrenome);
	}
}
