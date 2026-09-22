package com.gabriel.gestao_operacional.repository;

import com.gabriel.gestao_operacional.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}