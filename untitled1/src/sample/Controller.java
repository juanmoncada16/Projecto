package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML private Button boton0;
    @FXML private Button boton1;
    @FXML private Button boton2;
    @FXML private Button botone1;


    @FXML private void seguir (ActionEvent siguiente) throws IOException {

        Stage stage = null;
        Parent root = null;
        if (siguiente.getSource() == boton1) {
            stage = (Stage) boton1.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ventana2.fxml"));
        } else if (siguiente.getSource() == boton2) {
            stage = (Stage) boton2.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ventana3.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML private void exit (ActionEvent salir) throws IOException {
        Stage stage = null;
        Parent root = null;
        if (salir.getSource() == boton0) {
            stage = (Stage) boton0.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        } else if (salir.getSource() == botone1) {
            stage = (Stage) botone1.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ventana.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}


