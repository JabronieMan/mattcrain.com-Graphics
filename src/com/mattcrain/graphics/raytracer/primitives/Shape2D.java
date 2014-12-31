package com.mattcrain.graphics.raytracer.primitives;

import java.awt.Color;
import java.awt.geom.Point2D;

/**
 * Simple interface for defining what a Shape should provide us.
 */
public interface Shape2D {
  /**
   * Basic point checking to determine if the point lies within the primitive.
   * @param point The point to check if it is in the shape
   * @return the color of the shape if the point is in the shape, null otherwise.
   */
  Color pointInShape(Point2D point);
}
