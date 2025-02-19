package org.example.module02_pt3_advance_prog;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;


public class splashController {
    @FXML
    private Label welcomeText;

    @FXML
    private Slider loading_bar;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        welcomeText.setText("Slide the Bar to Continue!");

    }

    @FXML
    public void movetonewscreen( DragEvent event) throws IOException {

        Scene scene = ((Slider) event.getSource()).getParent().getScene();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("login-view.fxml"));
        scene.setRoot(fxmlLoader.load());
    }




}


//
//FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("login-view.fxml"));
//Stage stage1 = new Stage();
//        stage1.initModality(Modality.WINDOW_MODAL);
//Scene scene1 = new Scene(new Group(welcomeText),500,500);
//        scene1.setRoot(fxmlLoader.load());