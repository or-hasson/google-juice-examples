package com.or.hasson.drawingapp.requests;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.or.hasson.drawingapp.annotations.Square;
import com.or.hasson.drawingapp.services.DrawShape;


public class SquareRequest {

    DrawShape d;


    @Inject
    public SquareRequest(DrawShape d){
        this.d = d;
    }

    public void makeRequest(){
        d.draw();
    }


}
