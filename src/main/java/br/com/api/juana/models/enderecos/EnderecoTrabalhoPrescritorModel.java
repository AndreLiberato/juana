package br.com.api.juana.models.enderecos;

import br.com.api.juana.enums.UnidadeFederativa;
import br.com.api.juana.models.EnderecoModel;
import br.com.api.juana.models.pessoas.PrescritorModel;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "endereco_trabalho_prescritor")
public class EnderecoTrabalhoPrescritorModel extends EnderecoModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
	@JoinColumn(name = "prescritor_id", nullable = false)
	private PrescritorModel prescritor;

	public EnderecoTrabalhoPrescritorModel() {
		super();
	}

	public EnderecoTrabalhoPrescritorModel(String cep, String logradouro, String bairro, String numero,
			UnidadeFederativa unidadeFederativa, String cidade, String complemento, PrescritorModel prescritor) {
		super(cep, logradouro, bairro, numero, unidadeFederativa, cidade, complemento);
		this.prescritor = prescritor;
	}

	public PrescritorModel getPaciente() {
		return prescritor;
	}

	public void setPaciente(PrescritorModel paciente) {
		this.prescritor = paciente;
	}

	@Override
	public String toString() {
		return "EnderecoTrabalhoPrescritorModel [id=" + id + ", bairro=" + bairro + ", cep=" + cep + ", cidade="
				+ cidade + ", complemento=" + complemento + ", logradouro=" + logradouro + ", numero=" + numero
				+ ", unidadeFederativa=" + unidadeFederativa + ", criadoEm=" + criadoEm + ", editadoEm=" + editadoEm
				+ ", prescritor=" + prescritor + "]";
	}

}
