package com.rogerbarreto.comanda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogerbarreto.comanda.models.Comanda;

@Repository
public interface ComandaRepository extends JpaRepository<Comanda, Long>{
    
}
