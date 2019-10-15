package com.or.hasson.drawingapp.requests;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.or.hasson.drawingapp.annotations.Circle;
import com.or.hasson.drawingapp.annotations.Square;
import com.or.hasson.drawingapp.services.DrawShape;


public class CircleRequest {

    DrawShape d;


    @Inject
    public CircleRequest(@Circle DrawShape d){
        this.d = d;
    }

    public void makeRequest(){
        d.draw();
    }


}