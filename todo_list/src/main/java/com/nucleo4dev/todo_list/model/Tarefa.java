/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nucleo4dev.todo_list.model;

/**
 *
 * @author pop_osregismichael
 */
public class Tarefa {

    private String titulo;
    private String descricao;
    private boolean concluida;

    public Tarefa(String titulo, String descricao, boolean concluida) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}
