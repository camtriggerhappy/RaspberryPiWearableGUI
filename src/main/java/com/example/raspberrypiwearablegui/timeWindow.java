package com.example.raspberrypiwearablegui;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class timeWindow implements Initializable {
    time timeNow = new time();

    private String currentTime;

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void displayCurrentTime() {
        currentTimelabel.setText(currentTime);
    }

    @FXML
    private Label currentTimelabel;

    @FXML
    private Label timeLatency;

    Timeline timeWriter = new Timeline(new KeyFrame(Duration.seconds(1),
            e -> {
                currentTime = timeNow.getTime();
                displayCurrentTime();
            }

        ));


            @Override
            public void initialize(URL url, ResourceBundle resourceBundle){
                timeWriter.setCycleCount(Timeline.INDEFINITE);
                timeWriter.setRate(1);
                timeWriter.play();
            }


}
