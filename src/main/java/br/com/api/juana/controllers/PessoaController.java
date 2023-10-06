package br.com.api.juana.controllers;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.juana.mappers.PessoaMapper;
import br.com.api.juana.models.PessoaModel;
import br.com.api.juana.payloads.PessoaPayload;
import br.com.api.juana.services.PessoaService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	@Autowired
	private PessoaService pessoaService;

	@Autowired
	private PessoaMapper pessoaMapper;

	@GetMapping
	public ResponseEntity<?> index() {
		List<PessoaModel> pessoas = pessoaService.getAll();
		if (pessoas.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhum paciente cadastrado!");
		}
		return ResponseEntity.status(HttpStatus.OK).body(pessoas);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> show(@PathVariable("id") UUID id) {
		Optional<PessoaModel> pessoa = pessoaService.findOne(id);
		if (pessoa.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Paciente não encontrado!");
		}
		return ResponseEntity.status(HttpStatus.OK).body(pessoa.get());
	}

	@PostMapping
	public ResponseEntity<?> store(@Valid @RequestBody PessoaPayload pessoaPayload) {
		PessoaModel pessoa = pessoaMapper.apply(pessoaPayload);
		return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.createEntity(pessoa));
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> update(@Valid @RequestBody PessoaPayload pessoaPayload, @PathVariable("id") UUID id) {
		PessoaModel pessoa = pessoaMapper.apply(pessoaPayload);
		Optional<PessoaModel> result = pessoaService.updateEntity(pessoa, id);
		if (result.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pessoa não encontrado!");
		}
		return ResponseEntity.status(HttpStatus.OK).body(result.get());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") UUID id) {
		Optional<PessoaModel> pessoa = pessoaService.findOne(id);
		if (pessoa.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pessoa não encontrado!");
		}
		pessoaService.deleteEntity(pessoa.get());
		return ResponseEntity.status(HttpStatus.OK).body("Pessoa excluído!");
	}

}
