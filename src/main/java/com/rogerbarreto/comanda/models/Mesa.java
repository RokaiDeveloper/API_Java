package com.rogerbarreto.comanda.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "TABLE_NAME")
public class Mesa {
    public static final String TABLE_NAME = "mesa";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mes_id", unique = true)
    private long mes_id;

    @Column(name = "mes_numero", nullable = false)
    private Integer mes_numero;

    @Column(name = "mes_status", nullable = false)
    private boolean mes_status;

    public Mesa() {
    }


    public Mesa(long mes_id, int mes_numero, boolean mes_status) {
        this.mes_id = mes_id;
        this.mes_numero = mes_numero;
        this.mes_status = mes_status;
    }


    public long getMes_id() {
        return this.mes_id;
    }

    public void setMes_id(long mes_id) {
        this.mes_id = mes_id;
    }

    public int getMes_numero() {
        return this.mes_numero;
    }

    public void setMes_numero(int mes_numero) {
        this.mes_numero = mes_numero;
    }

    public boolean isMes_status() {
        return this.mes_status;
    }

    public boolean getMes_status() {
        return this.mes_status;
    }

    public void setMes_status(boolean mes_status) {
        this.mes_status = mes_status;
    }

}
