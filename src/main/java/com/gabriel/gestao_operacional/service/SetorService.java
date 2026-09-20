package com.gabriel.gestao_operacional.service;

import com.gabriel.gestao_operacional.model.Setor;
import com.gabriel.gestao_operacional.repository.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetorService {

    @Autowired
    private SetorRepository setorRepository;

    public Setor criar(Setor setor) {
        return setorRepository.save(setor);
    }

    public List<Setor> listarTodos() {
        return setorRepository.findAll();
    }
}