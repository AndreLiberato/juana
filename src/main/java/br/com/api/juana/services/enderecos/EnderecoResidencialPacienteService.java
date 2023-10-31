package br.com.api.juana.services.enderecos;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.juana.models.enderecos.EnderecoResidencialPacienteModel;
import br.com.api.juana.repositories.enderecos.EnderecoResidencialPacienteRepository;

@Service
public class EnderecoResidencialPacienteService {
	@Autowired
	private EnderecoResidencialPacienteRepository enderecoResidencialPacienteRepository;

	public List<EnderecoResidencialPacienteModel> getAll() {
		return enderecoResidencialPacienteRepository.findAll();
	}

	public EnderecoResidencialPacienteModel createEntity(EnderecoResidencialPacienteModel enderecoResidencialPacienteModel) {
		return enderecoResidencialPacienteRepository.save(enderecoResidencialPacienteModel);
	}

	public void deleteEntity(EnderecoResidencialPacienteModel enderecoResidencialPacienteModel) {
		enderecoResidencialPacienteRepository.delete(enderecoResidencialPacienteModel);
	}

	public Optional<EnderecoResidencialPacienteModel> updateEntity(EnderecoResidencialPacienteModel enderecoResidencialPacienteModel, UUID id) {
		Optional<EnderecoResidencialPacienteModel> result = enderecoResidencialPacienteRepository.findById(id);
		if (result.isEmpty()) {
			return Optional.empty();
		}
		EnderecoResidencialPacienteModel endereco = result.get();
		// Implementar mapper
		return Optional.of(enderecoResidencialPacienteRepository.save(endereco));
	}

	public Optional<EnderecoResidencialPacienteModel> findOne(UUID id) {
		return enderecoResidencialPacienteRepository.findById(id);
	}
}
