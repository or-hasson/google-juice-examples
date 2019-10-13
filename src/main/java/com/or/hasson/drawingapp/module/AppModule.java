package com.or.hasson.drawingapp.module;

import com.google.inject.AbstractModule;
import com.or.hasson.drawingapp.annotations.ColorValue;
import com.or.hasson.drawingapp.annotations.EdgeValue;
import com.or.hasson.drawingapp.services.DrawShape;
import com.or.hasson.drawingapp.services.DrawSquare;

public class AppModule extends AbstractModule {

    @Override
    protected void configure(){
        bind(DrawShape.class).to(DrawSquare.class);
        bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(75);
    }
}
