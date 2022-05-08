package com.example.raspberrypiwearablegui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class time{
    private String currentTime;
    public time(){}

    private void refreshTime(){
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        currentTime = timeFormatter.format(now);
    }

    public String getTime(){
        refreshTime();
        return  currentTime;
    }
}