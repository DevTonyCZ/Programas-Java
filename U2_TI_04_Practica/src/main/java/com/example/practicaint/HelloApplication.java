package com.example.practicaint;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Label label = new Label("Label 1");
        Label label2 = new Label("Labe2");
        Button button = new Button("Button Saludar");
        Button button2 = new Button("Button No saludar");

        button.setOnAction(e -> {
            label.setText("Hola!");
        });

        button2.setOnAction(e -> {

            label.setText("...!");
        });

        VBox vbox = new VBox(20,label, label2, button, button2);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 500, 240);

        stage.setTitle("Hello!");
        Image image = new Image(getClass().getResourceAsStream("/Imagenes/971.JPG"));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}