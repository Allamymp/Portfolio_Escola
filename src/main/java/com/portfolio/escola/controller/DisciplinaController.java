package com.portfolio.escola.controller;


import com.portfolio.escola.entities.Disciplina;
import com.portfolio.escola.repositories.DisciplinaRepository;
import com.portfolio.escola.services.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/disciplinas")
public class DisciplinaController {
    @Autowired
    DisciplinaRepository disciplinaRepository;
    
    @Autowired
    DisciplinaService disciplinaService;

    @GetMapping("/all")
    public ResponseEntity<?> getDisciplinas() {
        List<Disciplina> disciplinaList = disciplinaService.getAll();

        if (disciplinaList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(disciplinaList);
    }


}
