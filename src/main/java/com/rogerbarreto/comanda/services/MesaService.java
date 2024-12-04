package com.rogerbarreto.comanda.services;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    

}
