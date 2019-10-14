package com.or.hasson.drawingapp.services;
import com.google.inject.Inject;


public class DrawSquareWithProvider implements DrawShape {

    private String color;
    private Integer edge;


    @Inject
    public DrawSquareWithProvider(String color, Integer edge){
         super();
        this.color = color;
        this.edge = edge;
    }

    public void draw() {
        System.out.println("Drawing Square with color: " + color + "  and edge of size: " + edge);
    }
}
