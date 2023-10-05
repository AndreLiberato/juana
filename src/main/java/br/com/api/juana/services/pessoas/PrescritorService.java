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
		Optional<PrescritorModel> busca = prescritorRepository.findById(id);
		if (busca.isEmpty()) {
			return Optional.empty();
		}
		PrescritorModel paciente = busca.get();
		paciente.setnomeCompleto(prescritorModel.getnomeCompleto());
		paciente.setDataNascimento(prescritorModel.getDataNascimento());
		paciente.setNumeroResgitro(prescritorModel.getNumeroRegistro());
		return Optional.of(prescritorRepository.save(paciente));
	}

	public Optional<PrescritorModel> findOne(UUID id) {
		Optional<PrescritorModel> paciente = prescritorRepository.findById(id);
		return Optional.of((PrescritorModel) paciente.get());
	}
}