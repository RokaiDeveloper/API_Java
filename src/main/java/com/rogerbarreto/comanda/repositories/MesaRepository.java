package com.rogerbarreto.comanda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogerbarreto.comanda.models.Mesa;
import java.util.List;


@Repository
public interface MesaRepository extends JpaRepository<Mesa,Long>{
    
    List<Mesa> findByMes_numero(int mes_numero);
}
