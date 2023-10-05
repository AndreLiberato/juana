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
import br.com.api.juana.models.pessoas.PacienteModel;
import br.com.api.juana.payloads.pessoas.PacientePayload;
import br.com.api.juana.services.pessoas.PacienteService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
	@Autowired
	private PacienteService pacienteService;

	@GetMapping
	public ResponseEntity<Object> index() {
		List<PacienteModel> pacientes = pacienteService.getAll();
		if (pacientes.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhum paciente cadastrado!");
		}
		return ResponseEntity.status(HttpStatus.OK).body(pacienteService.getAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> show(@PathVariable("id") UUID id) {
		Optional<PacienteModel> resposta = pacienteService.findOne(id);
		if (resposta.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Paciente não encontrado!");
		}
		return ResponseEntity.status(HttpStatus.OK).body(resposta.get());
	}

	@PostMapping
	public ResponseEntity<PacienteModel> store(@Valid @RequestBody PacientePayload pacientePayload) {
		PacienteModel paciente = new PacienteModel(pacientePayload.getNomeCompleto(),
				pacientePayload.getDataNascimento(), pacientePayload.getNomeSocial());
		return ResponseEntity.status(HttpStatus.CREATED).body(pacienteService.createEntity(paciente));
	}

	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@Valid @RequestBody PacientePayload pacientePayload,
			@PathVariable("id") UUID id) {
		PacienteModel paciente = new PacienteModel(pacientePayload.getNomeCompleto(),
				pacientePayload.getDataNascimento(), pacientePayload.getNomeSocial());
		Optional<PacienteModel> resposta = pacienteService.updateEntity(paciente, id);
		if (resposta.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Paciente não encontrado!");
		}
		return ResponseEntity.status(HttpStatus.OK).body(resposta.get());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> delete(@PathVariable("id") UUID id) {
		Optional<PacienteModel> resposta = pacienteService.findOne(id);
		if (resposta.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Paciente não encontrado!");
		}
		pacienteService.deleteEntity(resposta.get());
		return ResponseEntity.status(HttpStatus.OK).body("Paciente excluído!");
	}
}
