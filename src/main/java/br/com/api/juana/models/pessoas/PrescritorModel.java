package br.com.api.juana.models.pessoas;

import java.util.UUID;

import br.com.api.juana.enums.FormacaoAcademica;
import br.com.api.juana.models.EntidadeModel;
import br.com.api.juana.models.PessoaModel;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "prescritor")
public class PrescritorModel extends EntidadeModel {
	private static final long serialVersionUID = 1L;

	@Column(name = "numero_registro_conselho", nullable = false, length = 10)
	private String numeroRegistroConselho;

	@Column(name = "formacao_academica", nullable = false, length = 16)
	@Enumerated(EnumType.STRING)
	private FormacaoAcademica formacaoAcademica;

	@Column(name = "especialidade", nullable = false, length = 64)
	private String especialidade;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "pessoa_id", unique = true, nullable = false)
	private PessoaModel pessoa;

	public PrescritorModel() {
		super();
	}

	public PrescritorModel(String numeroResgitro, PessoaModel pessoaModel) {
		super();
		this.numeroRegistroConselho = numeroResgitro;
		this.pessoa = pessoaModel;
	}

	public PrescritorModel(String numeroResgitro) {
		this.numeroRegistroConselho = numeroResgitro;
		this.pessoa = new PessoaModel();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNumeroRegistroConselho() {
		return numeroRegistroConselho;
	}

	public void setNumeroRegistroConselho(String numeroRegistro) {
		this.numeroRegistroConselho = numeroRegistro;
	}

	public PessoaModel getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaModel pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "PrescritorModel [id=" + id + ", criadoEm=" + criadoEm + ", editadoEm=" + editadoEm + ", especialidade="
				+ especialidade + ", formacaoAcademica=" + formacaoAcademica + ", numeroRegistroConselho="
				+ numeroRegistroConselho + ", pessoa=" + pessoa + "]";
	}

}
