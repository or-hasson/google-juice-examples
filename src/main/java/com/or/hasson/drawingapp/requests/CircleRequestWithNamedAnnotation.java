package com.or.hasson.drawingapp.requests;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.or.hasson.drawingapp.services.DrawShape;

public class CircleRequestWithNamedAnnotation {


    DrawShape circle;

    //Inject with Annotations
    @Inject
    public CircleRequestWithNamedAnnotation(@Named("Circle") DrawShape circle){
        this.circle = circle;
    }



    public void makeRequest(){
        circle.draw();
    }

    public DrawShape getDrawShape(){
        return circle;
    }


}
