package br.com.api.juana.repositories.pessoas;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.juana.models.pessoas.PacienteModel;

@Repository
public interface PacienteRepository extends JpaRepository<PacienteModel, UUID> {

}
