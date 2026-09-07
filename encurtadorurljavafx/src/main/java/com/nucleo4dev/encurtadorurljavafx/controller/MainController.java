package com.nucleo4dev.encurtadorurljavafx.controller;

import com.nucleo4dev.encurtadorurljavafx.service.TinyUrlService;
import javafx.fxml.FXML;

public class MainController {

    private TinyUrlService service;
    
    @FXML
    public void onEncurtarClick() {
        service.teste();
    }
    
    @FXML
    public void onCopiarLink() {
        System.out.println(">>> Copiar Link");
    }

}
