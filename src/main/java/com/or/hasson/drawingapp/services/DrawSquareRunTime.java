package com.or.hasson.drawingapp.services;

import static com.or.hasson.drawingapp.constans.Constants.SQUARE;

public class DrawSquareRunTime implements DrawShapeInjectObjectsInRuntime{

    @Override public void draw(){
        System.out.println("Drawing Square in RunTime Injection...");
    }
    @Override
    public String getShapeName() {
        return SQUARE;
    }

}

