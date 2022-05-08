module com.example.raspberrypiwearablegui {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.raspberrypiwearablegui to javafx.fxml;
    exports com.example.raspberrypiwearablegui;
}