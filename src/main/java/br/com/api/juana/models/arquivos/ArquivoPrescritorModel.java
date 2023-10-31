package br.com.api.juana.models.arquivos;

import br.com.api.juana.enums.TipoArquivo;
import br.com.api.juana.models.ArquivoModel;
import br.com.api.juana.models.pessoas.PrescritorModel;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "arquivo_prescritor")
public class ArquivoPrescritorModel extends ArquivoModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
	@JoinColumn(name = "prescritor_id", nullable = false)
	private PrescritorModel prescritor;

	public ArquivoPrescritorModel() {
		super();
	}

	public ArquivoPrescritorModel(byte[] bytes, String nome, TipoArquivo tipo, PrescritorModel prescritor) {
		super(bytes, nome, tipo);
		this.prescritor = prescritor;
	}

	public PrescritorModel getPrescritor() {
		return prescritor;
	}

	public void setPrescritor(PrescritorModel prescritor) {
		this.prescritor = prescritor;
	}

	@Override
	public String toString() {
		return "ArquivoPrescritorModel [id=" + id + ", nome=" + nome + ", tipo=" + tipo + ", criadoEm=" + criadoEm
				+ ", editadoEm=" + editadoEm + ", prescritor=" + prescritor + "]";
	}

}
