module com.example.raspberrypiwearablegui {
    requires javafx.controls;
    requires javafx.fxml;



    opens com.example.raspberrypiwearablegui to javafx.fxml;
    exports com.example.raspberrypiwearablegui;



}