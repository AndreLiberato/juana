package br.com.api.juana.controllers.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.juana.services.pessoas.PacienteService;

@RestController
@RequestMapping("/cadastro/paciente")
public class CadastroPacienteController {
	@Autowired
	private PacienteService pacienteService;
	
	@PostMapping
	public ResponseEntity<?> cadastroPaciente() {
		return ResponseEntity .status(HttpStatus.OK).body(pacienteService.getAll());
	}
}
