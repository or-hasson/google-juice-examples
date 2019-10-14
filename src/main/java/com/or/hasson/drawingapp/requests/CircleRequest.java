package com.or.hasson.drawingapp.requests;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.or.hasson.drawingapp.annotations.Circle;
import com.or.hasson.drawingapp.services.DrawShape;

public class CircleRequest {
    /*Another way to Inject can Inject by
    @Inject
    Drawshape d;
     */
    DrawShape d;

    @Inject
    public CircleRequest(@Named("Circle") DrawShape d){
        this.d = d;
    }

    public void makeRequest(){
        d.draw();
    }

    public DrawShape getDrawShape(){
        return d;
    }


/*Another Way to inject the DrawShape to DrawSquare
    @Inject
    public void setDrawShape(DrawShape d){
        this.d = d;
    }
    */
}
