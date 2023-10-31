package br.com.api.juana.payloads.request.cadastro;

import java.util.Objects;

import br.com.api.juana.payloads.request.ArquivoRequestPayload;
import br.com.api.juana.payloads.request.EnderecoRequestPayload;
import br.com.api.juana.payloads.request.PatologiaRequestPayload;
import br.com.api.juana.payloads.request.PessoaRequestPayload;
import br.com.api.juana.payloads.request.pessoas.PacienteRequestPayload;
import jakarta.validation.Valid;

public class CadastroPacienteRequestPayload {
	@Valid
	private PessoaRequestPayload pessoaPayload;
	@Valid
	private PacienteRequestPayload pacientePayload;
	@Valid
	private EnderecoRequestPayload enderecoPayload;
	@Valid
	private ArquivoRequestPayload arquivoPayload;
	@Valid
	private PatologiaRequestPayload patologiaPayload;

	public CadastroPacienteRequestPayload(PessoaRequestPayload pessoaPayload, PacienteRequestPayload pacientePayload,
			EnderecoRequestPayload enderecoPayload, ArquivoRequestPayload arquivoPayload,
			PatologiaRequestPayload patologiaPayload) {
		this.pessoaPayload = pessoaPayload;
		this.pacientePayload = pacientePayload;
		this.enderecoPayload = enderecoPayload;
		this.arquivoPayload = arquivoPayload;
		this.patologiaPayload = patologiaPayload;
	}

	public PessoaRequestPayload getPessoaPayload() {
		return pessoaPayload;
	}

	public void setPessoaPayload(PessoaRequestPayload pessoaPayload) {
		this.pessoaPayload = pessoaPayload;
	}

	public PacienteRequestPayload getPacientePayload() {
		return pacientePayload;
	}

	public void setPacientePayload(PacienteRequestPayload pacientePayload) {
		this.pacientePayload = pacientePayload;
	}

	public EnderecoRequestPayload getEnderecoPayload() {
		return enderecoPayload;
	}

	public void setEnderecoPayload(EnderecoRequestPayload enderecoPayload) {
		this.enderecoPayload = enderecoPayload;
	}

	public ArquivoRequestPayload getArquivoPayload() {
		return arquivoPayload;
	}

	public void setArquivoPayload(ArquivoRequestPayload arquivoPayload) {
		this.arquivoPayload = arquivoPayload;
	}

	public PatologiaRequestPayload getPatologiaPayload() {
		return patologiaPayload;
	}

	public void setPatologiaPayload(PatologiaRequestPayload patologiaPayload) {
		this.patologiaPayload = patologiaPayload;
	}

	@Override
	public int hashCode() {
		return Objects.hash(arquivoPayload, enderecoPayload, pacientePayload, patologiaPayload, pessoaPayload);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastroPacienteRequestPayload other = (CadastroPacienteRequestPayload) obj;
		return Objects.equals(arquivoPayload, other.arquivoPayload)
				&& Objects.equals(enderecoPayload, other.enderecoPayload)
				&& Objects.equals(pacientePayload, other.pacientePayload)
				&& Objects.equals(patologiaPayload, other.patologiaPayload)
				&& Objects.equals(pessoaPayload, other.pessoaPayload);
	}

	@Override
	public String toString() {
		return "CadastroPacienteRequestPayload [pessoaPayload=" + pessoaPayload + ", pacientePayload=" + pacientePayload
				+ ", enderecoPayload=" + enderecoPayload + ", arquivoPayload=" + arquivoPayload + ", patologiaPayload="
				+ patologiaPayload + "]";
	}

}
