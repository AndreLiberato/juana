package br.com.api.juana.services.pessoas;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.juana.models.pessoas.PacienteModel;
import br.com.api.juana.repositories.pessoas.PacienteRepository;

@Service
public class PacienteService {
	@Autowired
	private PacienteRepository pacienteRepository;

	public List<PacienteModel> getAll() {
		return pacienteRepository.findAll();
	}

	public PacienteModel createEntity(PacienteModel pacienteModel) {
		return pacienteRepository.save(pacienteModel);
	}

	public void deleteEntity(PacienteModel pacienteModel) {
		pacienteRepository.delete(pacienteModel);
	}

	public Optional<PacienteModel> updateEntity(PacienteModel pacienteModel, UUID id) {
		Optional<PacienteModel> result = pacienteRepository.findById(id);
		if (result.isEmpty()) {
			return Optional.empty();
		}
		PacienteModel paciente = result.get();
		paciente.setNomeSocial(pacienteModel.getNomeSocial());
		return Optional.of(pacienteRepository.save(paciente));
	}

	public Optional<PacienteModel> findOne(UUID id) {
		Optional<PacienteModel> paciente = pacienteRepository.findById(id);
		return Optional.of((PacienteModel) paciente.get());
	}

}
