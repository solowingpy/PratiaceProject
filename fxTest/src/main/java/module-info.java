module com.example.pratiace.fxtest {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.pratiace.fxtest to javafx.fxml;
    exports com.example.pratiace.fxtest;
    exports controller;
    opens controller to javafx.fxml;
}