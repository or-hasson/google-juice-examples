package com.or.hasson.drawingapp.module;
import com.google.inject.AbstractModule;
import com.or.hasson.drawingapp.annotations.*;
import com.or.hasson.drawingapp.services.DrawCircle;
import com.or.hasson.drawingapp.services.DrawShape;
import com.or.hasson.drawingapp.services.DrawSquare;
//import com.or.hasson.drawingapp.requests.SquareRequest;
//import com.google.inject.Scopes;

public class AppModule extends AbstractModule {

    @Override
    protected void configure(){
        bind(DrawShape.class).annotatedWith(Square.class).to(DrawSquare.class);
        bind(DrawShape.class).annotatedWith(Circle.class).to(DrawCircle.class);

        bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(75);
        bind(Integer.class).annotatedWith(RadiusValue.class).toInstance(5);

        //Make only one Instance Of SquareResuest using Design Patter(SINGLETON)
        //bind(SquareRequest.class).in(Scopes.SINGLETON);
    }
}
