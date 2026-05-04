package com.github.ricardo_almeidas.apir._petshop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "animais")
public class Animal {

    @Id
    private Long id;

    @Column(name = "especie")
    private String especie;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cor")
    private String cor;

    @Column(name = "som")
    private String som;

    @Column(name = "idade")
    private Integer idade;
}
