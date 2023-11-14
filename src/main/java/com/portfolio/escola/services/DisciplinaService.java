package com.portfolio.escola.services;


import com.portfolio.escola.controller.DisciplinaController;
import com.portfolio.escola.entities.Disciplina;
import com.portfolio.escola.repositories.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    public List<Disciplina> getAll(){
        return disciplinaRepository.findAll();
    };
}
