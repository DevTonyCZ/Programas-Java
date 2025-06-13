module com.example.u2_ti_05_form {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.u2_ti_05_form to javafx.fxml;
    exports com.example.u2_ti_05_form;
}