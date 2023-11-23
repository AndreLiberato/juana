package br.com.api.juana.payloads.request.cadastro;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CadastroPacienteRequestPayload {

	// Pessoa
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
	private String dataNascimento;

	// Paciente
	@Size(min = 3, max = 128, message = "{nomeSocial.size}")
	private String nomeSocial;

	@NotBlank(message = "{estadoCivil.not.blank}")
	@Size(min = 3, max = 128, message = "{EstadoCivil.size}")
	private String estadoCivil;

	@NotBlank(message = "{profissao.not.blank}")
	@Size(min = 3, max = 64, message = "{profissao.size}")
	private String profissao;

	@NotBlank(message = "{planoSaude.not.blank}")
	@Size(min = 3, max = 32, message = "{planoSaude.size}")
	private String planoSaude;

	// Patologia
	@NotBlank(message = "{codigoInternacional.not.blank}")
	@Size(min = 3, max = 3, message = "{codigoInternacional.size}")
	private String codigoInternacional;

	@NotBlank(message = "{anoDiagnostico.not.blank}")
	@Size(min = 4, max = 4, message = "{anoDiagnostico.size}")
	private String anoDiagnostico;

	@NotBlank(message = "{sintomas.not.blank}")
	@Size(min = 3, max = 255, message = "{sintomas.size}")
	private String sintomas;

	// Endereco
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

	public CadastroPacienteRequestPayload() {
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

	public String getCodigoInternacional() {
		return codigoInternacional;
	}

	public void setCodigoInternacional(String codigoInternacional) {
		this.codigoInternacional = codigoInternacional;
	}

	public String getAnoDiagnostico() {
		return anoDiagnostico;
	}

	public void setAnoDiagnostico(String anoDiagnostico) {
		this.anoDiagnostico = anoDiagnostico;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
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

}
