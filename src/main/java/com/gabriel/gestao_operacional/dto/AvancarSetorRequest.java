package com.gabriel.gestao_operacional.dto;

public class AvancarSetorRequest {

    private Long ordemProducaoId;
    private Long setorDestinoId;
    private Long usuarioId;

    public Long getOrdemProducaoId() {
        return ordemProducaoId;
    }

    public void setOrdemProducaoId(Long ordemProducaoId) {
        this.ordemProducaoId = ordemProducaoId;
    }

    public Long getSetorDestinoId() {
        return setorDestinoId;
    }

    public void setSetorDestinoId(Long setorDestinoId) {
        this.setorDestinoId = setorDestinoId;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }
}