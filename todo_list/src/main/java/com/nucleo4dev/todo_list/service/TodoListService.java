/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        
        tasks.add(task);
        
        return tasks;
    }
    
}
