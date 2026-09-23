package com.gabriel.gestao_operacional.controller;

import com.gabriel.gestao_operacional.model.Template;
import com.gabriel.gestao_operacional.service.TemplateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/templates")
public class TemplateController {

    private final TemplateService templateService;

    public TemplateController(TemplateService templateService) {
        this.templateService = templateService;
    }

    @PostMapping
    public Template criar(@RequestBody Template template) {
        return templateService.criar(template);
    }

    @GetMapping
    public List<Template> listarTodos() {
        return templateService.listarTodos();
    }
}