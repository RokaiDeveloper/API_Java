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
    private Long proId;

    @Column(name = "pro_descricao", length = 255, nullable = false, unique = false)
    private String proDescricao;

    @Column(name = "pro_und", length = 10, nullable = false)
    private String proUnd;

    @Column(name = "pro_valor", nullable = false)
    private double proValor;

 
    public Produto() {
    }


    public Produto(Long pro_id, String pro_descricao, String pro_und, double pro_valor) {
        this.proId = pro_id;
        this.proDescricao = pro_descricao;
        this.proUnd = pro_und;
        this.proValor = pro_valor;
    }


    public Long getPro_id() {
        return this.proId;
    }

    public void setPro_id(Long pro_id) {
        this.proId = pro_id;
    }

    public String getPro_descricao() {
        return this.proDescricao;
    }

    public void setPro_descricao(String pro_descricao) {
        this.proDescricao = pro_descricao;
    }

    public String getPro_und() {
        return this.proUnd;
    }

    public void setPro_und(String pro_und) {
        this.proUnd = pro_und;
    }

    public double getPro_valor() {
        return this.proValor;
    }

    public void setPro_valor(double pro_valor) {
        this.proValor = pro_valor;
    }

    
}

    
