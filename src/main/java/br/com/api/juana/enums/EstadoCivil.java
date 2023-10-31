package br.com.api.juana.enums;

public enum EstadoCivil implements EntidadeEnum {
	SOLTEIRO("Solteiro(a)"), CASADO("Casado(a)"), UNIAO_ESTAVEL("União estável"), VIUVO("Viúvo(a)"),
	DIVORCIADO("Divorciado(a)");

	private String nome;

	EstadoCivil(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
