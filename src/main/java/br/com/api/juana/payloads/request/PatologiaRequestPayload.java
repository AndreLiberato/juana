package br.com.api.juana.payloads.request;

import java.util.Objects;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PatologiaRequestPayload {
	@NotBlank(message = "{codigoInternacional.not.blank}")
	@Size(min = 3, max = 5, message = "{codigoInternacional.size}")
	private String codigoInternacional;

	@NotBlank(message = "{anoDiagnostico.not.blank}")
	@Size(min = 3, max = 5, message = "{anoDiagnostico.size}")
	private String anoDiagnostico;

	@NotBlank(message = "{sintomas.not.blank}")
	@Size(min = 3, max = 255, message = "{sintomas.size}")
	private String sintomas;

	public PatologiaRequestPayload(String codigoInternacional, String anoDiagnostico, String sintomas) {
		this.codigoInternacional = codigoInternacional;
		this.anoDiagnostico = anoDiagnostico;
		this.sintomas = sintomas;
	}

	public String getCodigoInternacional() {
		return codigoInternacional;
	}

	public void setCodigoInternacional(String codigoInternacional) {
		this.codigoInternacional = codigoInternacional;
	}

	public String getAnoDiagnostico() {
		return anoDiagnostico;
	}

	public void setAnoDiagnostico(String anoDiagnostico) {
		this.anoDiagnostico = anoDiagnostico;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anoDiagnostico, codigoInternacional, sintomas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PatologiaRequestPayload other = (PatologiaRequestPayload) obj;
		return Objects.equals(anoDiagnostico, other.anoDiagnostico)
				&& Objects.equals(codigoInternacional, other.codigoInternacional)
				&& Objects.equals(sintomas, other.sintomas);
	}

	@Override
	public String toString() {
		return "PatologiaRequestPayload [codigoInternacional=" + codigoInternacional + ", anoDiagnostico="
				+ anoDiagnostico + ", sintomas=" + sintomas + "]";
	}

}
