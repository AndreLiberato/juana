package br.com.api.juana.payloads;

import java.time.LocalDate;
import java.util.Objects;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public abstract class PessoaPayload {
	@NotBlank(message = "{nomeCompleto.not.blank}")
	@Size(min = 5, message = "{nomeCompleto.size.min}")
	@Size(max = 100, message = "{nomeCompleto.size.max}")
	private final String nomeCompleto;

	@NotNull(message = "{dataNascimento.not.null}")
	@Past(message = "{dataNascimento.past}")
	private final LocalDate dataNascimento;

	public PessoaPayload(String nomeCompleto, LocalDate dataNascimento) {
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataNascimento, nomeCompleto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaPayload other = (PessoaPayload) obj;
		return Objects.equals(dataNascimento, other.dataNascimento) && Objects.equals(nomeCompleto, other.nomeCompleto);
	}

	@Override
	public String toString() {
		return "Pessoa [nomeCompleto=" + nomeCompleto + ", dataNascimento=" + dataNascimento + "]";
	}
}
