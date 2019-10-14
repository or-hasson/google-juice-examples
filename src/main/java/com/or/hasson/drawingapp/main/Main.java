package com.or.hasson.drawingapp.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.or.hasson.drawingapp.module.AppModule;
import com.or.hasson.drawingapp.requests.CircleRequest;
import com.or.hasson.drawingapp.requests.SquareRequest;
import com.or.hasson.drawingapp.services.DrawShape;

public class Main {

    private static final String SQUARE_REQ = "SQUARE";
    private static final String CIRCLE_REQ = "CIRCLE";

    private static void sendRequest(String shape){
        if(shape.equals(SQUARE_REQ)){
            Injector injector = Guice.createInjector(new AppModule());
            SquareRequest request =  injector.getInstance(SquareRequest.class);
            request.makeRequest();

            /*SINGELTON TEST
            SquareRequest requestSecond =  injector.getInstance(SquareRequest.class);
            boolean areDrawShapeEqual = request.getDrawShape() == requestSecond.getDrawShape();
            System.out.println(areDrawShapeEqual);
             **/
        }
            if(shape.equals(CIRCLE_REQ)){
                Injector injector = Guice.createInjector(new AppModule());
                CircleRequest request =  injector.getInstance(CircleRequest.class);
                request.makeRequest();
            }

    }

    public static void main(String[] args){
        sendRequest(SQUARE_REQ);
       // sendRequest(CIRCLE_REQ);
    }

}
