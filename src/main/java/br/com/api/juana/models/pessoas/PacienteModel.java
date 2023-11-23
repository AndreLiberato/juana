package br.com.api.juana.models.pessoas;

import java.util.UUID;

import br.com.api.juana.enums.EstadoCivil;
import br.com.api.juana.models.PessoaModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "paciente")
public class PacienteModel extends PessoaModel {
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

	public PacienteModel() {
		super();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
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
}
