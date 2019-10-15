package com.or.hasson.drawingapp.module;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.or.hasson.drawingapp.annotations.*;
import com.or.hasson.drawingapp.providers.DrawCircleProvider;
import com.or.hasson.drawingapp.providers.DrawSquareProvider;
import com.or.hasson.drawingapp.services.DrawShape;

public class AppModuleProviderWithThread extends AbstractModule {

    @Override
    protected void configure() {
        bind(String.class).annotatedWith(SquareColorValue.class).toInstance("Green");
        bind(Integer.class).annotatedWith(SizeValue.class).toInstance(15);

/**
        bind(String.class).annotatedWith(CircleColorValue.class).toInstance("White");
        bind(Integer.class).annotatedWith(RadiusValue.class).toInstance(4);
**/
    }

}
