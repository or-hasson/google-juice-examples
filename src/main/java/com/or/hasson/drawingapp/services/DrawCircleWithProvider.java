package com.or.hasson.drawingapp.services;

import com.google.inject.Inject;

public class DrawCircleWithProvider implements DrawShape {

    private String color;
    private Integer radius;


    @Inject
    public DrawCircleWithProvider(String color, Integer radius){
        this.color = color;
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing Circle with color: " + color + "  and radius of size: " + radius);
    }
}
