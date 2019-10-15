package com.or.hasson.drawingapp.providers;

import com.google.inject.Provider;
import com.or.hasson.drawingapp.services.DrawSquare;

public class DrawSquareProvider implements Provider<DrawSquare>{

    @Override
    public DrawSquare get() {
        DrawSquare square = new DrawSquare("Blue", 77);
        return  square;
    }
}
