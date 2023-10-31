package br.com.api.juana.services.arquivos;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.api.juana.models.arquivos.ArquivoPrescritorModel;
import br.com.api.juana.repositories.arquivos.ArquivoPrescritorRepository;

public class ArquivoPrescritorService {
	@Autowired
	private ArquivoPrescritorRepository arquivoPrescritorRepository;

	public List<ArquivoPrescritorModel> getAll() {
		return arquivoPrescritorRepository.findAll();
	}

	public ArquivoPrescritorModel createEntity(ArquivoPrescritorModel arquivoPrescritorModel) {
		return arquivoPrescritorRepository.save(arquivoPrescritorModel);
	}

	public void deleteEntity(ArquivoPrescritorModel arquivoPrescritorModel) {
		arquivoPrescritorRepository.delete(arquivoPrescritorModel);
	}

	public Optional<ArquivoPrescritorModel> updateEntity(ArquivoPrescritorModel arquivoPrescritorModel, UUID id) {
		Optional<ArquivoPrescritorModel> result = arquivoPrescritorRepository.findById(id);
		if (result.isEmpty()) {
			return Optional.empty();
		}
		ArquivoPrescritorModel arquivo = result.get();
		// Implementar mapper
		return Optional.of(arquivoPrescritorRepository.save(arquivo));
	}

	public Optional<ArquivoPrescritorModel> findOne(UUID id) {
		return arquivoPrescritorRepository.findById(id);
	}
}
