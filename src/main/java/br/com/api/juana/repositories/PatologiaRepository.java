package br.com.api.juana.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.juana.models.PatologiaModel;

@Repository
public interface PatologiaRepository extends JpaRepository<PatologiaModel, UUID> {

}
