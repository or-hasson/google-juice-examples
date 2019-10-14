package com.or.hasson.drawingapp.services;

import com.google.inject.Inject;
import com.or.hasson.drawingapp.annotations.ColorValue;
import com.or.hasson.drawingapp.annotations.RadiusValue;

public class DrawCircleWithAnnotations implements DrawShape {

    private String color;
    private Integer radius;

    @Inject
    public DrawCircleWithAnnotations(@ColorValue String color, @RadiusValue Integer radius){
        super();
        this.color = color;
        this.radius = radius;
    }




    public void draw() {
        System.out.println("Drawing Circle with color: " + color + "  and radius of size: " + radius);
    }
}
