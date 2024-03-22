package atividade5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoDePalavras {
	private List<String> palavras;

	public BancoDePalavras(String arquivoPalavras) {
		this.palavras = carregarPalavras(arquivoPalavras);
	}

	private List<String> carregarPalavras(String arquivoPalavras) {
		List<String> palavras = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(arquivoPalavras))) {
			String linha;
			while ((linha = br.readLine()) != null) {
				palavras.add(linha.trim());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return palavras;
	}

	public String obterPalavraAleatoria() {
		Random random = new Random();
		return palavras.get(random.nextInt(palavras.size()));
	}

	public boolean estaVazio() {
		return palavras.isEmpty();
	}
}
