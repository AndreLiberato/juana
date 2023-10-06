package br.com.api.juana.mappers;

import java.util.function.Function;

import org.springframework.stereotype.Service;

import br.com.api.juana.models.PessoaModel;
import br.com.api.juana.payloads.PessoaPayload;

@Service
public class PessoaMapper implements Function<PessoaPayload, PessoaModel> {

	@Override
	public PessoaModel apply(PessoaPayload pessoaPayload) {
		return new PessoaModel(pessoaPayload.getNomeCompleto(), pessoaPayload.getDataNascimento());
	}

}
