package br.com.api.juana.enums;

public enum Genero implements EntidadeEnum{
	MASCULINO("Masculino"), FEMININO("Feminino"), NAO_BINARIO("Não-binário"), SEM_DECLARA("Sem declarar"), OUTRO("Outro");

	private String nome;

	Genero(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}