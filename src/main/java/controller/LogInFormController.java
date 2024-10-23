package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class LogInFormController {

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtPassword;

    @FXML
    void btnCancelOnAction(ActionEvent event) {

    }

    @FXML
    void btnExitOnAction(ActionEvent event) {System.exit(0);}

    @FXML
    void btnLogInOnAction(ActionEvent event) {
        Stage newStage = new Stage();
        try {
            newStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/dash-board-form.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        newStage.show();

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.close();
    }

    @FXML
    void lblForgotPasswordOnAction(MouseEvent event) {
        Stage newStage = new Stage();
        try {
            newStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/forgot-password-form.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        newStage.show();

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.close();
    }


}
