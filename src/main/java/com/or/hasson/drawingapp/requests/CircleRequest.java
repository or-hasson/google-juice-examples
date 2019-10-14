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

    DrawShape circle;

    /* * Inject with Annotations
    @Inject
    public CircleRequest(@Named("Circle") DrawShape circle){
        this.circle = circle;
    }
    */

    //Inject with Providers
    @Inject
    public CircleRequest(DrawShape circle){
        this.circle = circle;
    }

    public void makeRequest(){
        circle.draw();
    }

    public DrawShape getDrawShape(){
        return circle;
    }


/*Another Way to inject the DrawShape to DrawSquare
    @Inject
    public void setDrawShape(DrawShape d){
        this.d = d;
    }
    */
}
