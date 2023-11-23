package br.com.api.juana.controllers.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.juana.mappers.request.cadastro.CadastroPacienteRequestMapper;
import br.com.api.juana.models.PatologiaModel;
import br.com.api.juana.models.enderecos.EnderecoResidencialPacienteModel;
import br.com.api.juana.models.pessoas.PacienteModel;
import br.com.api.juana.payloads.request.cadastro.CadastroPacienteRequestPayload;
import br.com.api.juana.services.PatologiaService;
import br.com.api.juana.services.enderecos.EnderecoResidencialPacienteService;
import br.com.api.juana.services.pessoas.PacienteService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/cadastro/paciente")
public class CadastroPacienteController {
	@Autowired
	private PacienteService pacienteService;

	@Autowired
	private PatologiaService patologiaService;

	@Autowired
	private EnderecoResidencialPacienteService enderecoService;

	@Autowired
	private CadastroPacienteRequestMapper cadastroPacienteMapper;

	@PostMapping
	public ResponseEntity<?> cadastroPaciente(@Valid @RequestBody CadastroPacienteRequestPayload pacienteRequest) {
		PacienteModel paciente = cadastroPacienteMapper.toPacienteModel(pacienteRequest);

		PatologiaModel patologia = cadastroPacienteMapper.toPatologiaModel(pacienteRequest);

		EnderecoResidencialPacienteModel endereco = cadastroPacienteMapper.toEnderecoResidencialPacienteModel(pacienteRequest);

		paciente = pacienteService.createEntity(paciente);

		patologia.setPaciente(paciente);

		patologia = patologiaService.createEntity(patologia);

		endereco.setPaciente(paciente);

		endereco = enderecoService.createEntity(endereco);

		return ResponseEntity.status(HttpStatus.CREATED).body("Pessoa cadastrada!");
	}
}
