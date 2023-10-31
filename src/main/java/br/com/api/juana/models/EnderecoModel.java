package br.com.api.juana.models;

import br.com.api.juana.enums.UnidadeFederativa;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class EnderecoModel extends EntidadeModel {
	protected static final long serialVersionUID = 1L;

	@Column(name = "cep", nullable = false, length = 8)
	protected String cep;

	@Column(name = "logradouro", nullable = false, length = 64)
	protected String logradouro;

	@Column(name = "bairro", nullable = false, length = 64)
	protected String bairro;

	@Column(name = "numero", nullable = false, length = 16)
	protected String numero;

	@Column(name = "unidade_federativa", nullable = false, length = 32)
	@Enumerated(EnumType.STRING)
	protected UnidadeFederativa unidadeFederativa;

	@Column(name = "cidade", nullable = false, length = 32)
	protected String cidade;

	@Column(name = "complemento", length = 64)
	protected String complemento;

	public EnderecoModel() {
		super();
	}

	public EnderecoModel(String cep, String logradouro, String bairro, String numero,
			UnidadeFederativa unidadeFederativa, String cidade, String complemento) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.numero = numero;
		this.unidadeFederativa = unidadeFederativa;
		this.cidade = cidade;
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public UnidadeFederativa getUnidadeFederativa() {
		return unidadeFederativa;
	}

	public void setUnidadeFederativa(UnidadeFederativa unidadeFederativa) {
		this.unidadeFederativa = unidadeFederativa;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
