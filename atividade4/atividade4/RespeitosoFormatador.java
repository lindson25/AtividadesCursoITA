package atividade4;

public class RespeitosoFormatador implements FormatadorNome {

	private String sexo;

	public RespeitosoFormatador(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if ("F".equals(this.sexo)) {
			return "Sra. " + sobrenome;
		} else if ("M".equals(this.sexo)) {
			return "Sr. " + sobrenome;
		} else {
			return "Sexo inválido.";
		}
	}
}
