package com.mattcrain.graphics.raytracer.primitives;

/**
 * Created by matt on 12/31/14.
 */
public class Sphere implements Shape3D {

    private Vector3D center;
    private double radius;

    public Sphere(Vector3D center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public Intersection intersect(Ray ray) {
        return null;
    }

}
