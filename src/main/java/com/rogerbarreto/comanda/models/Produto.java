package com.rogerbarreto.comanda.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "produto")
public class Produto {

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

 
    public Produto() {
    }


    public Produto(Long pro_id, String pro_descricao, String pro_und, double pro_valor) {
        this.pro_id = pro_id;
        this.pro_descricao = pro_descricao;
        this.pro_und = pro_und;
        this.pro_valor = pro_valor;
    }


    public Long getPro_id() {
        return this.pro_id;
    }

    public void setPro_id(Long pro_id) {
        this.pro_id = pro_id;
    }

    public String getPro_descricao() {
        return this.pro_descricao;
    }

    public void setPro_descricao(String pro_descricao) {
        this.pro_descricao = pro_descricao;
    }

    public String getPro_und() {
        return this.pro_und;
    }

    public void setPro_und(String pro_und) {
        this.pro_und = pro_und;
    }

    public double getPro_valor() {
        return this.pro_valor;
    }

    public void setPro_valor(double pro_valor) {
        this.pro_valor = pro_valor;
    }

    
}

    
