package com.nucleo4dev.todo_list.controller;

import com.nucleo4dev.todo_list.service.TodoListService;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class TodoListController {
    
    @FXML private TextField inputTask;
    @FXML private VBox vCheckBox;
    
    ArrayList<String> array = new ArrayList<>();
    
    public TodoListService service = new TodoListService();

    @FXML
    private void addTask() throws IOException {
        array = service.addTask(inputTask.getText());
        
        ProgressIndicator load = new ProgressIndicator(-1);
        for(int i = 0; i <= array.size(); i++) 
        {
            vCheckBox.getChildren().add(load);
            HBox hbox = new HBox();
            CheckBox check = new CheckBox();
            Button but = new Button();
            check.setText(array.get(i));
            check.setStyle("-fx-padding: 5px;");
            but.setText("Remover");
            hbox.setMargin(check, new Insets(0, 100, 0, 0));
            hbox.getChildren().addAll(check, but);
            vCheckBox.getChildren().addAll(hbox);
        }
        
        inputTask.setText("");
    }
    
    @FXML
    private void removeTask() throws IOException {
        
    }
    
    @FXML
    private void editTask() throws IOException {
        System.out.println("Tarefa Editada!");
    }
    
}
