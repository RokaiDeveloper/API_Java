package com.rogerbarreto.comanda.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.rogerbarreto.comanda.models.Produto;
import com.rogerbarreto.comanda.repositories.ProdutoRepository;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto findById(Long id)
    {
        Optional<Produto> produto = this.produtoRepository.findById(id);
        return produto.orElseThrow(()-> new RuntimeException(
            "Produto não encontrado pelo ID: " + id + " tipo: " + Produto.class.getName() 
        ));
    }

    @Transactional
    public Produto createProduto(Produto obj)
    {
        obj = this.produtoRepository.save(obj);
        return obj;
    }

    @Transactional
    public Produto updateProduto(Produto obj)
    {
        Produto newObj = findById(obj.getPro_id());
        newObj.setPro_descricao(obj.getPro_descricao());
        newObj.setPro_und(obj.getPro_und());
        newObj.setPro_valor(obj.getPro_valor());
        return this.produtoRepository.save(newObj);
    }

    public void deleteProduto(Long id)
    {
        findById(id);
        try 
        {
            this.produtoRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException( "Não possivel completa o delete");
        }
    }
}
