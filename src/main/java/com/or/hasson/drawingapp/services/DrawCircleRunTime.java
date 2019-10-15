package com.or.hasson.drawingapp.services;

import static com.or.hasson.drawingapp.constans.Constants.CIRCLE;

public class DrawCircleRunTime implements DrawShapeInjectObjectsInRuntime{

   @Override public void draw(){
       System.out.println("Drawing Circle in RunTime Injection...");
   }
    @Override
    public String getShapeName() {
        return CIRCLE;
    }

}

