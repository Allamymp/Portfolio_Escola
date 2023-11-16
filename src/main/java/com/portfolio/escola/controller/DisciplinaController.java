package com.portfolio.escola.controller;


import com.portfolio.escola.DTO.DisciplinaResponseDTO;
import com.portfolio.escola.entities.Disciplina;
import com.portfolio.escola.repositories.DisciplinaRepository;
import com.portfolio.escola.services.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/byNome")
    public ResponseEntity<?> getDisciplinasByNome(@RequestBody DisciplinaResponseDTO disciplinaDTO) {
        if (disciplinaDTO.nome() != null && !disciplinaDTO.nome().isBlank()) {

            Optional<Disciplina> disciplina = disciplinaService.getByNome(disciplinaDTO.nome());
            return disciplina.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.noContent().build());
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
    @PostMapping("/registrar")
    public ResponseEntity<?> registrarDisciplina(@RequestBody DisciplinaResponseDTO disciplinaDTO){

        if (disciplinaDTO.nome() != null && !disciplinaDTO.nome().isBlank()) {
            disciplinaService.registrar(new Disciplina(disciplinaDTO.nome()));
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }else{
            return ResponseEntity.badRequest().build();
        }
    }
}
