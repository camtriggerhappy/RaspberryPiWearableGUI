package com.example.raspberrypiwearablegui;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class mainWindow implements Initializable {
    time timeNow = new time();

    private String currentTime;
    private String tempText;

    temperature temperature = new temperature();

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void displayCurrentTime() {
        currentTimelabel.setText(currentTime);
    }

    public void displayCurrentTemp(){
        tempLabel.setText(tempText);
    }

    @FXML
    private Label currentTimelabel;

    @FXML
    private Label tempLabel;





    Timeline timeWriter = new Timeline(new KeyFrame(Duration.seconds(1),
            e -> {
                currentTime = timeNow.getTime();
                displayCurrentTime();
                tempText = String.valueOf(temperature.getTemperature());
                System.out.println(tempText.toString());
                displayCurrentTemp();

            }

        ));


            @Override
            public void initialize(URL url, ResourceBundle resourceBundle){
                timeWriter.setCycleCount(Timeline.INDEFINITE);
                timeWriter.setRate(1);
                timeWriter.play();
            }


}
