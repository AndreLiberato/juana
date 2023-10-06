package br.com.api.juana.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.juana.models.PessoaModel;
import br.com.api.juana.repositories.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public List<PessoaModel> getAll() {
		return pessoaRepository.findAll();
	}

	public PessoaModel createEntity(PessoaModel pessoaModel) {
		return pessoaRepository.save(pessoaModel);
	}

	public void deleteEntity(PessoaModel pessoaModel) {
		pessoaRepository.delete(pessoaModel);
	}

	public Optional<PessoaModel> updateEntity(PessoaModel pessoaModel, UUID id) {
		Optional<PessoaModel> result = pessoaRepository.findById(id);
		if (result.isEmpty()) {
			return Optional.empty();
		}
		PessoaModel pessoa = result.get();
		pessoa.setNomeCompleto(pessoaModel.getNomeCompleto());
		pessoa.setDataNascimento(pessoaModel.getDataNascimento());

		return Optional.of(pessoaRepository.save(pessoa));
	}

	public Optional<PessoaModel> findOne(UUID id) {
		return pessoaRepository.findById(id);
	}

}
