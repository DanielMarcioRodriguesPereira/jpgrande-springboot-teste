package com.dmrp.jpgrande.springboot.test.modelo.entidades;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Emprestimo {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id, livroId, usuarioId;
    private LocalDate dataEmprestimo, dataDevolucaoEsperada, dataDevolucao;

    protected Emprestimo() {}

    public Emprestimo(long livroId, long usuarioId, LocalDate dataEmprestimo, LocalDate dataDevolucaoEsperada, LocalDate dataDevolucao) {
    }

    public long getId() {
        return id;
    }
}
