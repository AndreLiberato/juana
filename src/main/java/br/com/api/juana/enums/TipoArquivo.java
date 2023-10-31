package br.com.api.juana.enums;

public enum TipoArquivo implements EntidadeEnum {
	LAUDO("Laúdo"), RECEITA("Receita"), REGISTROGERAL("Registro geral"), REGISTROPROFISSIONAL("Registro profissional");

	private String nome;

	TipoArquivo(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
