package com.or.hasson.drawingapp.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.or.hasson.drawingapp.module.AppModuleAnnotations;
import com.or.hasson.drawingapp.requests.CircleRequestWithNamedAnnotation;
import com.or.hasson.drawingapp.requests.SquareRequestWithNamedAnnotation;

public class MainAppModuleAnnotations {

    private static final String SQUARE_REQ = "SQUARE";
    private static final String CIRCLE_REQ = "CIRCLE";

    private static void sendRequest(String shape){
        if(shape.equals(SQUARE_REQ)){
            Injector injector = Guice.createInjector(new AppModuleAnnotations());
            SquareRequestWithNamedAnnotation request =  injector.getInstance(SquareRequestWithNamedAnnotation.class);
            request.makeRequest();

        }
            if(shape.equals(CIRCLE_REQ)){
                Injector injector = Guice.createInjector(new AppModuleAnnotations());
                CircleRequestWithNamedAnnotation request =  injector.getInstance(CircleRequestWithNamedAnnotation.class);
                request.makeRequest();
            }

    }

    public static void main(String[] args){
        sendRequest(SQUARE_REQ);
        sendRequest(CIRCLE_REQ);
    }

}
