package com.portfolio.escola.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Aluno extends User {

    private String turma;
    private String responsavelLegal;
    @ManyToMany
    private List<Disciplina> disciplinas;



}
