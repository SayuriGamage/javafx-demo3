package lk.ijse.javafxdemo3.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class SmapleFormController {

    public AnchorPane rootNode;
    public AnchorPane Pane;
    public AnchorPane itemPane;


    public void ClickOnAction(ActionEvent actionEvent) throws IOException {
       Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/login_form.fxml"));

        Scene scene  = new Scene(rootNode);
        Stage stage=(Stage)this.rootNode.getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("login");
        stage.centerOnScreen();
    }

    public void customerOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("/view/customer_form.fxml"));

        AnchorPane customerForm =loader.load();

        Pane.getChildren().clear();
        Pane.getChildren().add(customerForm);
    }


    public void itemOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("/view/item_form.fxml"));

        AnchorPane customerForm =loader.load();

        Pane.getChildren().clear();
        Pane.getChildren().add(customerForm);

    }

    public void supplierOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("/view/supplier_form.fxml"));

        AnchorPane customerForm =loader.load();

        Pane.getChildren().clear();
        Pane.getChildren().add(customerForm);
    }
}
