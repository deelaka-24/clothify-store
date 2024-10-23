package controller;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SplashFormController implements Initializable {

    @FXML
    private Parent root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        PauseTransition pause = new PauseTransition(Duration.seconds(3));

        pause.setOnFinished(event -> {
            try {
                Parent loginForm = FXMLLoader.load(getClass().getResource("/view/log-in-form.fxml"));

                Stage stage = new Stage();
                stage.setScene(new Scene(loginForm));
                stage.show();

                Stage splashStage = (Stage) root.getScene().getWindow();
                splashStage.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        pause.play();
    }
}
