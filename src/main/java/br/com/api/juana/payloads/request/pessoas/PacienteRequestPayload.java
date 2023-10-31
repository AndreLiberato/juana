package br.com.api.juana.payloads.pessoas;

import java.util.Objects;
import java.util.UUID;

import jakarta.validation.constraints.Size;

public class PacientePayload {
	@Size(min = 5, message = "{nomeSocial.size.min}")
	@Size(max = 100, message = "{nomeSocial.size.max}")
	private final String nomeSocial;

	private final UUID pessoaId;

	public PacientePayload(String nomeSocial, UUID pessoaId) {
		this.nomeSocial = nomeSocial;
		this.pessoaId = pessoaId;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public UUID getPessoaId() {
		return pessoaId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomeSocial, pessoaId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PacientePayload other = (PacientePayload) obj;
		return Objects.equals(nomeSocial, other.nomeSocial) && Objects.equals(pessoaId, other.pessoaId);
	}

	@Override
	public String toString() {
		return "PacientePayload [nomeSocial=" + nomeSocial + ", pessoaId=" + pessoaId + "]";
	}

}
