package com.rogerbarreto.comanda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogerbarreto.comanda.models.Mesa;
import java.util.Optional;


@Repository
public interface MesaRepository extends JpaRepository<Mesa,Long>{
    
    Optional<Mesa> findByMesNumero(int mes_numero);
}
