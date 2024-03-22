package atividade5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String arquivoPalavras = "atividade5/atividade5/palavras.txt";

		MecanicaDoJogo mecanicaDoJogo = FabricaMecanicaDoJogo.getMecanicaDoJogo(arquivoPalavras);

		while (!mecanicaDoJogo.acabou()) {
			String palavraEmbaralhada = mecanicaDoJogo.proximaPalavra();
			System.out.println("Sua palavra embaralhada é: " + palavraEmbaralhada);
			System.out.println("Digite seu palpite: ");
			String palpite = scanner.nextLine().trim();

			if (mecanicaDoJogo.tentarPalpite(palpite)) {
				System.out.println("Parabéns, você acertou!");
			} else {
				System.out.println("Ops, você errou!");
			}
		}
		scanner.close();
	}
}
