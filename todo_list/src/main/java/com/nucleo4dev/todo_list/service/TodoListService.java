package com.nucleo4dev.todo_list.service;

import com.nucleo4dev.todo_list.model.Tarefa;
import com.nucleo4dev.todo_list.repository.TarefaRepository;
import java.util.ArrayList;

/**
 *
 * @author pop_osregismichael
 */
public class TodoListService {
    
    ArrayList<Tarefa> taskList = new ArrayList();
    TarefaRepository repository = new TarefaRepository();
    
    public TodoListService (){}
    
    public ArrayList<Tarefa> addTask(Tarefa tarefa) {
        if(tarefa) {
            repository.salvar(tarefa);
            taskList.add(tarefa);
            System.out.println("Tarefa criada com sucesso!");
            return taskList;
        } 
        
        System.out.println("A tarefa deve conter pelo menos 1 caractere que faça sentido para voce! ");
        return null;
    }
    
}
