package br.com.api.juana.models.pessoas;

import java.util.UUID;

import br.com.api.juana.enums.EstadoCivil;
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
@Table(name = "paciente")
public class PacienteModel extends EntidadeModel {
	private static final long serialVersionUID = 1L;

	@Column(name = "nome_social", length = 128)
	private String nomeSocial;

	@Column(name = "estado_civil", nullable = false, length = 16)
	@Enumerated(EnumType.STRING)
	private EstadoCivil estadoCivil;

	@Column(name = "profissao", nullable = false, length = 64)
	private String profissao;

	@Column(name = "plano_saude", nullable = false, length = 32)
	private String planoSaude;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "pessoa_id", unique = true, nullable = false)
	private PessoaModel pessoa;

	public PacienteModel() {
		super();
	}

	public PacienteModel(String nomeSocial, PessoaModel pessoaModel) {
		super();
		this.nomeSocial = nomeSocial;
		this.pessoa = pessoaModel;
	}

	public PacienteModel(String nomeSocial) {
		this.nomeSocial = nomeSocial;
		this.pessoa = new PessoaModel();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public PessoaModel getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaModel pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "PacienteModel [id=" + id + ", criadoEm=" + criadoEm + ", editadoEm=" + editadoEm + ", estadoCivil="
				+ estadoCivil + ", nomeSocial=" + nomeSocial + ", pessoa=" + pessoa + ", planoSaude=" + planoSaude
				+ ", profissao=" + profissao + "]";
	}

}
