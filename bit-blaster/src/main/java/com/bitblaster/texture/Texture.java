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
	//private HashMap<String, Image> textureImages;
	Image image;
	
	public Texture(String imagePath) {
		try {
			image = ImageIO.read(new File(System.getProperty("user.dir") + File.separator + imagePath));
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	/*public Image getTexture(String name) {
		return textureImages.get(name);
	}*/

}
