package com.or.hasson.drawingapp.providers;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.or.hasson.drawingapp.annotations.SizeValue;
import com.or.hasson.drawingapp.annotations.SquareColorValue;
import com.or.hasson.drawingapp.services.DrawSquare;

public class DrawSquareProvider implements Provider<DrawSquare>{

    private String color;
    private Integer size;

    @Inject
    public DrawSquareProvider(@SquareColorValue String color,@SizeValue Integer size){
        this.color = color;
        this.size = size;
    }
    public DrawSquare get() {
        DrawSquare square = new DrawSquare(color, size);
        return  square;
    }
}
