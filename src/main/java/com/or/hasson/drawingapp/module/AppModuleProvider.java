package com.or.hasson.drawingapp.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.or.hasson.drawingapp.services.DrawShape;
import com.or.hasson.drawingapp.services.DrawSquareWithProvider;

public class AppModuleProvider extends AbstractModule {


    @Provides
    @Singleton
    DrawShape providesDrawSqaure() {
        DrawShape square = new DrawSquareWithProvider("Red", 75);
        return square;
    }


}
