package br.com.api.juana.models.pessoas;

import java.time.LocalDate;
import br.com.api.juana.models.PessoaModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "paciente")
public class PacienteModel extends PessoaModel {
    private static final long serialVersionUID = 1L;

    @Column(name = "nome_social", length = 128)
    private String nomeSocial;

    public PacienteModel() {
        super();
    }

    public PacienteModel(String nomeCompleto, LocalDate dataNascimento, String nomeSocial) {
        super(nomeCompleto, dataNascimento);
        this.nomeSocial = nomeSocial;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    @Override
    public String toString() {
        return "PacienteModel [nomeSocial=" + nomeSocial + ", getId()=" + getId() + ", getnomeCompleto()="
                + getnomeCompleto() + ", getDataNascimento()=" + getDataNascimento() + ", getCriadoEm()="
                + getCriadoEm() + ", getEditadoEm()=" + getEditadoEm() + "]";
    }
}
