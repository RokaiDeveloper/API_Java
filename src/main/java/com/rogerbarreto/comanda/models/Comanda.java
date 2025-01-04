package com.rogerbarreto.comanda.models;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "comanda")
public class Comanda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "com_id", unique = true)
    private long comId;

    @Column(name = "com_mes_id", nullable = false)
    private Long comMesId;

    @Column(name = "com_status", nullable = false)
    private boolean comStatus;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(name = "com_datahora", nullable = false)
    private LocalDateTime comDataHora;


    @OneToMany(mappedBy = "icoComId")
    private List<ItemComanda> itemComandas;

    public Comanda() {
    }


    public Comanda(long com_id, Long com_mes_id, boolean com_status, LocalDateTime com_datahora) {
        this.comId = com_id;
        this.comMesId = com_mes_id;
        this.comStatus = com_status;
        this.comDataHora = com_datahora;
    }


    public long getCom_id() {
        return this.comId;
    }

    public void setCom_id(long com_id) {
        this.comId = com_id;
    }

    public Long getCom_mes_id() {
        return this.comMesId;
    }

    public void setCom_mes_id(Long com_mes_id) {
        this.comMesId = com_mes_id;
    }

    public boolean isCom_status() {
        return this.comStatus;
    }

    public boolean getCom_status() {
        return this.comStatus;
    }

    public void setCom_status(boolean com_status) {
        this.comStatus = com_status;
    }

    public LocalDateTime getCom_datahora() {
        return this.comDataHora;
    }

    public void setCom_datahora(LocalDateTime com_datahora) {
        this.comDataHora = com_datahora;
    }

}
