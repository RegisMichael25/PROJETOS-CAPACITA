/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nucleo4dev.todo_list.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pop_osregismichael
 */
public class DataBaseConnection {
   private String url = "conexao";

   public Connection connection() {
       try (Connection con = DriverManager.getConnection(url)) {
           if(con != null) {
               System.out.println("Concexão efetivada com sucesso!!");
               return con;
           }
       } catch(SQLException ex) {
           System.out.println("Erro ao conectar no banco de dados: " + ex);
       }
       return null;
   }
}
