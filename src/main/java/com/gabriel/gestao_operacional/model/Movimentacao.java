package com.gabriel.gestao_operacional.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ordem_producao_id")
    private OrdemProducao ordemProducao;

    @ManyToOne
    @JoinColumn(name = "setor_origem_id")
    private Setor setorOrigem;

    @ManyToOne
    @JoinColumn(name = "setor_destino_id")
    private Setor setorDestino;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private LocalDateTime dataHora;

    public Movimentacao() {
    }

    public Movimentacao(OrdemProducao ordemProducao, Setor setorOrigem, Setor setorDestino, Usuario usuario) {
        this.ordemProducao = ordemProducao;
        this.setorOrigem = setorOrigem;
        this.setorDestino = setorDestino;
        this.usuario = usuario;
        this.dataHora = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrdemProducao getOrdemProducao() {
        return ordemProducao;
    }

    public void setOrdemProducao(OrdemProducao ordemProducao) {
        this.ordemProducao = ordemProducao;
    }

    public Setor getSetorOrigem() {
        return setorOrigem;
    }

    public void setSetorOrigem(Setor setorOrigem) {
        this.setorOrigem = setorOrigem;
    }

    public Setor getSetorDestino() {
        return setorDestino;
    }

    public void setSetorDestino(Setor setorDestino) {
        this.setorDestino = setorDestino;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}