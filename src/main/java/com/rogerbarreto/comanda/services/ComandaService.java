package com.rogerbarreto.comanda.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rogerbarreto.comanda.models.Comanda;
import com.rogerbarreto.comanda.repositories.ComandaRepository;

@Service
public class ComandaService {
    
    @Autowired
    private ComandaRepository comandaRepository;

    public Comanda findComandaById(Long id)
    {
        Optional<Comanda> comanda = this.comandaRepository.findById(id);
        return comanda.orElseThrow(()-> new RuntimeException("Comanda não foi encontrada pelo ID" + id ));
    }

    @Transactional
    public Comanda createComanda(Comanda obj)
    {
        obj = this.comandaRepository.save(obj);
        return obj;
    }

    @Transactional
    public Comanda updateComanda(Comanda obj)
    {
        Comanda newObj = findComandaById(obj.getCom_id());
        newObj.setCom_status(obj.getCom_status());
        return this.comandaRepository.save(newObj);
    }

    public void deleteComanda(Long id)
    {
        findComandaById(id);
        try
        {
            this.comandaRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException( "Não foi possivel realizar o delete");
        }
    }
}
