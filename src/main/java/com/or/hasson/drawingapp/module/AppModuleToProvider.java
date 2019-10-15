package com.or.hasson.drawingapp.module;

import com.google.inject.AbstractModule;
import com.or.hasson.drawingapp.providers.DrawSquareProvider;
import com.or.hasson.drawingapp.services.DrawShape;

import javax.inject.Provider;

public class AppModuleToProvider extends AbstractModule {

    @Override
    protected void configure() {
        bind(DrawShape.class).toProvider(DrawSquareProvider.class);
    }

}
