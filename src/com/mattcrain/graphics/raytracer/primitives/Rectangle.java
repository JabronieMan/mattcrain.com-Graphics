package com.mattcrain.graphics.raytracer.primitives;

import java.awt.Color;
import java.awt.geom.Point2D;

public class Rectangle implements Shape2D {
  
  private Color color;
  private Point2D.Float topLeft, bottomRight;
  
  public Rectangle(Point2D.Float topLeft, Point2D.Float bottomRight, Color color) {
    this.topLeft = topLeft;
    this.bottomRight = bottomRight;
    this.color = color;
  }
  
  public Rectangle(float topLeftX, float topLeftY,
      float bottomRightX, float bottomRightY, Color color) {
    this(new Point2D.Float(topLeftX, topLeftY),
        new Point2D.Float(bottomRightX, bottomRightY), color);
  }

  @Override
  public Color pointInShape(Point2D point) {
    if(topLeft.getX() <= point.getX() && point.getX() <= bottomRight.getX() &&
        topLeft.getY() <= point.getY() && point.getY() <= bottomRight.getY()) {
      return color;
    }
    return null;
  }

}
