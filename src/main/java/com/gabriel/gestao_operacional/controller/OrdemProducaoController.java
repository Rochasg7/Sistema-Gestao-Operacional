package com.gabriel.gestao_operacional.controller;

import com.gabriel.gestao_operacional.model.OrdemProducao;
import com.gabriel.gestao_operacional.service.OrdemProducaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordens-producao")
public class OrdemProducaoController {

    private final OrdemProducaoService ordemProducaoService;

    public OrdemProducaoController(OrdemProducaoService ordemProducaoService) {
        this.ordemProducaoService = ordemProducaoService;
    }

    @PostMapping
    public OrdemProducao criar(@RequestBody OrdemProducao ordemProducao) {
        return ordemProducaoService.criar(ordemProducao);
    }

    @GetMapping
    public List<OrdemProducao> listarTodas() {
        return ordemProducaoService.listarTodas();
    }

    @GetMapping("/{id}")
    public OrdemProducao buscarPorId(@PathVariable Long id) {
        return ordemProducaoService.buscarPorId(id);
    }
}