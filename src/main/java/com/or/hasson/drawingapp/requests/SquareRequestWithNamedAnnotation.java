package com.or.hasson.drawingapp.requests;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.or.hasson.drawingapp.services.DrawShape;


public class SquareRequestWithNamedAnnotation {

    DrawShape d;


    @Inject
    public SquareRequestWithNamedAnnotation(@Named("Square") DrawShape d){
        this.d = d;
    }



    public void makeRequest(){
        d.draw();
    }

    public DrawShape getDrawShape(){
        return d;
    }

}
