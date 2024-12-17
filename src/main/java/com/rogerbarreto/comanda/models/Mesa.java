package com.rogerbarreto.comanda.models;

import java.util.ArrayList;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "mesa")
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mes_id", unique = true)
    private long mesId;

    @Column(name = "mes_numero", nullable = false)
    private Integer mesNumero;

    @Column(name = "mes_status", nullable = false)
    private boolean mesStatus;

    @OneToMany(mappedBy = "com_mes_id")
    private ArrayList<Comanda> comandas = new ArrayList<>();

    public Mesa() {
    }


    public Mesa(long mes_id, int mes_numero, boolean mes_status) {
        this.mesId = mes_id;
        this.mesNumero = mes_numero;
        this.mesStatus = mes_status;
    }


    public long getMes_id() {
        return this.mesId;
    }

    public void setMes_id(long mes_id) {
        this.mesId = mes_id;
    }

    public int getMes_numero() {
        return this.mesNumero;
    }

    public void setMes_numero(int mes_numero) {
        this.mesNumero = mes_numero;
    }

    public boolean isMes_status() {
        return this.mesStatus;
    }

    public boolean getMes_status() {
        return this.mesStatus;
    }

    public void setMes_status(boolean mes_status) {
        this.mesStatus = mes_status;
    }

}
