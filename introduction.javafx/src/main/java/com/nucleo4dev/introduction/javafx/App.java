package com.nucleo4dev.introduction.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader carregador = new FXMLLoader(App.class.getResource("primary.fxml"));
        
        stage.setScene(new Scene(carregador.load()));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}