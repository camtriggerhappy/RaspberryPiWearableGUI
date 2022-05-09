package com.example.raspberrypiwearablegui;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class sceneController {
        ArrayList<Scene> scenes;
    public  sceneController(ArrayList<Scene> scenes){
        this.scenes = scenes;
    }


    MenuButton menu = new MenuButton();

    public MenuButton getMenu() {
        return menu;
    }

    public Scene changeScene(int scene){
        return scenes.get(scene);
    }

    public void addScene(Scene scene){
        scenes.add(scene);
        menu.getItems().add(new MenuItem("Scene" + String.valueOf(scenes.size())));
    }
}
