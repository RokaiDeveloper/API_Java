package com.rogerbarreto.comanda.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "item_comanda")
public class ItemComanda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ico_id", unique = true)
    private long icoId;

    @ManyToOne

    @JoinColumn(name = "ico_com_id")
    private Comanda icoComId;

    @Column(name = "ico_pro_codigo")
    private long icoProCodigo;

    @Column(name = "ico_quantidade")
    private double icoQuantidade;

    @Column(name = "ico_valor")
    private double icoValor;

    @Column(name = "ico_und")
    private String IcoUnd;

    @Column(name = "ico_datahora")
    private LocalDateTime icoDataHora;


    public ItemComanda() {
    }


    public ItemComanda(long ico_id, Comanda ico_com_id, long ico_pro_codigo, double ico_quantidade, double ico_valor, String ico_und, LocalDateTime ico_datahora) {
        this.icoId = ico_id;
        this.icoComId = ico_com_id;
        this.icoProCodigo = ico_pro_codigo;
        this.icoQuantidade = ico_quantidade;
        this.icoValor = ico_valor;
        this.IcoUnd = ico_und;
        this.icoDataHora = ico_datahora;
    }


    public long getIco_id() {
        return this.icoId;
    }

    public void setIco_id(long ico_id) {
        this.icoId = ico_id;
    }

    public Comanda getIco_com_id() {
        return this.icoComId;
    }

    public void setIco_com_id(Comanda ico_com_id) {
        this.icoComId = ico_com_id;
    }

    public long getIco_pro_codigo() {
        return this.icoProCodigo;
    }

    public void setIco_pro_codigo(long ico_pro_codigo) {
        this.icoProCodigo = ico_pro_codigo;
    }

    public double getIco_quantidade() {
        return this.icoQuantidade;
    }

    public void setIco_quantidade(double ico_quantidade) {
        this.icoQuantidade = ico_quantidade;
    }

    public double getIco_valor() {
        return this.icoValor;
    }

    public void setIco_valor(double ico_valor) {
        this.icoValor = ico_valor;
    }

    public String getIco_und() {
        return this.IcoUnd;
    }

    public void setIco_und(String ico_und) {
        this.IcoUnd = ico_und;
    }

    public LocalDateTime getIco_datahora() {
        return this.icoDataHora;
    }

    public void setIco_datahora(LocalDateTime ico_datahora) {
        this.icoDataHora = ico_datahora;
    }

}
