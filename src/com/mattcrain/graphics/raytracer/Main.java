package com.mattcrain.graphics.raytracer;

import java.awt.Color;
import java.io.File;

public class Main {

  private static final int WIDTH = 1280, HEIGHT = 720;
  private static final Color BACKGROUND = new Color(0.05f, 0.05f, 0.05f);
  
  public static void main(String[] args) {
    Create2DImage("/tmp/2d-render.png");
  }
  
  public static void Create2DImage(String fileLoc) {
    File out = new File(fileLoc);
    Render2D render = new Render2D(WIDTH, HEIGHT, out, BACKGROUND);
    render.renderScene();
    System.out.println("Render Complete");
  }

}
