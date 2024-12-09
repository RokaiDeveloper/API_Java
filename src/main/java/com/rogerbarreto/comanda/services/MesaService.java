package com.rogerbarreto.comanda.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rogerbarreto.comanda.models.Mesa;
import com.rogerbarreto.comanda.repositories.MesaRepository;

@Service
public class MesaService {
    
    @Autowired
    private MesaRepository mesaRepository;

    public Mesa findMesaById(Long id)
    {
        Optional<Mesa> mesa = this.mesaRepository.findById(id);
        return mesa.orElseThrow(()-> new RuntimeException(
            "Mesa não encontrada pelo ID " + id
        ));
    }

    public Mesa findMesaByNumero(int numero) {
        Optional<Mesa> mesa = this.mesaRepository.findByMes_numero(numero);
        return mesa.orElseThrow(() -> new RuntimeException(
            "Mesa não encontrada pelo numero: " + numero
        ));
    }
    
    @Transactional
    public Mesa createMesa(Mesa obj)
    {
        obj = this.mesaRepository.save(obj);
        return obj;
    }

    @Transactional
    public Mesa updatMesa(Mesa obj)
    {
        Mesa newObj = findMesaById(obj.getMes_id());
        newObj.setMes_numero(obj.getMes_numero());
        newObj.setMes_status(obj.getMes_status());
        return this.mesaRepository.save(newObj);
    }

    public void deleteMesa(Long id)
    {
        findMesaById(id);
        try
        {
            this.mesaRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possivel realizar o delete");
        }
    }

}
