package com.or.hasson.drawingapp.services;

import com.google.inject.Inject;

public class DrawSquare implements DrawShape{

    private String color;
    private Integer size;

    public DrawSquare(String color, Integer size){
        this.color = color;
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square of color : " + color + " and edge : " + size);
    }

}

