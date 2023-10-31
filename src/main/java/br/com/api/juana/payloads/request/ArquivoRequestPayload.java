package br.com.api.juana.payloads.request;

import java.util.Arrays;
import java.util.Objects;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ArquivoRequestPayload {
	@NotNull(message = "{bytes.not.null}")
	protected byte[] bytes;

	@NotBlank(message = "{nome.not.blank}")
	@Size(min = 3, max = 255, message = "{nome.size}")
	protected String nome;

	@NotBlank(message = "{tipo.not.blank}")
	@Size(min = 3, max = 64, message = "{tipo.size}")
	protected String tipo;

	public ArquivoRequestPayload(byte[] bytes, String nome, String tipo) {
		this.bytes = bytes;
		this.nome = nome;
		this.tipo = tipo;
	}

	public byte[] getBytes() {
		return bytes;
	}

	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(bytes);
		result = prime * result + Objects.hash(nome, tipo);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArquivoRequestPayload other = (ArquivoRequestPayload) obj;
		return Arrays.equals(bytes, other.bytes) && Objects.equals(nome, other.nome)
				&& Objects.equals(tipo, other.tipo);
	}

	@Override
	public String toString() {
		return "ArquivoRequestPayload [nome=" + nome + ", tipo=" + tipo + "]";
	}

}
