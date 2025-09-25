package org.example.controllers;

import org.example.models.Aluno;
import org.example.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping(Aluno.API)
    public Aluno add(@RequestBody Aluno aluno) {
        return alunoService.add(aluno);
    }

    @GetMapping(Aluno.API)
    public List<Aluno> get(){
        return  alunoService.get();
    }
}
