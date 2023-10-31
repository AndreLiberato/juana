package br.com.api.juana.repositories.enderecos;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.juana.models.enderecos.EnderecoTrabalhoPrescritorModel;

@Repository
public interface EnderecoTrabalhoPrescritorRepository extends JpaRepository<EnderecoTrabalhoPrescritorModel, UUID> {

}
