package com.portfolio.escola.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nome;

    @ManyToMany(mappedBy = "disciplinas")
    private List<Professor> professorList;
    @ManyToMany(mappedBy = "disciplinas")
    private List<Aluno> alunoList;
     @ElementCollection
    private List<Double> notasBimestrais;


}
