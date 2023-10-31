package br.com.api.juana.models.enderecos;

import br.com.api.juana.enums.UnidadeFederativa;
import br.com.api.juana.models.EnderecoModel;
import br.com.api.juana.models.pessoas.PacienteModel;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "endereco_residencial_paciente")
public class EnderecoResidencialPacienteModel extends EnderecoModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
	@JoinColumn(name = "paciente_id", nullable = false)
	private PacienteModel paciente;

	public EnderecoResidencialPacienteModel() {
		super();
	}

	public EnderecoResidencialPacienteModel(String cep, String logradouro, String bairro, String numero,
			UnidadeFederativa unidadeFederativa, String cidade, String complemento, PacienteModel paciente) {
		super(cep, logradouro, bairro, numero, unidadeFederativa, cidade, complemento);
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
		return "EnderecoResidencialPacienteModel [paciente=" + paciente + ", id=" + id + ", bairro=" + bairro + ", cep="
				+ cep + ", cidade=" + cidade + ", complemento=" + complemento + ", logradouro=" + logradouro
				+ ", numero=" + numero + ", unidadeFederativa=" + unidadeFederativa + ", criadoEm=" + criadoEm
				+ ", editadoEm=" + editadoEm + "]";
	}

}
