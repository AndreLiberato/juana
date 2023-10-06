package br.com.api.juana.controllers.pessoas;

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

import br.com.api.juana.mappers.pessoas.PrescritorMapper;
import br.com.api.juana.models.PessoaModel;
import br.com.api.juana.models.pessoas.PrescritorModel;
import br.com.api.juana.payloads.pessoas.PrescritorPayload;
import br.com.api.juana.services.PessoaService;
import br.com.api.juana.services.pessoas.PrescritorService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/pessoa/prescritor")
public class PrescritorController {
	@Autowired
	private PrescritorService prescritorService;

	@Autowired
	private PessoaService pessoaService;

	@Autowired
	private PrescritorMapper prescritorMapper;

	@GetMapping
	public ResponseEntity<?> index() {
		List<PrescritorModel> prescritores = prescritorService.getAll();
		if (prescritores.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhum prescritor cadastrado!");
		}
		return ResponseEntity.status(HttpStatus.OK).body(prescritorService.getAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> show(@PathVariable("id") UUID id) {
		Optional<PrescritorModel> prescritor = prescritorService.findOne(id);
		if (prescritor.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Prescitor não encontrado!");
		}
		return ResponseEntity.status(HttpStatus.OK).body(prescritor.get());
	}

	@PostMapping
	public ResponseEntity<?> store(@Valid @RequestBody PrescritorPayload prescritorPayload) {
		PrescritorModel prescritor = prescritorMapper.apply(prescritorPayload);
		Optional<PessoaModel> pessoa = pessoaService.findOne(prescritorPayload.getPessoaId());
		if (pessoa.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O paciente não possui pessoa associada!");
		}
		prescritor.setPessoa(pessoa.get());
		return ResponseEntity.status(HttpStatus.CREATED).body(prescritorService.createEntity(prescritor));
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> update(@Valid @RequestBody PrescritorPayload prescritorPayload,
			@PathVariable("id") UUID id) {
		PrescritorModel prescritor = prescritorMapper.apply(prescritorPayload);
		Optional<PessoaModel> pessoa = pessoaService.findOne(prescritorPayload.getPessoaId());
		if (pessoa.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O prescritor não possui pessoa associada!");
		}
		prescritor.setPessoa(pessoa.get());
		Optional<PrescritorModel> result = prescritorService.updateEntity(prescritor, id);
		if (result.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Prescritor não encontrado!");
		}
		return ResponseEntity.status(HttpStatus.OK).body(result.get());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") UUID id) {
		Optional<PrescritorModel> prescritor = prescritorService.findOne(id);
		if (prescritor.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Prescritor não encontrado!");
		}
		prescritorService.deleteEntity(prescritor.get());
		return ResponseEntity.status(HttpStatus.OK).body("Prescritor excluído!");
	}
}
