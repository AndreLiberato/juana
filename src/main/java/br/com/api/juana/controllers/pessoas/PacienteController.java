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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.juana.models.pessoas.PacienteModel;
import br.com.api.juana.services.pessoas.PacienteService;

@RestController
@RequestMapping("/pessoa/paciente")
public class PacienteController {
	@Autowired
	private PacienteService pacienteService;

//	@Autowired
//	private PessoaService pessoaService;
	
	@GetMapping
	public ResponseEntity<?> index() {
		List<PacienteModel> pacientes = pacienteService.getAll();
		if (pacientes.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhum paciente cadastrado!");
		}
		return ResponseEntity.status(HttpStatus.OK).body(pacienteService.getAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> show(@PathVariable("id") UUID id) {
		Optional<PacienteModel> paciente = pacienteService.findOne(id);
		if (paciente.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Paciente não encontrado!");
		}
		return ResponseEntity.status(HttpStatus.OK).body(paciente.get());
	}

//	@PostMapping
//	public ResponseEntity<?> store(@Valid @RequestBody PacientePayload pacientePayload) {
//		PacienteModel paciente = pacienteMapper.apply(pacientePayload);
//		Optional<PessoaModel> pessoa = pessoaService.findOne(pacientePayload.getPessoaId());
//		if (pessoa.isEmpty()) {
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O paciente não possui pessoa associada!");
//		}
//		paciente.setPessoa(pessoa.get());
//		return ResponseEntity.status(HttpStatus.CREATED).body(pacienteService.createEntity(paciente));
//	}
//
//	@PutMapping("/{id}")
//	public ResponseEntity<?> update(@Valid @RequestBody PacientePayload pacientePayload, @PathVariable("id") UUID id) {
//		PacienteModel paciente = pacienteMapper.apply(pacientePayload);
//		Optional<PessoaModel> pessoa = pessoaService.findOne(pacientePayload.getPessoaId());
//		if (pessoa.isEmpty()) {
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O paciente não possui pessoa associada!");
//		}
//		paciente.setPessoa(pessoa.get());
//		Optional<PacienteModel> result = pacienteService.updateEntity(paciente, id);
//		if (result.isEmpty()) {
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Paciente não encontrado!");
//		}
//		return ResponseEntity.status(HttpStatus.OK).body(result.get());
//	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") UUID id) {
		Optional<PacienteModel> paciente = pacienteService.findOne(id);
		if (paciente.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Paciente não encontrado!");
		}
		pacienteService.deleteEntity(paciente.get());
		return ResponseEntity.status(HttpStatus.OK).body("Paciente excluído!");
	}
}
