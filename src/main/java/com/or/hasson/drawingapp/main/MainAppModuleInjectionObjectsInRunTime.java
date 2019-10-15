package com.or.hasson.drawingapp.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.or.hasson.drawingapp.constans.Constants;
import com.or.hasson.drawingapp.module.AppModuleInjectionObjectsInRunTime;
import com.or.hasson.drawingapp.module.AppModuleToProvider;
import com.or.hasson.drawingapp.requests.CircleRequest;
import com.or.hasson.drawingapp.requests.ShapeRequest;
import com.or.hasson.drawingapp.requests.SquareRequest;


public class MainAppModuleInjectionObjectsInRunTime {

    private static final String SQAURE_REQ = "SQUARE";
    private static final String CIRCLE_REQ = "CIRCLE";

    private static void sendRequest(String sqaureReq) {

        if(sqaureReq.equals(SQAURE_REQ)){
            Injector injector = Guice.createInjector(new AppModuleInjectionObjectsInRunTime());
            ShapeRequest request = injector.getInstance(ShapeRequest.class);
            request.makeRequest(Constants.SQUARE);
        }

        if(sqaureReq.equals(CIRCLE_REQ)){
            Injector injector = Guice.createInjector(new AppModuleInjectionObjectsInRunTime());
            ShapeRequest request = injector.getInstance(ShapeRequest.class);
            request.makeRequest(Constants.CIRCLE);
        }

    }

    public static void main(String[] args) {
        sendRequest(SQAURE_REQ);
        sendRequest(CIRCLE_REQ);
    }
}
