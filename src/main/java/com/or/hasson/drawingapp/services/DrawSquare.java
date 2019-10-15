package com.or.hasson.drawingapp.services;

import com.google.inject.Inject;

public class DrawSquare implements DrawShape{

    private String color;
    private Integer size;
        @Inject
        public DrawSquare(String color, Integer size){
            this.color = color;
            this.size = size;
        }

        public void draw() {
            System.out.println("Drawing Sqaure with color: " + color + "  and radius of size: " + size);
        }
}

