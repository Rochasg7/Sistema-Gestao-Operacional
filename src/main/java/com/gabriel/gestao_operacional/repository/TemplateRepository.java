package com.gabriel.gestao_operacional.repository;

import com.gabriel.gestao_operacional.model.Template;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemplateRepository extends JpaRepository<Template, Long> {
}