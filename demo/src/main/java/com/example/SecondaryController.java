package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {
    // This class is the controller for the secondary view. It contains a method to switch back to the primary view when a button is clicked. The method uses the App class to set the root of the scene to the primary view.
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
        system.out.print("switching to primary");
    }

}
