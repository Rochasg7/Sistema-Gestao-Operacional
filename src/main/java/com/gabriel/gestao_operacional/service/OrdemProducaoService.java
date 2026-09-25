package com.gabriel.gestao_operacional.service;

import com.gabriel.gestao_operacional.model.ItemOP;
import com.gabriel.gestao_operacional.model.OrdemProducao;
import com.gabriel.gestao_operacional.model.StatusOP;
import com.gabriel.gestao_operacional.repository.OrdemProducaoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrdemProducaoService {

    private final OrdemProducaoRepository ordemProducaoRepository;

    public OrdemProducaoService(OrdemProducaoRepository ordemProducaoRepository) {
        this.ordemProducaoRepository = ordemProducaoRepository;
    }

    public OrdemProducao criar(OrdemProducao ordemProducao) {
        ordemProducao.setStatus(StatusOP.AGUARDANDO_SEPARACAO);
        ordemProducao.setCriadaEm(LocalDateTime.now());

        for (ItemOP item : ordemProducao.getItens()) {
            item.setOrdemProducao(ordemProducao);
        }

        return ordemProducaoRepository.save(ordemProducao);
    }

    public List<OrdemProducao> listarTodas() {
        return ordemProducaoRepository.findAll();
    }

    public OrdemProducao buscarPorId(Long id) {
        return ordemProducaoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ordem de Produção não encontrada"));
    }
}