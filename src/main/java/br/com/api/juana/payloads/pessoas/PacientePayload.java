package br.com.api.juana.payloads.pessoas;

import java.time.LocalDate;
import java.util.Objects;
import br.com.api.juana.payloads.PessoaPayload;
import jakarta.validation.constraints.Size;

public class PacientePayload extends PessoaPayload {
	@Size(min = 5, message = "{nomeSocial.size.min}")
	@Size(max = 100, message = "{nomeSocial.size.max}")
	private final String nomeSocial;

	public PacientePayload(String nomeCompleto, LocalDate dataNascimento, String nomeSocial) {
		super(nomeCompleto, dataNascimento);
		this.nomeSocial = nomeSocial;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(nomeSocial);
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
		PacientePayload other = (PacientePayload) obj;
		return Objects.equals(nomeSocial, other.nomeSocial);
	}

	@Override
	public String toString() {
		return "PacienteDto [nomeSocial=" + nomeSocial + ", getNomeCompleto()=" + getNomeCompleto()
				+ ", getDataNascimento()=" + getDataNascimento() + "]";
	}
}
