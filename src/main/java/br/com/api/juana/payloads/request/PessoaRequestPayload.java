package br.com.api.juana.payloads.request;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class PessoaRequestPayload {
	@NotBlank(message = "{nomeCompleto.not.blank}")
	@Size(min = 5, max = 128, message = "{nomeCompleto.size}")
	private String nomeCompleto;

	@NotBlank(message = "{cpf.not.blank}")
	@Size(min = 11, max = 11, message = "{cpf.size}")
	@CPF
	private String cpf;

	@Email(message = "{email.invalid}")
	@NotBlank(message = "{email.not.blank}")
	@Size(min = 3, max = 64, message = "{cpf.size}")
	private String email;

	@NotBlank(message = "{senha.not.blank}")
	@Size(min = 8, max = 255, message = "{senha.size}")
	private String senha;

	@NotBlank(message = "{confirmaSenha.not.blank}")
	@Size(min = 8, max = 255, message = "{confirmaSenha.size}")
	private String confirmaSenha;

	@Size(min = 2, max = 32, message = "{numeroRegistroGeral.size}")
	private String numeroRegistroGeral;

	@Size(min = 3, max = 32, message = "{nomeExpedidorRegistroGeral.size}")
	private String nomeExpedidorRegistroGeral;

	@Size(min = 2, max = 32, message = "{unidadeFederativaRegistroGeral.size}")
	private String unidadeFederativaRegistroGeral;

	@NotBlank(message = "{genero.not.blank}")
	@Size(min = 3, max = 16, message = "{genero.size}")
	private String genero;

	@NotBlank(message = "{unidadeFederativaNascimento.not.blank}")
	@Size(min = 2, max = 32, message = "{unidadeFederativaNascimento.size}")
	private String unidadeFederativaNascimento;

	@NotBlank(message = "{cidadeNascimento.not.blank}")
	@Size(min = 3, max = 64, message = "{cidadeNascimento.size}")
	private String cidadeNascimento;

	@NotNull(message = "{dataNascimento.not.null}")
	@Past(message = "{dataNascimento.past}")
	private LocalDate dataNascimento;

	public PessoaRequestPayload(String nomeCompleto, String cpf, String email, String senha, String confirmaSenha,
			String numeroRegistroGeral, String nomeExpedidorRegistroGeral, String unidadeFederativaRegistroGeral,
			String genero, String unidadeFederativaNascimento, String cidadeNascimento, String dataNascimento) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		this.confirmaSenha = confirmaSenha;
		this.numeroRegistroGeral = numeroRegistroGeral;
		this.nomeExpedidorRegistroGeral = nomeExpedidorRegistroGeral;
		this.unidadeFederativaRegistroGeral = unidadeFederativaRegistroGeral;
		this.genero = genero;
		this.unidadeFederativaNascimento = unidadeFederativaNascimento;
		this.cidadeNascimento = cidadeNascimento;
		this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}

	public String getNumeroRegistroGeral() {
		return numeroRegistroGeral;
	}

	public void setNumeroRegistroGeral(String numeroRegistroGeral) {
		this.numeroRegistroGeral = numeroRegistroGeral;
	}

	public String getNomeExpedidorRegistroGeral() {
		return nomeExpedidorRegistroGeral;
	}

	public void setNomeExpedidorRegistroGeral(String nomeExpedidorRegistroGeral) {
		this.nomeExpedidorRegistroGeral = nomeExpedidorRegistroGeral;
	}

	public String getUnidadeFederativaRegistroGeral() {
		return unidadeFederativaRegistroGeral;
	}

	public void setUnidadeFederativaRegistroGeral(String unidadeFederativaRegistroGeral) {
		this.unidadeFederativaRegistroGeral = unidadeFederativaRegistroGeral;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getUnidadeFederativaNascimento() {
		return unidadeFederativaNascimento;
	}

	public void setUnidadeFederativaNascimento(String unidadeFederativaNascimento) {
		this.unidadeFederativaNascimento = unidadeFederativaNascimento;
	}

	public String getCidadeNascimento() {
		return cidadeNascimento;
	}

	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cidadeNascimento, confirmaSenha, cpf, dataNascimento, email, genero, nomeCompleto,
				nomeExpedidorRegistroGeral, numeroRegistroGeral, senha, unidadeFederativaNascimento,
				unidadeFederativaRegistroGeral);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaRequestPayload other = (PessoaRequestPayload) obj;
		return Objects.equals(cidadeNascimento, other.cidadeNascimento)
				&& Objects.equals(confirmaSenha, other.confirmaSenha) && Objects.equals(cpf, other.cpf)
				&& Objects.equals(dataNascimento, other.dataNascimento) && Objects.equals(email, other.email)
				&& Objects.equals(genero, other.genero) && Objects.equals(nomeCompleto, other.nomeCompleto)
				&& Objects.equals(nomeExpedidorRegistroGeral, other.nomeExpedidorRegistroGeral)
				&& Objects.equals(numeroRegistroGeral, other.numeroRegistroGeral) && Objects.equals(senha, other.senha)
				&& Objects.equals(unidadeFederativaNascimento, other.unidadeFederativaNascimento)
				&& Objects.equals(unidadeFederativaRegistroGeral, other.unidadeFederativaRegistroGeral);
	}

	@Override
	public String toString() {
		return "PessoaPayload [nomeCompleto=" + nomeCompleto + ", cpf=" + cpf + ", email=" + email + ", senha=" + senha
				+ ", confirmaSenha=" + confirmaSenha + ", numeroRegistroGeral=" + numeroRegistroGeral
				+ ", nomeExpedidorRegistroGeral=" + nomeExpedidorRegistroGeral + ", unidadeFederativaRegistroGeral="
				+ unidadeFederativaRegistroGeral + ", genero=" + genero + ", unidadeFederativaNascimento="
				+ unidadeFederativaNascimento + ", cidadeNascimento=" + cidadeNascimento + ", dataNascimento="
				+ dataNascimento + "]";
	}

}
