/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nucleo4dev.todo_list.repository;

import com.nucleo4dev.todo_list.connection.DataBaseConnection;
import com.nucleo4dev.todo_list.model.Tarefa;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pop_osregismichael
 */
public class TarefaRepository {

    private Connection con;

    public TarefaRepository() {
        this.con = new DataBaseConnection().connection();
    }

    public void salvar(Tarefa tarefa) {
        String sql = "INSERT INTO table (titulo, descricao, concluida) VALUES (?, ?, ?)";
        try {
            con.prepareStatement(sql).executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getStackTrace());
        }
    }

    public void delete() {

    }


}
