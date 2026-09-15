package com.nucleo4dev.todo_list.service;

import java.util.ArrayList;

/**
 *
 * @author pop_osregismichael
 */
public class TodoListService {
    
    ArrayList<String> tasks = new ArrayList();
    
    public TodoListService (){}
    
    public ArrayList<String> addTask(String task) {
        if(!task.isEmpty()) {
           tasks.add(task);
           System.out.println("Tarefa criada com sucesso!");
           return tasks;
        }
        System.out.println("A tarefa deve conter pelo menos 1 caractere que faça sentido para voce! ");
        return null;
    }
    
}
