package br.com.api.juana.models.pessoas;

import java.time.LocalDate;
import br.com.api.juana.models.PessoaModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "prescritor")
public class PrescritorModel extends PessoaModel {
    private static final long serialVersionUID = 1L;
    @Column(name = "numero_registro", nullable = false, length = 10)
    private String numeroRegistro;

    public PrescritorModel() {
        super();
    }

    public PrescritorModel(String nomeCompleto, LocalDate dataNascimento, String numeroRegistro) {
        super(nomeCompleto, dataNascimento);
        this.numeroRegistro = numeroRegistro;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroResgitro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    @Override
    public String toString() {
        return "PrescritorModel [numeroRegistro=" + numeroRegistro + ", getId()=" + getId() + ", getnomeCompleto()="
                + getnomeCompleto() + ", getDataNascimento()=" + getDataNascimento() + ", getCriadoEm()="
                + getCriadoEm() + ", getEditadoEm()=" + getEditadoEm() + "]";
    }
}
