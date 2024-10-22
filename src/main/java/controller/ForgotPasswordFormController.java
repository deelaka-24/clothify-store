package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ForgotPasswordFormController {

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtEnterOTP;

    @FXML
    private TextField txtNewPassword;

    @FXML
    void btnBackOnAction(ActionEvent event) {
        // Load the new stage (window)
        Stage newStage = new Stage();
        try {
            newStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/log-in-form.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        newStage.show();

        // Close the current window (stage)
        // Assuming event was fired from a control in the current window
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.close();
    }


    @FXML
    void btnCancelOnAction(ActionEvent event) {

    }

    @FXML
    void btnResetPasswordOnAction(ActionEvent event) {

    }

    @FXML
    void btnSendOTPOnAction(ActionEvent event) {

    }

}
