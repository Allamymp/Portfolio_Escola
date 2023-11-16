package com.portfolio.escola.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Bimestre {
    PRIMEIRO("primeiro"),
    SEGUNDO("segundo"),
    TERCEIRO("terceiro"),
    QUARTO("quarto");

    private final String bimestre;
}
