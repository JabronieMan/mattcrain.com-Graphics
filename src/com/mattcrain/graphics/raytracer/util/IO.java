package com.mattcrain.graphics.raytracer.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * TODO: Insert description here. (generated by mcrain)
 */
public class IO {
  public static void writeBuffImgToFile(BufferedImage img, File file) {
    try {
      ImageIO.write(img, "png", file);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
