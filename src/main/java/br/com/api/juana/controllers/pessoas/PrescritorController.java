package br.com.api.juana.controllers.usuarios;

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
import br.com.api.juana.models.pessoas.PrescritorModel;
import br.com.api.juana.payloads.pessoas.PrescritorPayload;
import br.com.api.juana.services.pessoas.PrescritorService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/prescritor")
public class PrescritorController {
	@Autowired
	private PrescritorService prescritorService;

	@GetMapping
	public ResponseEntity<Object> index() {
		List<PrescritorModel> pacientes = prescritorService.getAll();
		if (pacientes.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhum prescritor cadastrado!");
		}
		return ResponseEntity.status(HttpStatus.OK).body(prescritorService.getAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> show(@PathVariable("id") UUID id) {
		Optional<PrescritorModel> resposta = prescritorService.findOne(id);
		if (resposta.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Prescitor não encontrado!");
		}
		return ResponseEntity.status(HttpStatus.OK).body(resposta.get());
	}

	@PostMapping
	public ResponseEntity<PrescritorModel> store(@Valid @RequestBody PrescritorPayload prescritorPayload) {
		PrescritorModel paciente = new PrescritorModel(prescritorPayload.getNomeCompleto(),
				prescritorPayload.getDataNascimento(), prescritorPayload.getNumeroRegistro());
		return ResponseEntity.status(HttpStatus.CREATED).body(prescritorService.createEntity(paciente));
	}

	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@Valid @RequestBody PrescritorPayload prescritorPayload,
			@PathVariable("id") UUID id) {
		PrescritorModel paciente = new PrescritorModel(prescritorPayload.getNomeCompleto(),
				prescritorPayload.getDataNascimento(), prescritorPayload.getNumeroRegistro());
		Optional<PrescritorModel> resposta = prescritorService.updateEntity(paciente, id);
		if (resposta.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Prescritor não encontrado!");
		}
		return ResponseEntity.status(HttpStatus.OK).body(resposta.get());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> delete(@PathVariable("id") UUID id) {
		Optional<PrescritorModel> resposta = prescritorService.findOne(id);
		if (resposta.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Prescritor não encontrado!");
		}
		prescritorService.deleteEntity(resposta.get());
		return ResponseEntity.status(HttpStatus.OK).body("Prescritor excluído!");
	}
}
