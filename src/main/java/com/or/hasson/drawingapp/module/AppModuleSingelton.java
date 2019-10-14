package com.or.hasson.drawingapp.module;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.name.Names;
import com.or.hasson.drawingapp.annotations.*;
import com.or.hasson.drawingapp.requests.CircleRequestWithNamedAnnotation;
import com.or.hasson.drawingapp.requests.SquareRequest;
import com.or.hasson.drawingapp.requests.SquareRequestWithNamedAnnotation;
import com.or.hasson.drawingapp.services.*;


public class AppModuleSingelton extends AbstractModule {

    @Override
    protected void configure() {


        bind(DrawShape.class).annotatedWith(Names.named("Square")).to(DrawSquareWithAnnotations.class);
        bind(DrawShape.class).annotatedWith(Names.named("Circle")).to(DrawCircleWithAnnotations.class);

        bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(75);
        bind(Integer.class).annotatedWith(RadiusValue.class).toInstance(5);

        bind(SquareRequestWithNamedAnnotation.class).in(Scopes.SINGLETON);
        bind(CircleRequestWithNamedAnnotation.class).in(Scopes.SINGLETON);
    }

}
