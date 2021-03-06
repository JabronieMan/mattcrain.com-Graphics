package com.mattcrain.graphics.raytracer.primitives;

import java.awt.Color;
import java.awt.geom.Point2D;

public class Circle implements Shape2D {
  
  private Color color;
  private Point2D.Float center;
  private float radius;
  
  public Circle(Point2D.Float center, float radius, Color color) {
    this.center = center;
    this.radius = radius;
    this.color = color;
  }
  
  public Circle(float centerX, float centerY, float radius, Color color) {
    this(new Point2D.Float(centerX, centerY), radius, color);
  }
  
  @Override
  public Color pointInShape(Point2D point) {
    if(center.distance(point) <= radius) {
      return color;
    }
    return null;
  }

}
