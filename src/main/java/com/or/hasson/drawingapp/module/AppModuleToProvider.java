package com.or.hasson.drawingapp.module;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.or.hasson.drawingapp.annotations.*;
import com.or.hasson.drawingapp.providers.DrawCircleProvider;
import com.or.hasson.drawingapp.providers.DrawSquareProvider;
import com.or.hasson.drawingapp.services.DrawShape;

import javax.inject.Provider;

public class AppModuleToProvider extends AbstractModule {

    @Override
    protected void configure() {
        bind(DrawShape.class).annotatedWith(Square.class).toProvider(DrawSquareProvider.class).in(Scopes.SINGLETON);
        bind(String.class).annotatedWith(SquareColorValue.class).toInstance("Green");
        bind(Integer.class).annotatedWith(SizeValue.class).toInstance(15);


        bind(DrawShape.class).annotatedWith(Circle.class).toProvider(DrawCircleProvider.class).in(Scopes.SINGLETON);
        bind(String.class).annotatedWith(CircleColorValue.class).toInstance("White");
        bind(Integer.class).annotatedWith(RadiusValue.class).toInstance(4);

    }

}
