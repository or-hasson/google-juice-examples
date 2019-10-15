package com.or.hasson.drawingapp.requests;

import com.google.inject.Inject;
import com.or.hasson.drawingapp.services.DrawShapeInjectObjectsInRuntime;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShapeRequest {
    Map<String, DrawShapeInjectObjectsInRuntime> shapeNameAndDrawShape;

    @Inject
    public ShapeRequest(Set <DrawShapeInjectObjectsInRuntime> set){
        shapeNameAndDrawShape = new HashMap <String,DrawShapeInjectObjectsInRuntime>();
        for(DrawShapeInjectObjectsInRuntime index : set){
            shapeNameAndDrawShape.put(index.getShapeName(),index);
        }
    }

    public void makeRequest(String ShapeName){
        DrawShapeInjectObjectsInRuntime shape = shapeNameAndDrawShape.get(ShapeName);
        shape.draw();
    }
}
