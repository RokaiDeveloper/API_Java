package com.rogerbarreto.comanda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogerbarreto.comanda.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
