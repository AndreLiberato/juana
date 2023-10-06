package br.com.api.juana.models.pessoas;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import br.com.api.juana.models.PessoaModel;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "paciente")
public class PacienteModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	@Column(name = "nome_social", length = 128)
	private String nomeSocial;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "pessoa_id", unique = true, nullable = false)
	private PessoaModel pessoa;

	public PacienteModel() {

	}

	public PacienteModel(String nomeSocial, PessoaModel pessoaModel) {
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
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PacienteModel other = (PacienteModel) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "PacienteModel [id=" + id + ", nomeSocial=" + nomeSocial + ", pessoa=" + pessoa + "]";
	}

}
