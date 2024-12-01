package com.rogerbarreto.comanda.models;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TABLE_NAME")
public class Produto {
    public static final String TABLE_NAME = "produto";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pro_id", unique = true)
    private Long pro_id;

    @Column(name = "pro_descricao", length = 255, nullable = false, unique = false)
    private String pro_descricao;

    @Column(name = "pro_und", length = 10, nullable = false)
    private String pro_und;

    @Column(name = "pro_valor", nullable = false)
    private double pro_valor;

    
}
