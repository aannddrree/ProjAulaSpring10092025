package org.example.controllers;

import org.example.models.Aluno;
import org.example.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping("api/v1/aluno")
    public Aluno add(Aluno aluno) {
        return alunoService.add(aluno);
    }
}
