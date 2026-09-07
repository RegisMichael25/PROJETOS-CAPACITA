package com.nucleo4dev.todo_list;

import com.nucleo4dev.todo_list.service.TodoListService;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class TodoListController {
    
    @FXML private TextField inputTask;
    @FXML private VBox vCheckBox;
    ArrayList<String> array = new ArrayList<>();
    
    public TodoListService service = new TodoListService();

    @FXML
    private void addTask() throws IOException {
        array = service.addTask(inputTask.getText());
        CheckBox check = new CheckBox();
        
        for(int i = 0; i < array.size(); i++) {
           check.setText(array.get(i));
        }
        vCheckBox.getChildren().add(check);
        inputTask.setText("");
    }
    
    @FXML
    private void removeTask() throws IOException {
        System.out.println("Tarefa Removida!");
    }
    
    @FXML
    private void editTask() throws IOException {
        System.out.println("Tarefa Editada!");
    }
    
}
