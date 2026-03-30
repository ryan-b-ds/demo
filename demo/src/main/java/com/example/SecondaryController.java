package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {
    // add javadoc comment here - anam 
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
        system.out.print("switching to primary");
    }

}
