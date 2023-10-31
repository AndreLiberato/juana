package br.com.api.juana.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.juana.models.PatologiaModel;
import br.com.api.juana.repositories.PatologiaRepository;

@Service
public class PatologiaService {
	@Autowired
	private PatologiaRepository patologiaRepository;

	public List<PatologiaModel> getAll() {
		return patologiaRepository.findAll();
	}

	public PatologiaModel createEntity(PatologiaModel patologiaModel) {
		return patologiaRepository.save(patologiaModel);
	}

	public void deleteEntity(PatologiaModel patologiaModel) {
		patologiaRepository.delete(patologiaModel);
	}

	public Optional<PatologiaModel> updateEntity(PatologiaModel patologiaModel, UUID id) {
		Optional<PatologiaModel> result = patologiaRepository.findById(id);
		if (result.isEmpty()) {
			return Optional.empty();
		}
		PatologiaModel patologia = result.get();
		// Implementar mapper
		return Optional.of(patologiaRepository.save(patologia));
	}

	public Optional<PatologiaModel> findOne(UUID id) {
		return patologiaRepository.findById(id);
	}
}
