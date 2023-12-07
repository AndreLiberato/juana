package br.com.api.juana.payloads.request.cadastro;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CadastroPacienteRequestPayload {
	@NotBlank(message = "{nomeCompleto.not.blank}")
	@Size(min = 5, max = 128, message = "{nomeCompleto.size}")
	private String nomeCompleto;

	@NotBlank(message = "{cpf.not.blank}")
	@CPF
	private String cpf;

	@Email(message = "{email.invalid}")
	@NotBlank(message = "{email.not.blank}")
	@Size(min = 3, max = 64, message = "{email.size}")
	private String email;

	@NotBlank(message = "{senha.not.blank}")
	@Size(min = 8, max = 255, message = "{senha.size}")
	private String senha;

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
	private String dataNascimento;

	// Paciente
	@Size(min = 3, max = 128, message = "{nomeSocial.size}")
	private String nomeSocial;

	@NotBlank(message = "{estadoCivil.not.blank}")
	@Size(min = 3, max = 128, message = "{EstadoCivil.size}")
	private String estadoCivil;

	@Size(min = 3, max = 64, message = "{profissao.size}")
	private String profissao;

	@Size(min = 3, max = 32, message = "{planoSaude.size}")
	private String planoSaude;

	@NotNull(message = "{termos.not.null}")
	private String termos;

	public CadastroPacienteRequestPayload() {
		// Empty
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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}

	public String getTermos() {
		return termos;
	}

	public void setTermos(String termos) {
		this.termos = termos;
	}
}
