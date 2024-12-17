package com.rogerbarreto.comanda.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rogerbarreto.comanda.models.ItemComanda;
import com.rogerbarreto.comanda.repositories.ItemComandaRepository;

@Service
public class ItemComandaService {
    
    @Autowired
    private ItemComandaRepository itemComandaRepository;

    public ItemComanda findItemComandaByProCodigo(Long pro_codigo)
    {
        Optional<ItemComanda> comanda = this.itemComandaRepository.findByIco_pro_codigo(pro_codigo);
        return comanda.orElseThrow(() -> new RuntimeException("Não foi possivel encontrar o item da comanda pelo código de produto : " + pro_codigo));
    }

    public ItemComanda findItemComandaById(Long id)
    {
        Optional<ItemComanda> itemComanda = this.itemComandaRepository.findById(id);
        return itemComanda.orElseThrow(()-> new RuntimeException("Não foi possivel encontrar o item pelo id do item " + id));
    }
    @Transactional
    public ItemComanda createItemComanda(ItemComanda obj)
    {
        obj = this.itemComandaRepository.save(obj);
        return obj;
    }
}
