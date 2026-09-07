package com.nucleo4dev.introduction.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {

    @FXML
    public Button button;
    
    @FXML
    public void alertButton() {
        System.out.println("Botao alerta");
    }
}