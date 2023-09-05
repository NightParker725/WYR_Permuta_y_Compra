package com.example.wyr;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Random;

public class Bienes {
    private ArrayList<Bien> bienes = new ArrayList<Bien>();;
    public Bienes() {

    }

    public ArrayList<Bien> getBienes() {
        return bienes;
    }

    public void setBienes(ArrayList<Bien> bienes) {
        this.bienes = bienes;
    }

    public Bien chooseBien(){
        if (bienes.size() > 0) {
            Random random = new Random();
            int num = random.nextInt(bienes.size());
            return bienes.get(num);
        }
        else return null;
    }
}
