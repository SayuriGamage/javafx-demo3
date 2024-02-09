package lk.ijse.javafxdemo3.controller;

import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;

public class CustomerFormController {

    public AnchorPane customerNode;

    public void backOnAction(ActionEvent actionEvent) {
        customerNode.getChildren().clear();

    }
}
