package br.com.api.juana.models.arquivos;

import br.com.api.juana.enums.TipoArquivo;
import br.com.api.juana.models.ArquivoModel;
import br.com.api.juana.models.pessoas.PacienteModel;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "arquivo_paciente")
public class ArquivoPacienteModel extends ArquivoModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
	@JoinColumn(name = "paciente_id", nullable = false)
	private PacienteModel paciente;

	public ArquivoPacienteModel() {
		super();
	}

	public ArquivoPacienteModel(byte[] bytes, String nome, TipoArquivo tipo, PacienteModel paciente) {
		super(bytes, nome, tipo);
		this.paciente = paciente;
	}

	public PacienteModel getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteModel paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "ArquivoPacienteModel [id=" + id + ", nome=" + nome + ", tipo=" + tipo + ", criadoEm=" + criadoEm
				+ ", editadoEm=" + editadoEm + ", paciente=" + paciente + "]";
	}

}
