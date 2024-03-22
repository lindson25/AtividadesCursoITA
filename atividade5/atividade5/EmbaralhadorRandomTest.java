package atividade5;

import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class EmbaralhadorRandomTest {

	@Test
	public void testEmbaralhar() {
		String palavraOriginal = "teste";

		Embaralhador embaralhador = new EmbaralhadorRandom();

		String palavraEmbaralhada = embaralhador.embaralhar(palavraOriginal);

		assertNotEquals(palavraOriginal, palavraEmbaralhada);
	}
}
