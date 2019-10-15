package com.or.hasson.drawingapp.services;

import com.google.inject.Inject;
import com.or.hasson.drawingapp.annotations.SizeValue;
import com.or.hasson.drawingapp.annotations.SquareColorValue;

public class DrawSquareThread implements DrawShape{

    private String color;
    private Integer size;

    //Thread with Lambda Expression
    Thread t = new Thread(() -> System.out.println("Drawing Square of color : " + color + " and edge : " + size));

    @Inject
    public DrawSquareThread(@SquareColorValue  String color,@SizeValue Integer size){
        this.color = color;
        this.size = size;
    }

    @Override
    public void draw() {
      t.start();
    }

}

