package com.rogerbarreto.comanda.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.rogerbarreto.comanda.models.Comanda;
import com.rogerbarreto.comanda.services.ComandaService;

@RestController
@RequestMapping("/Comanda")
@Validated
public class ComandaController {
    
    @Autowired
    private ComandaService comandaService;

    @GetMapping("/{id}")
    public ResponseEntity<Comanda> findById(@PathVariable Long id)
    {
        Comanda obj = this.comandaService.findComandaById(id);

        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody Comanda obj)
    {
        this.comandaService.createComanda(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/id").buildAndExpand(obj.getCom_id()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody Comanda obj, @PathVariable Long id)
    {
        obj.setCom_id(id);
        obj = this.comandaService.updateComanda(obj);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id)
    {
        this.comandaService.deleteComanda(id);
        return ResponseEntity.noContent().build();
    }
}
