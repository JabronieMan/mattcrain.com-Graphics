package com.mattcrain.graphics.raytracer.scene;

import com.mattcrain.graphics.raytracer.primitives.Vector3D;

/**
 * Created by matt on 12/31/14.
 */
public class Camera {

    Vector3D origin, screenTopLeft, screenTopRight;

    public Camera(Vector3D origin, Vector3D screenTopLeft, Vector3D screenTopRight) {
        this.origin = origin;
        this.screenTopLeft = screenTopLeft;
        this.screenTopRight = screenTopRight;
    }
}
