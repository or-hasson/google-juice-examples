package com.or.hasson.drawingapp.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.or.hasson.drawingapp.module.AppModule;
import com.or.hasson.drawingapp.requests.SquareRequest;
import com.or.hasson.drawingapp.services.DrawShape;

public class Main {

    private static final String SQUARE_REQ = "SQUARE";

    private static void sendRequest(String squareReq){
        if(squareReq.equals(SQUARE_REQ)){
            Injector injector = Guice.createInjector(new AppModule());
            SquareRequest request =  injector.getInstance(SquareRequest.class);
            request.makeRequest();

            /*SINGELTON TEST
            SquareRequest requestSecond =  injector.getInstance(SquareRequest.class);
            boolean areDrawShapeEqual = request.getDrawShape() == requestSecond.getDrawShape();
            System.out.println(areDrawShapeEqual);
             **/

        }
    }

    public static void main(String[] args){
        sendRequest(SQUARE_REQ);
    }

}
