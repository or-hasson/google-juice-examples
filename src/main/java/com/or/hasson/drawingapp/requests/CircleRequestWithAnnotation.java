package com.or.hasson.drawingapp.requests;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.or.hasson.drawingapp.annotations.Circle;
import com.or.hasson.drawingapp.services.DrawShape;

public class CircleRequestWithAnnotation {


    DrawShape circle;
    @Inject
   public CircleRequestWithAnnotation(@Circle DrawShape circle){
       this.circle = circle;
   }



    public void makeRequest(){
        circle.draw();
    }

    public DrawShape getDrawShape(){
        return circle;
    }


}
