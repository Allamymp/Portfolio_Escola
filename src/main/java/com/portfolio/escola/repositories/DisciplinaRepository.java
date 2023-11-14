package com.portfolio.escola.repositories;

import com.portfolio.escola.entities.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DisciplinaRepository extends JpaRepository<Disciplina,String> {

    Optional<Disciplina> findById(String id);
    Disciplina findByNomeEqualsIgnoreCase(String nome);
}
