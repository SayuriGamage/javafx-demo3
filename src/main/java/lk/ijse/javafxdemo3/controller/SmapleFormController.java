package lk.ijse.javafxdemo3.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class SmapleFormController {

    public AnchorPane rootNode;

    public void ClickOnAction(ActionEvent actionEvent) throws IOException {
        rootNode = FXMLLoader.load(this.getClass().getResource("/view/login_form.fxml"));

        Scene scene  = new Scene(rootNode);
        Stage stage=(Stage)this.rootNode.getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("login");
        stage.centerOnScreen();
    }
}
