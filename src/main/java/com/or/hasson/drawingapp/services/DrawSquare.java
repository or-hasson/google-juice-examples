package com.or.hasson.drawingapp.services;

import com.google.inject.Inject;
import com.or.hasson.drawingapp.annotations.ColorValue;
import com.or.hasson.drawingapp.annotations.EdgeValue;

public class DrawSquare implements DrawShape {

    private String color;
    private Integer edge;

    @Inject
    public DrawSquare(@ColorValue String color, @EdgeValue Integer edge){
        super();
        this.color = color;
        this.edge = edge;
    }

    public void draw() {
        System.out.println("Drawing Square with color: " + color + "  and edge of size: " + edge);
    }
}
