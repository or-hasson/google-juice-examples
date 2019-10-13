package com.or.hasson.drawingapp.module;

import com.google.inject.AbstractModule;
import com.or.hasson.drawingapp.services.DrawShape;
import com.or.hasson.drawingapp.services.DrawSquare;

public class AppModule extends AbstractModule {

    @Override
    protected void configure(){

        bind(DrawShape.class).to(DrawSquare.class);
    }
}
