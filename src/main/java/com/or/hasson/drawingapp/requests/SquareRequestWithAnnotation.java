package com.or.hasson.drawingapp.requests;

import com.google.inject.Inject;
import com.or.hasson.drawingapp.annotations.Circle;
import com.or.hasson.drawingapp.annotations.Square;
import com.or.hasson.drawingapp.services.DrawShape;

public class SquareRequestWithAnnotation {


    DrawShape square;
    @Inject
   public SquareRequestWithAnnotation(@Square DrawShape square){
       this.square = square;
   }



    public void makeRequest(){
        square.draw();
    }

    public DrawShape getDrawShape(){
        return square;
    }


}
