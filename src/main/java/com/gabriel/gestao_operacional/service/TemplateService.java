package com.gabriel.gestao_operacional.service;

import com.gabriel.gestao_operacional.model.ItemTemplate;
import com.gabriel.gestao_operacional.model.Template;
import com.gabriel.gestao_operacional.repository.TemplateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplateService {

    private final TemplateRepository templateRepository;

    public TemplateService(TemplateRepository templateRepository) {
        this.templateRepository = templateRepository;
    }

    public Template criar(Template template) {
        for (ItemTemplate item : template.getItens()) {
            item.setTemplate(template);
        }
        return templateRepository.save(template);
    }

    public List<Template> listarTodos() {
        return templateRepository.findAll();
    }
}