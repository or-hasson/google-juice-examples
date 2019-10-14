package com.or.hasson.drawingapp.requests;

import com.google.inject.Inject;
import com.or.hasson.drawingapp.services.DrawShape;

public class SquareRequest {
    /*Another way to Inject can Inject by
    @Inject
    Drawshape d;
     */
    DrawShape d;

    @Inject
    public SquareRequest(DrawShape d){
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
