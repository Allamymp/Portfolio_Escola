package com.portfolio.escola.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nome;

    @ManyToMany(mappedBy = "disciplinas")
    private List<Professor> professorList;
    @ManyToMany(mappedBy = "disciplinas")
    private List<Aluno> alunoList;
    @OneToMany(mappedBy = "disciplina")
    private List<NotaBimestral> notasBimestrais;

    public Disciplina(String nome) {
        this.nome = nome;
    }
}
