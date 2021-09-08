package com.github.anacarolcosta.apirestcontrolepontoacesso.controller;

import com.github.anacarolcosta.apirestcontrolepontoacesso.model.JornadaTrabalho;
import com.github.anacarolcosta.apirestcontrolepontoacesso.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList() {
        return jornadaService.findAll();

    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaByID(@PathVariable("idJornada") Long idJornada) {
        return ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Não encontrado!")));

    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> deleteByID(@PathVariable("idJornada") Long idJornada) {
        try {
            jornadaService.deleteJornada(idJornada);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }
}
