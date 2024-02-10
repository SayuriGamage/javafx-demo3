package lk.ijse.javafxdemo3.controller;

import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;

public class ItemFormController {

    public AnchorPane itemNode;

    public void itemClickBack(ActionEvent actionEvent) {
        itemNode.getChildren().clear();
    }
}
