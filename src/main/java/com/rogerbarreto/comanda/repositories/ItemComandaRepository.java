package com.rogerbarreto.comanda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogerbarreto.comanda.models.ItemComanda;

@Repository
public interface ItemComandaRepository extends JpaRepository<ItemComanda, Long>{
    
}
