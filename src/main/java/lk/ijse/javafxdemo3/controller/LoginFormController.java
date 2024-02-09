package lk.ijse.javafxdemo3.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.javafxdemo3.DB.DB;

import java.io.IOException;

public class LoginFormController {

    public TextField usertext;
    public TextField passwordtext;
    public AnchorPane rootNode;

    public void loginAction(ActionEvent actionEvent) throws IOException {
        String username=usertext.getText();
        String password=passwordtext.getText();

        if(username.equals(DB.USERNAME)&&password.equals(DB.PASSWORD)){
          //  new Alert(Alert.AlertType.CONFIRMATION,"login sucessfully").show();
          Parent  rootNode = FXMLLoader.load(this.getClass().getResource("/view/sample_form.fxml"));

            Scene scene  = new Scene(rootNode);
            Stage stage=(Stage)this.rootNode.getScene().getWindow();

            stage.setScene(scene);
            stage.setTitle("login");
            stage.centerOnScreen();
           // stage.show();



        }else{
            new Alert(Alert.AlertType.ERROR,"login faild").show();
        }


    }
}
