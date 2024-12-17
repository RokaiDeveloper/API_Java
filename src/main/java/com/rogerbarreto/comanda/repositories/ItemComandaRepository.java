package com.rogerbarreto.comanda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogerbarreto.comanda.models.ItemComanda;
import java.util.Optional;


@Repository
public interface ItemComandaRepository extends JpaRepository<ItemComanda, Long>{
    
    Optional<ItemComanda> findByIcoProCodigo(long ico_pro_codigo);
}
