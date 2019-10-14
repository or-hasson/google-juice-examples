package com.or.hasson.drawingapp.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.or.hasson.drawingapp.module.AppModuleProvider;
import com.or.hasson.drawingapp.module.AppModuleSingelton;
import com.or.hasson.drawingapp.requests.CircleRequestWithAnnotation;
import com.or.hasson.drawingapp.requests.CircleRequestWithNamedAnnotation;
import com.or.hasson.drawingapp.requests.SquareRequest;
import com.or.hasson.drawingapp.requests.SquareRequestWithAnnotation;


public class MainAppModuleMultipleProviders {

    private static final String SQUARE_REQ = "SQUARE";
    private static final String CIRCLE_REQ = "CIRCLE";

    private static void sendRequest(String shape){
        if(shape.equals(SQUARE_REQ)){
            Injector injector = Guice.createInjector(new AppModuleProvider());
            SquareRequestWithAnnotation request =  injector.getInstance(SquareRequestWithAnnotation.class);
            request.makeRequest();

            SquareRequestWithAnnotation requestSecond =  injector.getInstance(SquareRequestWithAnnotation.class);
            boolean areDrawShapeEqual = request.getDrawShape() == requestSecond.getDrawShape();
            System.out.println(areDrawShapeEqual);

        }

        if(shape.equals(CIRCLE_REQ)){
            Injector injector = Guice.createInjector(new AppModuleProvider());
            CircleRequestWithAnnotation request =  injector.getInstance(CircleRequestWithAnnotation.class);
            request.makeRequest();

            CircleRequestWithAnnotation requestSecond =  injector.getInstance(CircleRequestWithAnnotation.class);
            boolean areDrawShapeEqual = request.getDrawShape() == requestSecond.getDrawShape();
            System.out.println(areDrawShapeEqual);
        }


    }

    public static void main(String[] args){
        sendRequest(SQUARE_REQ);
        sendRequest(CIRCLE_REQ);
    }

}
