package com.bitblaster.texture;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

import lombok.Getter;

@Getter
public class Texture {
	private Image image;
	private String imagePath;
	
	public Texture(String imagePath) {
		try {
			image = ImageIO.read(new File(imagePath));
		} catch(IOException e) {
			System.out.println("Unable to load image on " + imagePath);
			e.printStackTrace();
		}
		this.imagePath = imagePath;
	}

	public String getPath() {
		return imagePath;
	}
}
