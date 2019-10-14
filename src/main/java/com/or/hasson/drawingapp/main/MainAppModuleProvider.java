package com.or.hasson.drawingapp.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.or.hasson.drawingapp.module.AppModuleProvider;
import com.or.hasson.drawingapp.requests.SquareRequest;


public class MainAppModuleProvider {

    private static final String SQUARE_REQ = "SQUARE";

    private static void sendRequest(String shape){
        if(shape.equals(SQUARE_REQ)){
            Injector injector = Guice.createInjector(new AppModuleProvider());
            SquareRequest request =  injector.getInstance(SquareRequest.class);
            request.makeRequest();

            SquareRequest requestSecond =  injector.getInstance(SquareRequest.class);
            boolean areDrawShapeEqual = request.getDrawShape() == requestSecond.getDrawShape();
            System.out.println(areDrawShapeEqual);

        }


    }

    public static void main(String[] args){
        sendRequest(SQUARE_REQ);

    }

}
