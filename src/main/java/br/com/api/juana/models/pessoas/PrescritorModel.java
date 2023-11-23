package br.com.api.juana.models.pessoas;

import java.util.UUID;

import br.com.api.juana.enums.FormacaoAcademica;
import br.com.api.juana.models.PessoaModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "prescritor")
public class PrescritorModel extends PessoaModel {
	private static final long serialVersionUID = 1L;

	@Column(name = "numero_registro_conselho", nullable = false, length = 10)
	private String numeroRegistroConselho;

	@Column(name = "formacao_academica", nullable = false, length = 16)
	@Enumerated(EnumType.STRING)
	private FormacaoAcademica formacaoAcademica;

	@Column(name = "especialidade", nullable = false, length = 64)
	private String especialidade;

	public PrescritorModel() {
		super();
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
}
