package com.mattcrain.graphics.raytracer.scene;

import com.mattcrain.graphics.raytracer.primitives.Shape2D;

import java.awt.Color;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

public class Scene2D {
  
  private List<Shape2D> primitives;
  Color color;
  
  public Scene2D(Color defaultColor) {
    primitives = new ArrayList<Shape2D>();
    color = defaultColor;
  }
  
  public void addShapeToScene(Shape2D shape) {
    primitives.add(shape);
  }

  public Color getColorAtPoint(Point2D point) {
    Color intersect;
    for(Shape2D shape : primitives) {
      intersect = shape.pointInShape(point);
      if(intersect != null) {
        return intersect;
      }
    }
    return color;
  }
  
  public Color getColorAtPoint(int x, int y) {
    return this.getColorAtPoint(new Point2D.Float(x, y));
  }
}
