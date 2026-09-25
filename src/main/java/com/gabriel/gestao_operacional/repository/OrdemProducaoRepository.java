package com.gabriel.gestao_operacional.repository;

import com.gabriel.gestao_operacional.model.OrdemProducao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemProducaoRepository extends JpaRepository<OrdemProducao, Long> {
}