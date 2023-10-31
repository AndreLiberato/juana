package br.com.api.juana.models;

import br.com.api.juana.models.pessoas.PacienteModel;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "patologia")
public class PatologiaModel extends EntidadeModel {
	private static final long serialVersionUID = 1L;

	@Column(name = "codigo_internacional", nullable = false, length = 5)
	private String codigoInternacional;

	@Column(name = "ano_diagnostico", nullable = false, length = 5)
	private String anoDiagnostico;

	@Column(name = "sintomas", nullable = false)
	private String sintomas;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
	@JoinColumn(name = "paciente_id", nullable = false)
	private PacienteModel paciente;

	public PatologiaModel() {
		super();
	}

	public PatologiaModel(String codigoInternacional, String anoDiagnostico, String sintomas, PacienteModel paciente) {
		super();
		this.codigoInternacional = codigoInternacional;
		this.anoDiagnostico = anoDiagnostico;
		this.sintomas = sintomas;
		this.paciente = paciente;
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

	public PacienteModel getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteModel paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "PatologiaModel [id=" + id + ", criadoEm=" + criadoEm + ", editadoEm=" + editadoEm
				+ ", codigoInternacional=" + codigoInternacional + ", anoDiagnostico=" + anoDiagnostico + ", sintomas="
				+ sintomas + ", paciente=" + paciente + "]";
	}

}
