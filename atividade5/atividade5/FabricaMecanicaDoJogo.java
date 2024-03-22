package atividade5;

public class FabricaMecanicaDoJogo {
	public static MecanicaDoJogo getMecanicaDoJogo(String arquivoPalavras) {
		BancoDePalavras bancoDePalavras = new BancoDePalavras(arquivoPalavras);
		return new MecanicaDoJogoBasica(new EmbaralhadorRandom(), bancoDePalavras);
	}
}
