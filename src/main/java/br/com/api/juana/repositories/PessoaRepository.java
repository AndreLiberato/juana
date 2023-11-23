package br.com.api.juana.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import br.com.api.juana.models.PessoaModel;

@NoRepositoryBean
public interface PessoaRepository extends JpaRepository<PessoaModel, UUID> {

}