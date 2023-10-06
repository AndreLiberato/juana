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
@Table(name = "prescritor")
public class PrescritorModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	@Column(name = "numero_registro", nullable = false, length = 10)
	private String numeroRegistro;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "pessoa_id", unique = true, nullable = false, updatable = false)
	private PessoaModel pessoa;

	public PrescritorModel() {

	}

	public PrescritorModel(String numeroResgitro, PessoaModel pessoaModel) {
		this.numeroRegistro = numeroResgitro;
		this.pessoa = pessoaModel;
	}

	public PrescritorModel(String numeroResgitro) {
		this.numeroRegistro = numeroResgitro;
		this.pessoa = new PessoaModel();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
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
		PrescritorModel other = (PrescritorModel) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "PrescritorModel [id=" + id + ", numeroRegistro=" + numeroRegistro + ", pessoa=" + pessoa + "]";
	}

}
