package br.com.api.juana.payloads.request;

import java.util.Objects;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EnderecoRequestPayload {
	@NotBlank(message = "{cep.not.blank}")
	@Size(min = 8, max = 8, message = "{cep.size}")
	protected String cep;

	@NotBlank(message = "{logradouro.not.blank}")
	@Size(min = 3, max = 64, message = "{logradouro.size}")
	protected String logradouro;

	@NotBlank(message = "{bairro.not.blank}")
	@Size(min = 3, max = 64, message = "{bairro.size}")
	protected String bairro;

	@NotBlank(message = "{numero.not.blank}")
	@Size(min = 3, max = 16, message = "{numero.size}")
	protected String numero;

	@NotBlank(message = "{unidadeFederativa.not.blank}")
	@Size(min = 3, max = 32, message = "{unidadeFederativa.size}")
	protected String unidadeFederativa;

	@NotBlank(message = "{cidade.not.blank}")
	@Size(min = 3, max = 32, message = "{cidade.size}")
	protected String cidade;

	@Size(min = 3, max = 64, message = "{complemento.size}")
	protected String complemento;

	public EnderecoRequestPayload(String cep, String logradouro, String bairro, String numero, String unidadeFederativa,
			String cidade, String complemento) {
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

	public String getUnidadeFederativa() {
		return unidadeFederativa;
	}

	public void setUnidadeFederativa(String unidadeFederativa) {
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

	@Override
	public int hashCode() {
		return Objects.hash(bairro, cep, cidade, complemento, logradouro, numero, unidadeFederativa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnderecoRequestPayload other = (EnderecoRequestPayload) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cep, other.cep)
				&& Objects.equals(cidade, other.cidade) && Objects.equals(complemento, other.complemento)
				&& Objects.equals(logradouro, other.logradouro) && Objects.equals(numero, other.numero)
				&& Objects.equals(unidadeFederativa, other.unidadeFederativa);
	}

	@Override
	public String toString() {
		return "EnderecoRequestPayload [cep=" + cep + ", logradouro=" + logradouro + ", bairro=" + bairro + ", numero="
				+ numero + ", unidadeFederativa=" + unidadeFederativa + ", cidade=" + cidade + ", complemento="
				+ complemento + "]";
	}

}
