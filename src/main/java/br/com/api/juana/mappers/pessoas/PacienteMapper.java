package br.com.api.juana.mappers.pessoas;

import java.util.function.Function;

import org.springframework.stereotype.Service;

import br.com.api.juana.models.pessoas.PacienteModel;
import br.com.api.juana.payloads.pessoas.PacientePayload;

@Service
public class PacienteMapper implements Function<PacientePayload, PacienteModel> {

	@Override
	public PacienteModel apply(PacientePayload pacientePayload) {
		return new PacienteModel(pacientePayload.getNomeSocial());
	}

}
