package com.mattcrain.graphics.raytracer.scene;

import com.mattcrain.graphics.raytracer.primitives.Shape3D;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Scene3D {

    private Camera camera;
    private List<Shape3D> primitives;
    Color color;

    public Scene3D(Camera camera, Color defaultColor) {
        this.camera = camera;
        color = defaultColor;
        primitives = new ArrayList<Shape3D>();
    }
}
