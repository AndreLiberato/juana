package br.com.api.juana.payloads.request.arquivo;

import java.util.Objects;
import java.util.UUID;

import br.com.api.juana.payloads.request.ArquivoRequestPayload;
import jakarta.validation.constraints.NotNull;

public class ArquivoPrescritorRequestPayload extends ArquivoRequestPayload {
	@NotNull(message = "{prescritorId.not.blank}")
	private UUID prescritorId;

	public ArquivoPrescritorRequestPayload(byte[] bytes, String nome, String tipo, UUID prescritorId) {
		super(bytes, nome, tipo);
		this.prescritorId = prescritorId;
	}

	public UUID getPrescritorId() {
		return prescritorId;
	}

	public void setPrescritorId(UUID prescritorId) {
		this.prescritorId = prescritorId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(prescritorId);
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
		ArquivoPrescritorRequestPayload other = (ArquivoPrescritorRequestPayload) obj;
		return Objects.equals(prescritorId, other.prescritorId);
	}

	@Override
	public String toString() {
		return "ArquivoPrescritorRequestPayload [nome=" + nome + ", tipo=" + tipo + ", prescritorId=" + prescritorId
				+ "]";
	}

}
