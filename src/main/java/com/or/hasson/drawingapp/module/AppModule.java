package com.or.hasson.drawingapp.module;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.or.hasson.drawingapp.annotations.ColorValue;
import com.or.hasson.drawingapp.annotations.EdgeValue;
import com.or.hasson.drawingapp.requests.SquareRequest;
import com.or.hasson.drawingapp.services.DrawShape;
import com.or.hasson.drawingapp.services.DrawSquare;

public class AppModule extends AbstractModule {

    @Override
    protected void configure(){
        bind(DrawShape.class).to(DrawSquare.class);
        bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(75);

        //Make only one Instance Of SquareResuest using Design Patter(SINGLETON)
        //bind(SquareRequest.class).in(Scopes.SINGLETON);
    }
}
