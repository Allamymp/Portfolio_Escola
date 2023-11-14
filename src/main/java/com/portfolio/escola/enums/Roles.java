package com.portfolio.escola.enums;

import lombok.Getter;

@Getter
public enum Roles {

    ALUNO("aluno"),
    PROFESSOR("professor"),
    FUNCIONARIO("funcionario"),
    ADMIN("admin");

    private final String role;
    Roles(String roles) {
    this.role = roles;
    }
}
