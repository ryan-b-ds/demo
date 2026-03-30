package com.example;

import java.io.IOException;

import javafx.fxml.FXML;

public class PrimaryController {
    //add javadoc comment here - grey
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
        System.out.print("Switched to secondary.");
    }

    //to-do add more methods to handle user interactions and update the UI as needed - matthew
    //to-do add methods to handle user interactions and update the UI as needed - matthew
}
