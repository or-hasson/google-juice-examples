package com.or.hasson.drawingapp.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Names;
import com.or.hasson.drawingapp.annotations.*;
import com.or.hasson.drawingapp.services.DrawCircle;
import com.or.hasson.drawingapp.services.DrawShape;
import com.or.hasson.drawingapp.services.DrawSquare;
//import com.or.hasson.drawingapp.requests.SquareRequest;
//import com.google.inject.Scopes;

public class AppModule extends AbstractModule {

    @Override
    protected void configure() {

         /* * Annotations Parameters we can use the Provides Instead
        bind(DrawShape.class).annotatedWith(Names.named("Square")).to(DrawSquare.class);
        bind(DrawShape.class).annotatedWith(Names.named("Circle")).to(DrawCircle.class);*/

       /* * Annotations Parameters we can use the Provides Instead
       bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(75);
        bind(Integer.class).annotatedWith(RadiusValue.class).toInstance(5);

       Make only one Instance Of SquareResuest using Design Patter(SINGLETON)
        bind(SquareRequest.class).in(Scopes.SINGLETON);*/
    }

    @Provides
    @Singleton
    DrawShape providesDrawSqaure() {
        DrawShape square = new DrawSquare("Red", 75);
        return square;
    }

    /**
    @Provides
    DrawShape providesDrawCircle() {
        DrawShape circle = new DrawCircle("Green", 2);
        return circle;
    }
    **/


}
