package com.portfolio.escola.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Professor extends User{


     @ManyToMany
    private List<Disciplina> disciplinas;
}
