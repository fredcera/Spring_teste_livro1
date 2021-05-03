package com.example.spring_teste_2.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Propriedade {

    @Id
    private String nome;
    private String valor;
    private String descricao;
    private String categoria;

    /*gets e sets*/

    public String getNome() {
        return nome;
    }

    public String getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
