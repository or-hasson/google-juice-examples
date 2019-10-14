package com.or.hasson.drawingapp.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.or.hasson.drawingapp.annotations.*;
import com.or.hasson.drawingapp.services.DrawCircleWithProvider;
import com.or.hasson.drawingapp.services.DrawShape;
import com.or.hasson.drawingapp.services.DrawSquareWithProvider;

public class AppModuleProvider extends AbstractModule {

    @Override
    protected void configure(){
        bind(String.class).annotatedWith(SquareColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(75);
        bind(String.class).annotatedWith(CircleColorValue.class).toInstance("Green");
        bind(Integer.class).annotatedWith(RadiusValue.class).toInstance(5);
    }

    @Provides
    @Singleton
    @Square
    DrawShape providesDrawSqaure(@SquareColorValue String color, @EdgeValue Integer edge) {
        DrawShape square = new DrawSquareWithProvider(color, edge);
        return square;
    }

    @Provides
    @Singleton
    @Circle
    DrawShape providesDrawCircle(@SquareColorValue String color, @RadiusValue Integer radius) {
        DrawShape circle = new DrawCircleWithProvider(color, radius);
        return circle;
    }


}
