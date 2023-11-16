package com.portfolio.escola.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Roles {

    ALUNO("aluno"),
    PROFESSOR("professor"),
    FUNCIONARIO("funcionario"),
    ADMIN("admin");

    private final String role;

}
