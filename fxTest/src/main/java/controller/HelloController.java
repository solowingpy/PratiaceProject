package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

/**
 * @author zzd19
 */
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        welcomeText.setText("Welcome to JavaFX Application!");
//        Stage primaryStage = new Stage();
//        SignUpWindow2 signUpWindow2 = new SignUpWindow2();
//        signUpWindow2.windowInit(primaryStage);
//        primaryStage.setTitle("多窗口实验");
//        primaryStage.show();
    }
}