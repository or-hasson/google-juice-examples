package com.or.hasson.drawingapp.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.or.hasson.drawingapp.module.AppModuleProvider;
import com.or.hasson.drawingapp.module.AppModuleToProvider;
import com.or.hasson.drawingapp.requests.SquareRequest;


public class MainAppModuleProvider {

    private static final String SQUARE_REQ = "SQUARE";

    private static void sendRequest(String shape){
        if(shape.equals(SQUARE_REQ)){
            Injector injector = Guice.createInjector(new AppModuleToProvider());
            SquareRequest request = injector.getInstance(SquareRequest.class);
            request.makeRequest();
        }


    }

    public static void main(String[] args){
        sendRequest(SQUARE_REQ);

    }

}
