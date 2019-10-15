package com.or.hasson.drawingapp.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.or.hasson.drawingapp.module.AppModuleToProvider;
import com.or.hasson.drawingapp.requests.CircleRequest;
import com.or.hasson.drawingapp.requests.SquareRequest;


public class MainAppModuleWithToProviderClass {

    private static final String SQAURE_REQ = "SQUARE";
    private static final String CIRCLE_REQ = "CIRCLE";

    private static void sendRequest(String sqaureReq) {

        if(sqaureReq.equals(SQAURE_REQ)){
            Injector injector = Guice.createInjector(new AppModuleToProvider());
            SquareRequest request = injector.getInstance(SquareRequest.class);
            request.makeRequest();
        }

        if(sqaureReq.equals(CIRCLE_REQ)){
            Injector injector = Guice.createInjector(new AppModuleToProvider());
            CircleRequest request = injector.getInstance(CircleRequest.class);
            request.makeRequest();
        }

    }

    public static void main(String[] args) {
        sendRequest(SQAURE_REQ);
        sendRequest(CIRCLE_REQ);
    }
}
