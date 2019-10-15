package com.or.hasson.drawingapp.services;

public class DrawCircle implements DrawShape{

    private String color;
    private Integer radius;

    public DrawCircle(String color, Integer radius){
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle of color : " + color + " and radius : " + radius);
    }

}

