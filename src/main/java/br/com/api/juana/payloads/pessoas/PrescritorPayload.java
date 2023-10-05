package br.com.api.juana.payloads.pessoas;

import java.time.LocalDate;
import java.util.Objects;
import br.com.api.juana.payloads.PessoaPayload;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public final class PrescritorPayload extends PessoaPayload {
	@NotBlank(message = "{numeroRegistro.not.blank}")
	@Size(min = 10, message = "{numeroRegistro.size.min}")
	@Size(max = 10, message = "{numeroRegistro.size.max}")
	private final String numeroRegistro;

	public PrescritorPayload(String nomeCompleto, LocalDate dataNascimento, String numeroRegistro) {
		super(nomeCompleto, dataNascimento);
		this.numeroRegistro = numeroRegistro;
	}

	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numeroRegistro);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrescritorPayload other = (PrescritorPayload) obj;
		return Objects.equals(numeroRegistro, other.numeroRegistro);
	}

	@Override
	public String toString() {
		return "PrescritorDto [numeroRegistro=" + numeroRegistro + ", getNomeCompleto()=" + getNomeCompleto()
				+ ", getDataNascimento()=" + getDataNascimento() + "]";
	}
}
