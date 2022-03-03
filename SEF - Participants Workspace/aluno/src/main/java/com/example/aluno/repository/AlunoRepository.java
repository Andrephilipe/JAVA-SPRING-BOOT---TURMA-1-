package com.example.aluno.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.aluno.model.Aluno;

public interface AlunoRepository  extends CrudRepository<Aluno, Integer>{

}

