package com.or.hasson.drawingapp.requests;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.or.hasson.drawingapp.services.DrawSquareThread;


public class SquareRequestThread {
    Provider<DrawSquareThread> squareThreadProvider;


    @Inject
    public SquareRequestThread(Provider<DrawSquareThread> squareThreadProvider){
        this.squareThreadProvider = squareThreadProvider;
    }

    public void makeRequest(){
        DrawSquareThread drawSquareThread1 = squareThreadProvider.get();
        drawSquareThread1.draw();
        DrawSquareThread drawSquareThread2 = squareThreadProvider.get();
        drawSquareThread2.draw();
    }


}