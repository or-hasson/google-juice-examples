package com.or.hasson.drawingapp.providers;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.or.hasson.drawingapp.annotations.CircleColorValue;
import com.or.hasson.drawingapp.annotations.RadiusValue;
import com.or.hasson.drawingapp.services.DrawCircle;

public class DrawCircleProvider implements Provider<DrawCircle>{

    private String color;
    private Integer size;

    @Inject
    public DrawCircleProvider(@CircleColorValue String color, @RadiusValue Integer size){
        this.color = color;
        this.size = size;
    }
    public DrawCircle get() {
        DrawCircle circle = new DrawCircle(color, size);
        return  circle;
    }
}
