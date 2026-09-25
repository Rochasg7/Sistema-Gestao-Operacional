package com.gabriel.gestao_operacional.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class OrdemProducao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numero;

    private String cliente;

    @Enumerated(EnumType.STRING)
    private StatusOP status;

    @ManyToOne
    @JoinColumn(name = "setor_atual_id")
    private Setor setorAtual;

    @ManyToOne
    @JoinColumn(name = "template_origem_id")
    private Template templateOrigem;

    @OneToMany(mappedBy = "ordemProducao", cascade = CascadeType.ALL)
    private List<ItemOP> itens = new ArrayList<>();

    private LocalDateTime criadaEm;

    public OrdemProducao() {
    }

    public OrdemProducao(String numero, String cliente, Template templateOrigem) {
        this.numero = numero;
        this.cliente = cliente;
        this.templateOrigem = templateOrigem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public StatusOP getStatus() {
        return status;
    }

    public void setStatus(StatusOP status) {
        this.status = status;
    }

    public Setor getSetorAtual() {
        return setorAtual;
    }

    public void setSetorAtual(Setor setorAtual) {
        this.setorAtual = setorAtual;
    }

    public Template getTemplateOrigem() {
        return templateOrigem;
    }

    public void setTemplateOrigem(Template templateOrigem) {
        this.templateOrigem = templateOrigem;
    }

    public List<ItemOP> getItens() {
        return itens;
    }

    public void setItens(List<ItemOP> itens) {
        this.itens = itens;
    }

    public LocalDateTime getCriadaEm() {
        return criadaEm;
    }

    public void setCriadaEm(LocalDateTime criadaEm) {
        this.criadaEm = criadaEm;
    }
}