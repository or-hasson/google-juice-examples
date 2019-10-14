package com.or.hasson.drawingapp.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.or.hasson.drawingapp.module.AppModuleSingelton;
import com.or.hasson.drawingapp.requests.CircleRequest;
import com.or.hasson.drawingapp.requests.CircleRequestWithNamedAnnotation;
import com.or.hasson.drawingapp.requests.SquareRequestWithNamedAnnotation;

public class MainAppModuleSingelton {

    private static final String SQUARE_REQ = "SQUARE";
    private static final String CIRCLE_REQ = "CIRCLE";

    private static void sendRequest(String shape){
        if(shape.equals(SQUARE_REQ)){
            Injector injector = Guice.createInjector(new AppModuleSingelton());
            SquareRequestWithNamedAnnotation request =  injector.getInstance(SquareRequestWithNamedAnnotation.class);
            request.makeRequest();

            SquareRequestWithNamedAnnotation requestSecond =  injector.getInstance(SquareRequestWithNamedAnnotation.class);
            boolean areDrawShapeEqual = request.getDrawShape() == requestSecond.getDrawShape();
            System.out.println(areDrawShapeEqual);
        }
            if(shape.equals(CIRCLE_REQ)){
                Injector injector = Guice.createInjector(new AppModuleSingelton());
                CircleRequestWithNamedAnnotation request =  injector.getInstance(CircleRequestWithNamedAnnotation.class);
                request.makeRequest();

                CircleRequestWithNamedAnnotation requestSecond =  injector.getInstance(CircleRequestWithNamedAnnotation.class);
                boolean areDrawShapeEqual = request.getDrawShape() == requestSecond.getDrawShape();
                System.out.println(areDrawShapeEqual);
            }

    }

    public static void main(String[] args){
        sendRequest(SQUARE_REQ);
        sendRequest(CIRCLE_REQ);
    }

}
