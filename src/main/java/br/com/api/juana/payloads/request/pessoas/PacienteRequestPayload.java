package br.com.api.juana.payloads.request.pessoas;

import java.util.Objects;
import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PacienteRequestPayload {
	@Size(min = 3, max = 128, message = "{nomeSocial.size}")
	private String nomeSocial;

	@NotBlank(message = "{estadoCivil.not.blank}")
	@Size(min = 3, max = 128, message = "{EstadoCivil.size}")
	private String estadoCivil;

	@NotBlank(message = "{profissao.not.blank}")
	@Size(min = 3, max = 64, message = "{profissao.size}")
	private String profissao;

	@NotBlank(message = "{planoSaude.not.blank}")
	@Size(min = 3, max = 32, message = "{planoSaude.size}")
	private String planoSaude;

	public PacienteRequestPayload(String nomeSocial, String estadoCivil, String profissao, String planoSaude,
			UUID pessoaId) {
		this.nomeSocial = nomeSocial;
		this.estadoCivil = estadoCivil;
		this.profissao = profissao;
		this.planoSaude = planoSaude;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}

	@Override
	public int hashCode() {
		return Objects.hash(estadoCivil, nomeSocial, planoSaude, profissao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PacienteRequestPayload other = (PacienteRequestPayload) obj;
		return Objects.equals(estadoCivil, other.estadoCivil) && Objects.equals(nomeSocial, other.nomeSocial)
				&& Objects.equals(planoSaude, other.planoSaude) && Objects.equals(profissao, other.profissao);
	}

	@Override
	public String toString() {
		return "PacienteRequestPayload [nomeSocial=" + nomeSocial + ", estadoCivil=" + estadoCivil + ", profissao="
				+ profissao + ", planoSaude=" + planoSaude + "]";
	}

}
