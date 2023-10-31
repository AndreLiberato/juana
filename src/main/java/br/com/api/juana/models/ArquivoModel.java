package br.com.api.juana.models;

import br.com.api.juana.enums.TipoArquivo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class ArquivoModel extends EntidadeModel {
	protected static final long serialVersionUID = 1L;

	@Column(name = "bytes", nullable = false)
	protected byte[] bytes;

	@Column(name = "nome", nullable = false)
	protected String nome;

	@Column(name = "tipo", nullable = false, length = 64)
	@Enumerated(EnumType.STRING)
	protected TipoArquivo tipo;

	public ArquivoModel() {
		super();
	}

	public ArquivoModel(byte[] bytes, String nome, TipoArquivo tipo) {
		super();
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

	public TipoArquivo getTipo() {
		return tipo;
	}

	public void setTipo(TipoArquivo tipo) {
		this.tipo = tipo;
	}

}
