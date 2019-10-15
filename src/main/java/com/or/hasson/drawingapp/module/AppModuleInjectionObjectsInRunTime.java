package com.or.hasson.drawingapp.module;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.multibindings.Multibinder;
import com.or.hasson.drawingapp.annotations.*;
import com.or.hasson.drawingapp.providers.DrawCircleProvider;
import com.or.hasson.drawingapp.providers.DrawSquareProvider;
import com.or.hasson.drawingapp.services.DrawCircleRunTime;
import com.or.hasson.drawingapp.services.DrawShape;
import com.or.hasson.drawingapp.services.DrawShapeInjectObjectsInRuntime;
import com.or.hasson.drawingapp.services.DrawSquareRunTime;

public class AppModuleInjectionObjectsInRunTime extends AbstractModule {

    @Override
    protected void configure() {
        Multibinder<DrawShapeInjectObjectsInRuntime> drawShapeBinder = Multibinder.newSetBinder(binder(), DrawShapeInjectObjectsInRuntime.class);
        drawShapeBinder.addBinding().to(DrawSquareRunTime.class);
        drawShapeBinder.addBinding().to(DrawCircleRunTime.class);
    }

}
