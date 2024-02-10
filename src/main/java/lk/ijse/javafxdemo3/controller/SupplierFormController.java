package lk.ijse.javafxdemo3.controller;

import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;

public class SupplierFormController {

    public AnchorPane supplierNode;

    public void backClickSupplier(ActionEvent actionEvent) {
        supplierNode.getChildren().clear();
    }
}
