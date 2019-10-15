package com.or.hasson.drawingapp.providers;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.or.hasson.drawingapp.annotations.SizeValue;
import com.or.hasson.drawingapp.annotations.SquareColorValue;
import com.or.hasson.drawingapp.services.DrawSquareThread;

public class DrawSquareThreadProvider implements Provider<DrawSquareThread>{

    private String color;
    private Integer size;

    @Inject
    public DrawSquareThreadProvider(@SquareColorValue String color, @SizeValue Integer size){
        this.color = color;
        this.size = size;
    }
    public DrawSquareThread get() {
        DrawSquareThread square = new DrawSquareThread(color, size);
        return  square;
    }
}
