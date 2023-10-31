package br.com.api.juana.services.pessoas;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.juana.models.pessoas.PrescritorModel;
import br.com.api.juana.repositories.pessoas.PrescritorRepository;

@Service
public class PrescritorService {
	@Autowired
	private PrescritorRepository prescritorRepository;

	public List<PrescritorModel> getAll() {
		return prescritorRepository.findAll();
	}

	public PrescritorModel createEntity(PrescritorModel prescritorModel) {
		return prescritorRepository.save(prescritorModel);
	}

	public void deleteEntity(PrescritorModel prescritorModel) {
		prescritorRepository.delete(prescritorModel);
	}

	public Optional<PrescritorModel> updateEntity(PrescritorModel prescritorModel, UUID id) {
		Optional<PrescritorModel> result = prescritorRepository.findById(id);
		if (result.isEmpty()) {
			return Optional.empty();
		}
		PrescritorModel prescritor = result.get();
		prescritor.setNumeroRegistroConselho(prescritorModel.getNumeroRegistroConselho());
		return Optional.of(prescritorRepository.save(prescritor));
	}

	public Optional<PrescritorModel> findOne(UUID id) {
		Optional<PrescritorModel> paciente = prescritorRepository.findById(id);
		return Optional.of((PrescritorModel) paciente.get());
	}
}