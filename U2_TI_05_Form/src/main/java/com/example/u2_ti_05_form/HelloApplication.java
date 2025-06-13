package com.example.u2_ti_05_form;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        Label lblNombre = new Label("Nombre:");
        TextField txtNombre = new TextField();

        Label lblApellido = new Label("Apellido:");
        TextField txtApellido = new TextField();

        Label lblEdad = new Label("Edad:");
        TextField txtEdad = new TextField();

        Label lblRol = new Label("Rol:");
        ComboBox<String> cmbRol = new ComboBox<>();
        cmbRol.getItems().addAll("Estudiante", "Profesor", "Admin");

        Button btnCrear = new Button("Crear");
        Button btnReset = new Button("Reset");
        Label lblResultado = new Label();

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(lblNombre, 0, 0);
        gridPane.add(txtNombre, 1, 0);
        gridPane.add(lblApellido, 0, 1);
        gridPane.add(txtApellido, 1, 1);
        gridPane.add(lblEdad, 0, 2);
        gridPane.add(txtEdad, 1, 2);
        gridPane.add(lblRol, 0, 3);
        gridPane.add(cmbRol, 1, 3);
        gridPane.add(btnCrear, 0, 4);
        gridPane.add(btnReset, 1, 4);
        gridPane.add(lblResultado, 0, 5, 2, 1);

        btnCrear.setOnAction(e -> {
            if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtEdad.getText().isEmpty() || cmbRol.getValue() == null) {
                lblResultado.setText("Todos los campos son obligatorios.");
                lblResultado.setTextFill(Color.RED);
            } else {
                try {
                    int edad = Integer.parseInt(txtEdad.getText());
                    if (edad < 0) {
                        lblResultado.setText("Debe ser positiva");
                        lblResultado.setTextFill(Color.RED);
                    } else {
                        gridPane.setStyle("-fx-background-color: green;");
                        lblResultado.setStyle("-fx-background-color: lightblue;");
                        lblResultado.setText("Nombre: " + txtNombre.getText() + "\nApellido: " + txtApellido.getText() + "\nEdad: " + edad + "\nRol: " + cmbRol.getValue());
                    }
                    } catch (NumberFormatException ex) {
                        lblResultado.setText("Ingresa un número válido en el campo de edad.");
                        lblResultado.setTextFill(Color.RED);
                }
            }
        });

        btnReset.setOnAction(e -> {
            txtNombre.clear();
            txtApellido.clear();
            txtEdad.clear();
            cmbRol.setValue(null);
            lblResultado.setText("");
            gridPane.setStyle("");
            lblResultado.setStyle("");
        });

        Scene scene = new Scene(gridPane, 400, 300);
        stage.setTitle("Creación de Form con javaFX\n");
        Image image = new Image(getClass().getResourceAsStream("/Imagenes/971.jpg"));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}