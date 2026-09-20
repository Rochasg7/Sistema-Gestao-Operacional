package com.gabriel.gestao_operacional.controller;

import com.gabriel.gestao_operacional.model.Setor;
import com.gabriel.gestao_operacional.service.SetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/setores")
public class SetorController {

    @Autowired
    private SetorService setorService;

    @PostMapping
    public Setor criar(@RequestBody Setor setor) {
        return setorService.criar(setor);
    }

    @GetMapping
    public List<Setor> listarTodos() {
        return setorService.listarTodos();
    }
}