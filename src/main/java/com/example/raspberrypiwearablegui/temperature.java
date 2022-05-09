package com.example.raspberrypiwearablegui;

import java.io.*;

/**
 * @apiNote this reads the named pipe that the python file should make
 * */
public class temperature {
    RandomAccessFile tempPipe;
    double temperature;
    public temperature(){
        try {
            File file = new File("/home/cameron/pipe/tempPipe");
            tempPipe = new RandomAccessFile(file, "r");
            System.out.println("resolved Pipe");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private void updateTemp(){
        try {
            temperature = Double.valueOf(tempPipe.read()).doubleValue();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public double getTemperature() {
        updateTemp();
        return temperature;
    }
}
