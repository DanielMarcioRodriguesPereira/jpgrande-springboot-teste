package com.dmrp.jpgrande.springboot.test.modelo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id, quantidadeDisponivel;
    private String titulo, autor;

    protected Livro() {}

    public Livro(long quantidadeDisponivel, String titulo, String autor) {
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return String.format("Livro[id='%d', titulo='%s', autor='%s', disponivel='%d']", 
        id, titulo, autor, quantidadeDisponivel);
    }

    public long getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public long getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }
    
}
