package atividade4;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class AutoridadeTest {
	
	@Test
	public void testInformal() {
		Autoridade autoridade = new Autoridade("Neymar", "Júnior", new InformalFormatador());
		assertEquals("Neymar", autoridade.getTratamento());
	}

	@Test
	public void testRespeitosoMasculino() {
		Autoridade autoridade = new Autoridade("Felipe", "Silva", new RespeitosoFormatador("M"));
		assertEquals("Sr. Silva", autoridade.getTratamento());
	}

	@Test
	public void testRespeitosoFeminino() {
		Autoridade autoridade = new Autoridade("Jurema", "Souza", new RespeitosoFormatador("F"));
		assertEquals("Sra. Souza", autoridade.getTratamento());
	}

	@Test
	public void testComTitulo() {
		Autoridade autoridade = new Autoridade("Airton", "Senna", new ComTituloFormatador("Rei"));
		assertEquals("Rei Airton Senna", autoridade.getTratamento());
	}
}
