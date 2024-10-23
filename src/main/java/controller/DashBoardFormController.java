package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashBoardFormController implements Initializable {

    @FXML
    private AnchorPane contentAnchorPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {loadHomePage();} catch (IOException e) {throw new RuntimeException(e);}
    }

    @FXML
    void btnEmployeeFormOnAction(ActionEvent event) throws IOException {
        loadForm("view/employee-form.fxml");
    }

    @FXML
    void btnExitActionOnAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void btnHomePageFormOnAction(ActionEvent event) throws IOException {
        loadHomePage();
    }

    private void loadHomePage() throws IOException {
        loadForm("view/home-page-form.fxml");
    }

    @FXML
    void btnItemsFormOnAction(ActionEvent event) throws IOException {
        loadForm("view/items-form.fxml");
    }

    @FXML
    void btnOrderDetailsFormOnAction(ActionEvent event) throws IOException {
        loadForm("view/order-details-form.fxml");
    }

    @FXML
    void btnPlaceOrderFormOnAction(ActionEvent event) throws IOException {
        loadForm("view/place-order-form.fxml");
    }

    @FXML
    void btnReportFormOnAction(ActionEvent event) throws IOException {
        loadForm("view/report-form.fxml");
    }

    @FXML
    void btnSalesReturnFormOnAction(ActionEvent event) throws IOException {
        loadForm("view/sales-return-form.fxml");
    }

    // Method to load FXML forms
    private void loadForm(String formPath) throws IOException {
        URL resource = this.getClass().getResource("/" + formPath);

        if (resource == null) {
            throw new IOException("FXML file not found: " + formPath);
        }

        Parent load = FXMLLoader.load(resource);
        this.contentAnchorPane.getChildren().clear();
        this.contentAnchorPane.getChildren().add(load);
    }

//
}
