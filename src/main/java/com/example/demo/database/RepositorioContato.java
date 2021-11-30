package com.example.demo.database;

import com.example.demo.entidade.Contato;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioContato extends JpaRepository<Contato, Long> {

}
