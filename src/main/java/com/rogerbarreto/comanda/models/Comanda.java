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
public class Comanda {
    public final static String TABLE_NAME = "comanda";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "com_id", unique = true)
    private long com_id;

    @Column(name = "com_mes_id", nullable = false)
    private Mesa com_mes_id;

    @Column(name = "com_status", nullable = false)
    private boolean com_status;

    @Column(name = "com_datahora", nullable = false)
    private LocalDateTime com_datahora;


    public Comanda() {
    }


    public Comanda(long com_id, Mesa com_mes_id, boolean com_status, LocalDateTime com_datahora) {
        this.com_id = com_id;
        this.com_mes_id = com_mes_id;
        this.com_status = com_status;
        this.com_datahora = com_datahora;
    }


    public long getCom_id() {
        return this.com_id;
    }

    public void setCom_id(long com_id) {
        this.com_id = com_id;
    }

    public Mesa getCom_mes_id() {
        return this.com_mes_id;
    }

    public void setCom_mes_id(Mesa com_mes_id) {
        this.com_mes_id = com_mes_id;
    }

    public boolean isCom_status() {
        return this.com_status;
    }

    public boolean getCom_status() {
        return this.com_status;
    }

    public void setCom_status(boolean com_status) {
        this.com_status = com_status;
    }

    public LocalDateTime getCom_datahora() {
        return this.com_datahora;
    }

    public void setCom_datahora(LocalDateTime com_datahora) {
        this.com_datahora = com_datahora;
    }

}
