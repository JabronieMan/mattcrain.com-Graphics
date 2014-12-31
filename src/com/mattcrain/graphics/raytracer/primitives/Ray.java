package com.mattcrain.graphics.raytracer.primitives;

/**
 * Created by matt on 12/31/14.
 */
public class Ray {

    private Vector3D origin, direction;

    public Ray() {
        origin = new Vector3D(0, 0, 0);
        direction = new Vector3D(0, 0, 0);
    }

    public Ray(Vector3D origin, Vector3D direction) {
        this.origin = origin;
        this.direction = direction;
    }

    public Vector3D getOrigin() {
        return origin;
    }

    public Vector3D getDirection() {
        return direction;
    }
}
