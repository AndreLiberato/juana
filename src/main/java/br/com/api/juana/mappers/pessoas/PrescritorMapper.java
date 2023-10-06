package br.com.api.juana.mappers.pessoas;

import java.util.function.Function;

import org.springframework.stereotype.Service;

import br.com.api.juana.models.pessoas.PrescritorModel;
import br.com.api.juana.payloads.pessoas.PrescritorPayload;

@Service
public class PrescritorMapper implements Function<PrescritorPayload, PrescritorModel> {

	@Override
	public PrescritorModel apply(PrescritorPayload prescritorPayload) {
		return new PrescritorModel(prescritorPayload.getNumeroRegistro());
	}

}
