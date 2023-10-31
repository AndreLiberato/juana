package br.com.api.juana.payloads.pessoas;

import java.util.Objects;
import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public final class PrescritorPayload {
	@NotBlank(message = "{numeroRegistro.not.blank}")
	@Size(min = 10, message = "{numeroRegistro.size.min}")
	@Size(max = 10, message = "{numeroRegistro.size.max}")
	private final String numeroRegistro;

	private final UUID pessoaId;

	public PrescritorPayload(String numeroRegistro, UUID pessoaId) {
		this.numeroRegistro = numeroRegistro;
		this.pessoaId = pessoaId;
	}

	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	public UUID getPessoaId() {
		return pessoaId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroRegistro, pessoaId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrescritorPayload other = (PrescritorPayload) obj;
		return Objects.equals(numeroRegistro, other.numeroRegistro) && Objects.equals(pessoaId, other.pessoaId);
	}

	@Override
	public String toString() {
		return "PrescritorPayload [numeroRegistro=" + numeroRegistro + ", pessoaId=" + pessoaId + "]";
	}

}
