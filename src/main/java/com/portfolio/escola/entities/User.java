package com.portfolio.escola.entities;

import com.portfolio.escola.enums.Roles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String endereco;
    private String nomePai;
    private String nomeMae;
    private Roles  tipoUsuario;

    public void setId(String id) {
        throw new UnsupportedOperationException("Alterar o 'id' não é permitido.");
    }


}
