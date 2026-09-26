package com.gabriel.gestao_operacional.controller;

import com.gabriel.gestao_operacional.dto.AvancarSetorRequest;
import com.gabriel.gestao_operacional.model.Movimentacao;
import com.gabriel.gestao_operacional.model.OrdemProducao;
import com.gabriel.gestao_operacional.service.MovimentacaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

    private final MovimentacaoService movimentacaoService;

    public MovimentacaoController(MovimentacaoService movimentacaoService) {
        this.movimentacaoService = movimentacaoService;
    }

    @PostMapping("/avancar")
    public Movimentacao avancar(@RequestBody AvancarSetorRequest request) {
        return movimentacaoService.avancar(request);
    }

    @PostMapping("/concluir/{ordemProducaoId}")
    public OrdemProducao concluir(@PathVariable Long ordemProducaoId) {
        return movimentacaoService.concluir(ordemProducaoId);
    }

    @GetMapping("/historico/{ordemProducaoId}")
    public List<Movimentacao> historico(@PathVariable Long ordemProducaoId) {
        return movimentacaoService.historicoDaOP(ordemProducaoId);
    }
}