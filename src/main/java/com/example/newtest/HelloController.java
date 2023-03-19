package com.example.newtest;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void switchTOADD() throws IOException {
        Stage stage=new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("ADD.fxml"));
        Scene scene = new Scene(root, 320, 240);

        //stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}