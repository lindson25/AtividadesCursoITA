package atividade5;

public class EmbaralhadorRandom implements Embaralhador {
	@Override
	public String embaralhar(String palavra) {
		char[] caracteres = palavra.toCharArray();
		for (int i = 0; i < caracteres.length; i++) {
			int j = (int) (Math.random() * caracteres.length);
			char temp = caracteres[i];
			caracteres[i] = caracteres[j];
			caracteres[j] = temp;
		}
		return new String(caracteres);
	}
}
