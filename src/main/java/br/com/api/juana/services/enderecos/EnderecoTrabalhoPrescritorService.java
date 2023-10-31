package br.com.api.juana.services.enderecos;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.juana.models.enderecos.EnderecoTrabalhoPrescritorModel;
import br.com.api.juana.repositories.enderecos.EnderecoTrabalhoPrescritorRepository;

@Service
public class EnderecoTrabalhoPrescritorService {
	@Autowired
	private EnderecoTrabalhoPrescritorRepository enderecoTrabalhoPrescritorRepository;

	public List<EnderecoTrabalhoPrescritorModel> getAll() {
		return enderecoTrabalhoPrescritorRepository.findAll();
	}

	public EnderecoTrabalhoPrescritorModel createEntity(EnderecoTrabalhoPrescritorModel enderecoTrabalhoPrescritorModel) {
		return enderecoTrabalhoPrescritorRepository.save(enderecoTrabalhoPrescritorModel);
	}

	public void deleteEntity(EnderecoTrabalhoPrescritorModel enderecoTrabalhoPrescritorModel) {
		enderecoTrabalhoPrescritorRepository.delete(enderecoTrabalhoPrescritorModel);
	}

	public Optional<EnderecoTrabalhoPrescritorModel> updateEntity(EnderecoTrabalhoPrescritorModel enderecoTrabalhoPrescritorModel, UUID id) {
		Optional<EnderecoTrabalhoPrescritorModel> result = enderecoTrabalhoPrescritorRepository.findById(id);
		if (result.isEmpty()) {
			return Optional.empty();
		}
		EnderecoTrabalhoPrescritorModel endereco = result.get();
		// Implementar mapper
		return Optional.of(enderecoTrabalhoPrescritorRepository.save(endereco));
	}

	public Optional<EnderecoTrabalhoPrescritorModel> findOne(UUID id) {
		return enderecoTrabalhoPrescritorRepository.findById(id);
	}
}
