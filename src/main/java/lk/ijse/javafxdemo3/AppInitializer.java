package lk.ijse.javafxdemo3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AppInitializer extends Application {
    public static void main(String[] args) {launch(args);}
    @Override
    public void start(Stage stage) throws Exception {

        AnchorPane rootPane = FXMLLoader.load(this.getClass().getResource("/view/login_form.fxml"));

      Scene scene  = new Scene(rootPane);

      stage.setScene(scene);
      stage.setTitle("login");
      stage.show();



    }
}
