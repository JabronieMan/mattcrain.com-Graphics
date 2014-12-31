package com.mattcrain.graphics.raytracer.primitives;

import org.la4j.vector.dense.BasicVector;

/**
 * Created by matt on 12/31/14.
 */
public class Vector3D extends BasicVector {
    public Vector3D(double x, double y, double z) {
        super(new double[]{x, y, z});
    }
}
