package br.com.api.juana.mappers.request.cadastro;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import br.com.api.juana.enums.EstadoCivil;
import br.com.api.juana.enums.Genero;
import br.com.api.juana.enums.UnidadeFederativa;
import br.com.api.juana.models.pessoas.PacienteModel;
import br.com.api.juana.payloads.request.cadastro.CadastroPacienteRequestPayload;

@Component
public class CadastroPacienteRequestMapper {
    public PacienteModel toPacienteModel(CadastroPacienteRequestPayload cadastroPacienteRequest) {
        PacienteModel paciente = new PacienteModel();
        paciente.setNomeCompleto(cadastroPacienteRequest.getNomeCompleto());
        paciente.setCpf(cadastroPacienteRequest.getCpf());
        paciente.setEmail(cadastroPacienteRequest.getEmail());
        paciente.setSenha(cadastroPacienteRequest.getSenha());

        paciente.setGenero(Genero.valueOf(cadastroPacienteRequest.getGenero()));

        paciente.setUnidadeFederativaNascimento(
                UnidadeFederativa.valueOf(cadastroPacienteRequest.getUnidadeFederativaNascimento()));

        paciente.setCidadeNascimento(cadastroPacienteRequest.getCidadeNascimento());

        paciente.setDataNascimento(LocalDate.parse(cadastroPacienteRequest.getDataNascimento()));

        paciente.setNomeSocial(cadastroPacienteRequest.getNomeSocial());
        paciente.setEstadoCivil(EstadoCivil.valueOf(cadastroPacienteRequest.getEstadoCivil()));
        paciente.setProfissao(cadastroPacienteRequest.getProfissao());
        paciente.setPlanoSaude(cadastroPacienteRequest.getPlanoSaude());

        return paciente;
    }

    // public PatologiaModel toPatologiaModel(CadastroPacienteRequestPayload cadastroPacienteRequest) {
    //     PatologiaModel patologia = new PatologiaModel();
    //     patologia.setCodigoInternacional(cadastroPacienteRequest.getCodigoInternacional());
    //     patologia.setAnoDiagnostico(cadastroPacienteRequest.getAnoDiagnostico());
    //     patologia.setSintomas(cadastroPacienteRequest.getSintomas());
    //     return patologia;
    // }

    // public EnderecoResidencialPacienteModel toEnderecoResidencialPacienteModel(CadastroPacienteRequestPayload cadastroPacienteRequest) {
    //     EnderecoResidencialPacienteModel endereco = new EnderecoResidencialPacienteModel();
    //     endereco.setCep(cadastroPacienteRequest.getCep());
    //     endereco.setLogradouro(cadastroPacienteRequest.getLogradouro());
    //     endereco.setBairro(cadastroPacienteRequest.getBairro());
    //     endereco.setNumero(cadastroPacienteRequest.getNumero());
    //     endereco.setUnidadeFederativa(UnidadeFederativa.valueOf(cadastroPacienteRequest.getUnidadeFederativa()));
    //     endereco.setCidade(cadastroPacienteRequest.getCidade());
    //     endereco.setComplemento(cadastroPacienteRequest.getComplemento());
    //     return endereco;
    // }
}
