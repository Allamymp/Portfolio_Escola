package com.portfolio.escola.services;


import com.portfolio.escola.entities.Disciplina;
import com.portfolio.escola.repositories.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    public List<Disciplina> getAll() {
        return disciplinaRepository.findAll();
    }

    public Optional<Disciplina> getByNome(String nome) {
        return disciplinaRepository.findByNomeEqualsIgnoreCase(nome);
    }
    public void registrar(Disciplina disciplina){
        disciplinaRepository.save(disciplina);
    }
}
