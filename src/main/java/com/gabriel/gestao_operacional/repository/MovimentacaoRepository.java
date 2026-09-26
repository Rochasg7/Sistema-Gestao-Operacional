package com.gabriel.gestao_operacional.repository;

import com.gabriel.gestao_operacional.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
    List<Movimentacao> findByOrdemProducaoIdOrderByDataHoraAsc(Long ordemProducaoId);
}