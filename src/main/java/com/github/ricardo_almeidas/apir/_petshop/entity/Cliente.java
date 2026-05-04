package com.github.ricardo_almeidas.apir._petshop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "nome_animal")
    private String nome_animal;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "logradouro")
    private String logradouro;
}
