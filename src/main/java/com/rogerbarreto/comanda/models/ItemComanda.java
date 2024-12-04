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
@Table(name = "TABLE_NAME")
public class ItemComanda {
    public final static String TABLE_NAME = "item_comanda";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ico_id", unique = true)
    private long ico_id;

    @Column(name = "ico_com_id", nullable = false)
    private Comanda ico_com_id;

    @Column(name = "ico_pro_codigo")
    private long ico_pro_codigo;

    @Column(name = "ico_quantidade")
    private double ico_quantidade;

    @Column(name = "ico_valor")
    private double ico_valor;

    @Column(name = "ico_und")
    private String ico_und;

    @Column(name = "ico_datahora")
    private LocalDateTime ico_datahora;


    public ItemComanda() {
    }


    public ItemComanda(long ico_id, Comanda ico_com_id, long ico_pro_codigo, double ico_quantidade, double ico_valor, String ico_und, LocalDateTime ico_datahora) {
        this.ico_id = ico_id;
        this.ico_com_id = ico_com_id;
        this.ico_pro_codigo = ico_pro_codigo;
        this.ico_quantidade = ico_quantidade;
        this.ico_valor = ico_valor;
        this.ico_und = ico_und;
        this.ico_datahora = ico_datahora;
    }


    public long getIco_id() {
        return this.ico_id;
    }

    public void setIco_id(long ico_id) {
        this.ico_id = ico_id;
    }

    public Comanda getIco_com_id() {
        return this.ico_com_id;
    }

    public void setIco_com_id(Comanda ico_com_id) {
        this.ico_com_id = ico_com_id;
    }

    public long getIco_pro_codigo() {
        return this.ico_pro_codigo;
    }

    public void setIco_pro_codigo(long ico_pro_codigo) {
        this.ico_pro_codigo = ico_pro_codigo;
    }

    public double getIco_quantidade() {
        return this.ico_quantidade;
    }

    public void setIco_quantidade(double ico_quantidade) {
        this.ico_quantidade = ico_quantidade;
    }

    public double getIco_valor() {
        return this.ico_valor;
    }

    public void setIco_valor(double ico_valor) {
        this.ico_valor = ico_valor;
    }

    public String getIco_und() {
        return this.ico_und;
    }

    public void setIco_und(String ico_und) {
        this.ico_und = ico_und;
    }

    public LocalDateTime getIco_datahora() {
        return this.ico_datahora;
    }

    public void setIco_datahora(LocalDateTime ico_datahora) {
        this.ico_datahora = ico_datahora;
    }

}
