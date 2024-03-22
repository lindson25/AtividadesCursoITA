package atividade5;

class MecanicaDoJogoBasica implements MecanicaDoJogo {
	private BancoDePalavras bancoDePalavras;
	private Embaralhador embaralhador;

	private String palavraAtual;

	public MecanicaDoJogoBasica(Embaralhador embaralhador, BancoDePalavras bancoDePalavras) {
		this.embaralhador = embaralhador;
		this.bancoDePalavras = bancoDePalavras;
	}

	@Override
	public String proximaPalavra() {
		palavraAtual = bancoDePalavras.obterPalavraAleatoria();
		return embaralhador.embaralhar(palavraAtual);
	}

	@Override
	public boolean acabou() {
		return bancoDePalavras.estaVazio();
	}

	@Override
	public boolean tentarPalpite(String palpite) {
		if (palpite.equalsIgnoreCase(palavraAtual)) {
			return true;
		}
		return false;
	}
}
