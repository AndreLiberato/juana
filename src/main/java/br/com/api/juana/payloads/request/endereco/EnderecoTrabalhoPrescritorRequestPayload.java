package br.com.api.juana.payloads.request.endereco;

import java.util.Objects;
import java.util.UUID;

import br.com.api.juana.payloads.request.EnderecoRequestPayload;
import jakarta.validation.constraints.NotNull;

public class EnderecoTrabalhoPrescritorRequestPayload extends EnderecoRequestPayload {
	@NotNull(message = "{prescritorId.not.blank}")
	private UUID prescritorId;

	public EnderecoTrabalhoPrescritorRequestPayload(String cep, String logradouro, String bairro, String numero,
			String unidadeFederativa, String cidade, String complemento, UUID prescritorId) {
		super(cep, logradouro, bairro, numero, unidadeFederativa, cidade, complemento);
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
		EnderecoTrabalhoPrescritorRequestPayload other = (EnderecoTrabalhoPrescritorRequestPayload) obj;
		return Objects.equals(prescritorId, other.prescritorId);
	}

	@Override
	public String toString() {
		return "EnderecoTrabalhoPrescritorRequestPayload [cep=" + cep + ", logradouro=" + logradouro + ", bairro="
				+ bairro + ", numero=" + numero + ", unidadeFederativa=" + unidadeFederativa + ", cidade=" + cidade
				+ ", complemento=" + complemento + ", prescritorId=" + prescritorId + "]";
	}

}
