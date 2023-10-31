package br.com.api.juana.enums;

public enum FormacaoAcademica implements EntidadeEnum {
	GRADUACAO("Graduação"), MESTRADO("Mestrado"), DOUTORADO("Doutorado"), POSGRADUCAO("Pós-graduação");

	private String nome;

	FormacaoAcademica(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
