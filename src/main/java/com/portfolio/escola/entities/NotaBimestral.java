package com.portfolio.escola.entities;

import com.portfolio.escola.enums.Bimestre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NotaBimestral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Bimestre bimestre;
    private Double nota;
    @ManyToOne
    private Disciplina disciplina;

}
