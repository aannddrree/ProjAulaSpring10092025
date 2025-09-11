package org.example.services;

import org.example.models.Aluno;
import org.example.repositories.AlunoRepository;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    private AlunoRepository alunoRepository;

    public Aluno add (Aluno aluno){
        return  alunoRepository.save(aluno);
    }

}
