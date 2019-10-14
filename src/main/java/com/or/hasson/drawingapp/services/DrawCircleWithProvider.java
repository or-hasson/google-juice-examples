package com.or.hasson.drawingapp.services;

import com.google.inject.Inject;
import com.or.hasson.drawingapp.annotations.ColorValue;
import com.or.hasson.drawingapp.annotations.EdgeValue;
import com.or.hasson.drawingapp.annotations.RadiusValue;

public class DrawCircleWithProvider implements DrawShape {

    private String color;
    private Integer radius;

    /* * With annotations
    @Inject
    public DrawCircleWithProvider(@ColorValue String color, @RadiusValue Integer radius){
        super();
        this.color = color;
        this.radius = radius;
    }
    * */

    //With Providers
    @Inject
    public DrawCircleWithProvider(String color, Integer radius){
        this.color = color;
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing Circle with color: " + color + "  and radius of size: " + radius);
    }
}
