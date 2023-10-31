package br.com.api.juana.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.api.juana.enums.Genero;
import br.com.api.juana.enums.UnidadeFederativa;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoa")
public class PessoaModel extends EntidadeModel {
	private static final long serialVersionUID = 1L;

	@Column(name = "nome_completo", nullable = false, length = 128)
	private String nomeCompleto;

	@Column(name = "cpf", nullable = false, length = 11, unique = true)
	private String cpf;

	@Column(name = "email", nullable = false, length = 64, unique = true)
	private String email;

	@Column(name = "senha", nullable = false)
	private String senha;

	@Column(name = "numero_registro_geral", length = 8, unique = true)
	private String numeroRegistroGeral;

	@Column(name = "nomeExpedidorRegistroGeral", length = 16)
	private String nomeExpedidorRegistroGeral;

	@Column(name = "unidade_federativa_registro_geral", length = 32)
	@Enumerated(EnumType.STRING)
	private UnidadeFederativa unidadeFederativaRegistroGeral;

	@Column(name = "genero", nullable = false, length = 16)
	@Enumerated(EnumType.STRING)
	private Genero genero;

	@Column(name = "unidade_federativa_nascimento", nullable = false, length = 32)
	@Enumerated(EnumType.STRING)
	private UnidadeFederativa unidadeFederativaNascimento;

	@Column(name = "cidade_nascimento", nullable = false, length = 64)
	private String cidadeNascimento;

	@Column(name = "data_nascimento", nullable = false)
	private LocalDate dataNascimento;

	public PessoaModel() {
		super();
	}

	public PessoaModel(String nomeCompleto, String cpf, String email, String senha, String numeroRegistroGeral,
			String nomeExpedidorRegistroGeral, UnidadeFederativa unidadeFederativaRegistroGeral, Genero genero,
			UnidadeFederativa unidadeFederativaNascimento, String cidadeNascimento, LocalDate dataNascimento,
			LocalDateTime criadoEm, LocalDateTime editadoEm) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		this.numeroRegistroGeral = numeroRegistroGeral;
		this.nomeExpedidorRegistroGeral = nomeExpedidorRegistroGeral;
		this.unidadeFederativaRegistroGeral = unidadeFederativaRegistroGeral;
		this.genero = genero;
		this.unidadeFederativaNascimento = unidadeFederativaNascimento;
		this.cidadeNascimento = cidadeNascimento;
		this.dataNascimento = dataNascimento;
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

	public UnidadeFederativa getUnidadeFederativaRegistroGeral() {
		return unidadeFederativaRegistroGeral;
	}

	public void setUnidadeFederativaRegistroGeral(UnidadeFederativa unidadeFederativaRegistroGeral) {
		this.unidadeFederativaRegistroGeral = unidadeFederativaRegistroGeral;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public UnidadeFederativa getUnidadeFederativaNascimento() {
		return unidadeFederativaNascimento;
	}

	public void setUnidadeFederativaNascimento(UnidadeFederativa unidadeFederativaNascimento) {
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
	public String toString() {
		return "PessoaModel [id=" + id + ", criadoEm=" + criadoEm + ", editadoEm=" + editadoEm + ", nomeCompleto="
				+ nomeCompleto + ", cpf=" + cpf + ", email=" + email + ", senha=" + senha + ", numeroRegistroGeral="
				+ numeroRegistroGeral + ", nomeExpedidorRegistroGeral=" + nomeExpedidorRegistroGeral
				+ ", unidadeFederativaRegistroGeral=" + unidadeFederativaRegistroGeral + ", genero=" + genero
				+ ", unidadeFederativaNascimento=" + unidadeFederativaNascimento + ", cidadeNascimento="
				+ cidadeNascimento + ", dataNascimento=" + dataNascimento + "]";
	}

}
