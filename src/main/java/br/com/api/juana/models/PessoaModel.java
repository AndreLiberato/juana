package br.com.api.juana.models;

import java.time.LocalDate;

import br.com.api.juana.enums.Genero;
import br.com.api.juana.enums.UnidadeFederativa;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class PessoaModel extends EntidadeModel {
	private static final long serialVersionUID = 1L;

	@Column(name = "nome_completo", nullable = false, length = 128)
	private String nomeCompleto;

	@Column(name = "cpf", nullable = false, length = 11, unique = true)
	private String cpf;

	@Column(name = "email", nullable = false, length = 64, unique = true)
	private String email;

	@Column(name = "senha", nullable = false)
	private String senha;

	// @Column(name = "numero_registro_geral", length = 8, unique = true)
	// private String numeroRegistroGeral;

	// @Column(name = "nome_expedidor_registro_geral", length = 16)
	// private String nomeExpedidorRegistroGeral;

	// @Column(name = "unidade_federativa_registro_geral", length = 32)
	// @Enumerated(EnumType.STRING)
	// private UnidadeFederativa unidadeFederativaRegistroGeral;

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

	// public String getNumeroRegistroGeral() {
	// return numeroRegistroGeral;
	// }

	// public void setNumeroRegistroGeral(String numeroRegistroGeral) {
	// this.numeroRegistroGeral = numeroRegistroGeral;
	// }

	// public String getNomeExpedidorRegistroGeral() {
	// return nomeExpedidorRegistroGeral;
	// }

	// public void setNomeExpedidorRegistroGeral(String nomeExpedidorRegistroGeral)
	// {
	// this.nomeExpedidorRegistroGeral = nomeExpedidorRegistroGeral;
	// }

	// public UnidadeFederativa getUnidadeFederativaRegistroGeral() {
	// return unidadeFederativaRegistroGeral;
	// }

	// public void setUnidadeFederativaRegistroGeral(UnidadeFederativa
	// unidadeFederativaRegistroGeral) {
	// this.unidadeFederativaRegistroGeral = unidadeFederativaRegistroGeral;
	// }

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

}
