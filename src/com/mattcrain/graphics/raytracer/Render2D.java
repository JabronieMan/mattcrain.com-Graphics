package com.mattcrain.graphics.raytracer;

import com.mattcrain.graphics.raytracer.primitives.Circle;
import com.mattcrain.graphics.raytracer.primitives.Rectangle;
import com.mattcrain.graphics.raytracer.scene.Scene2D;
import com.mattcrain.graphics.raytracer.util.IO;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

public class Render2D {
  
  private int width, height;
  private File output;
  private Scene2D scene;
  
  public Render2D(int width, int height, File output, Color defaultColor) {
    this.width = width;
    this.height = height;
    this.output = output;
    scene = new Scene2D(defaultColor);
  }
  
  private void constructScene() {
    scene.addShapeToScene(new Circle(300, 300, 150, Color.GREEN));
    scene.addShapeToScene(new Rectangle(600, 200, 950, 600, Color.RED));
  }

  public void renderScene() {
    constructScene();
    
    BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    for(int x = 0; x < width; x++) {
      for(int y = 0; y < height; y++) {
        img.setRGB(x, y, scene.getColorAtPoint(x, y).getRGB());
      }
    }
    
    IO.writeBuffImgToFile(img, output);
  }
}
