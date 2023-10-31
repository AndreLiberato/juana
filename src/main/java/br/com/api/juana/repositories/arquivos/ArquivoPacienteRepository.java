package br.com.api.juana.repositories.arquivos;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.juana.models.arquivos.ArquivoPacienteModel;

@Repository
public interface ArquivoPacienteRepository extends JpaRepository<ArquivoPacienteModel, UUID> {

}
