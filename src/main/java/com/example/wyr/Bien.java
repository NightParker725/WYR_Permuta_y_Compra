package com.example.wyr;

import javafx.scene.image.Image;

public class Bien {

    private int value;
    private String name;
    private Image img;

    public Bien(int value, String name, Image img) {
        this.value = value;
        this.name = name;
        this.img = img;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }
}
