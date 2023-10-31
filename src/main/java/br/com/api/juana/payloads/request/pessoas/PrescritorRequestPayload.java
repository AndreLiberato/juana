package br.com.api.juana.payloads.request.pessoas;

import java.util.Objects;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public final class PrescritorRequestPayload {
	@NotBlank(message = "{numeroRegistro.not.blank}")
	@Size(min = 10, max = 10, message = "{numeroRegistro.size}")
	private String numeroRegistroConselho;

	@NotBlank(message = "{formacaoAcademica.not.blank}")
	@Size(min = 3, max = 16, message = "{formacaoAcademica.size}")
	private String formacaoAcademica;

	@NotBlank(message = "{especialidade.not.blank}")
	@Size(min = 3, max = 64, message = "{especialidade.size}")
	private String especialidade;

	public PrescritorRequestPayload(String numeroRegistroConselho, String formacaoAcademica, String especialidade) {
		this.numeroRegistroConselho = numeroRegistroConselho;
		this.formacaoAcademica = formacaoAcademica;
		this.especialidade = especialidade;
	}

	public String getNumeroRegistroConselho() {
		return numeroRegistroConselho;
	}

	public void setNumeroRegistroConselho(String numeroRegistroConselho) {
		this.numeroRegistroConselho = numeroRegistroConselho;
	}

	public String getFormacaoAcademica() {
		return formacaoAcademica;
	}

	public void setFormacaoAcademica(String formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(especialidade, formacaoAcademica, numeroRegistroConselho);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrescritorRequestPayload other = (PrescritorRequestPayload) obj;
		return Objects.equals(especialidade, other.especialidade)
				&& Objects.equals(formacaoAcademica, other.formacaoAcademica)
				&& Objects.equals(numeroRegistroConselho, other.numeroRegistroConselho);
	}

	@Override
	public String toString() {
		return "PrescritorRequestPayload [numeroRegistroConselho=" + numeroRegistroConselho + ", formacaoAcademica="
				+ formacaoAcademica + ", especialidade=" + especialidade + "]";
	}

}
