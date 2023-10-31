package br.com.api.juana.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class EntidadeModel implements Serializable {
	protected static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	protected UUID id;

	@Column(name = "criado_em", nullable = false)
	protected LocalDateTime criadoEm;

	@Column(name = "editado_em", nullable = false)
	protected LocalDateTime editadoEm;

	public EntidadeModel() {
		this.criadoEm = this.editadoEm = LocalDateTime.now();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public LocalDateTime getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(LocalDateTime criadoEm) {
		this.criadoEm = criadoEm;
	}

	public LocalDateTime getEditadoEm() {
		return editadoEm;
	}

	public void setEditadoEm(LocalDateTime editadoEm) {
		this.editadoEm = editadoEm;
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
		EntidadeModel other = (EntidadeModel) obj;
		return Objects.equals(id, other.id);
	}

}
