package org.openjfx.helloworld;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloWorldController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}