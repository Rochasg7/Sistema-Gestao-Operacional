package com.gabriel.gestao_operacional.service;

import com.gabriel.gestao_operacional.dto.AvancarSetorRequest;
import com.gabriel.gestao_operacional.model.*;
import com.gabriel.gestao_operacional.repository.MovimentacaoRepository;
import com.gabriel.gestao_operacional.repository.OrdemProducaoRepository;
import com.gabriel.gestao_operacional.repository.SetorRepository;
import com.gabriel.gestao_operacional.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimentacaoService {

    private final MovimentacaoRepository movimentacaoRepository;
    private final OrdemProducaoRepository ordemProducaoRepository;
    private final SetorRepository setorRepository;
    private final UsuarioRepository usuarioRepository;

    public MovimentacaoService(MovimentacaoRepository movimentacaoRepository,
            OrdemProducaoRepository ordemProducaoRepository,
            SetorRepository setorRepository,
            UsuarioRepository usuarioRepository) {
        this.movimentacaoRepository = movimentacaoRepository;
        this.ordemProducaoRepository = ordemProducaoRepository;
        this.setorRepository = setorRepository;
        this.usuarioRepository = usuarioRepository;
    }

    public Movimentacao avancar(AvancarSetorRequest request) {
        OrdemProducao op = ordemProducaoRepository.findById(request.getOrdemProducaoId())
                .orElseThrow(() -> new RuntimeException("Ordem de Produção não encontrada"));

        Setor setorDestino = setorRepository.findById(request.getSetorDestinoId())
                .orElseThrow(() -> new RuntimeException("Setor de destino não encontrado"));

        Usuario usuario = usuarioRepository.findById(request.getUsuarioId())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        Setor setorOrigem = op.getSetorAtual();

        Movimentacao movimentacao = new Movimentacao(op, setorOrigem, setorDestino, usuario);
        movimentacaoRepository.save(movimentacao);

        op.setSetorAtual(setorDestino);
        op.setStatus(StatusOP.EM_PRODUCAO);
        ordemProducaoRepository.save(op);

        return movimentacao;
    }

    public OrdemProducao concluir(Long ordemProducaoId) {
        OrdemProducao op = ordemProducaoRepository.findById(ordemProducaoId)
                .orElseThrow(() -> new RuntimeException("Ordem de Produção não encontrada"));

        op.setStatus(StatusOP.CONCLUIDA);
        return ordemProducaoRepository.save(op);
    }

    public List<Movimentacao> historicoDaOP(Long ordemProducaoId) {
        return movimentacaoRepository.findByOrdemProducaoIdOrderByDataHoraAsc(ordemProducaoId);
    }
}