package com.mattcrain.graphics.raytracer.primitives;

public interface Shape3D {

    /**
     * Given a ray, this returns the intersection information between the ray and the primitive.
     * @param ray The ray being shot at the primitive.
     * @return @Intersection object with all information required for shading and other processing.
     */
    Intersection intersect(Ray ray);
}
