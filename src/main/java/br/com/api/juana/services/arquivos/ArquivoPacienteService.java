package br.com.api.juana.services.arquivos;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.juana.models.arquivos.ArquivoPacienteModel;
import br.com.api.juana.repositories.arquivos.ArquivoPacienteRepository;

@Service
public class ArquivoPacienteService {
	@Autowired
	private ArquivoPacienteRepository arquivoPacienteRepository;

	public List<ArquivoPacienteModel> getAll() {
		return arquivoPacienteRepository.findAll();
	}

	public ArquivoPacienteModel createEntity(ArquivoPacienteModel arquivoPacienteModel) {
		return arquivoPacienteRepository.save(arquivoPacienteModel);
	}

	public void deleteEntity(ArquivoPacienteModel arquivoPacienteModel) {
		arquivoPacienteRepository.delete(arquivoPacienteModel);
	}

	public Optional<ArquivoPacienteModel> updateEntity(ArquivoPacienteModel arquivoPacienteModel, UUID id) {
		Optional<ArquivoPacienteModel> result = arquivoPacienteRepository.findById(id);
		if (result.isEmpty()) {
			return Optional.empty();
		}
		ArquivoPacienteModel arquivo = result.get();
		// Implementar mapper
		return Optional.of(arquivoPacienteRepository.save(arquivo));
	}

	public Optional<ArquivoPacienteModel> findOne(UUID id) {
		return arquivoPacienteRepository.findById(id);
	}
}
