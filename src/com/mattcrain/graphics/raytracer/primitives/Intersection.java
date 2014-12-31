package com.mattcrain.graphics.raytracer.primitives;

import java.awt.*;

/**
 * Created by matt on 12/31/14.
 */
public class Intersection {

    private final Vector3D point, normal;
    private final Color color;
    private final Shape3D parent;

    public Intersection(Vector3D point, Vector3D normal, Color color, Shape3D parent) {
        this.point = point;
        this.normal = normal;
        this.color = color;
        this.parent = parent;
    }

    public Vector3D getPoint() {
        return point;
    }

    public Vector3D getNormal() {
        return normal;
    }

    public Color getColor() {
        return color;
    }

    public Shape3D getParent() {
        return parent;
    }
}
