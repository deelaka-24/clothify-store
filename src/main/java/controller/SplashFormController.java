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
        // Create a pause transition of 4 seconds
        PauseTransition pause = new PauseTransition(Duration.seconds(3));

        // After the pause, load the login form
        pause.setOnFinished(event -> {
            try {
                // Load the login form instead of the dashboard
                Parent loginForm = FXMLLoader.load(getClass().getResource("/view/log-in-form.fxml"));

                // Create a new stage for the login form
                Stage stage = new Stage();
                stage.setScene(new Scene(loginForm));
                stage.show();

                // Close the splash screen (get the current window and hide it)
                Stage splashStage = (Stage) root.getScene().getWindow();  // This correctly references the stage
                splashStage.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // Start the pause (this starts the timer)
        pause.play();
    }
}
