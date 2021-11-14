package com.bitblaster.texture;

import java.io.File;
import java.util.HashMap;

import lombok.Getter;

@Getter
public class TextureMap {

	private final String defaultImagesDirectory = "img" + File.separator;
	private HashMap<String, Texture> textureMap = new HashMap<String, Texture>();

	private static TextureMap INSTANCE = null;


	public TextureMap() {
		this.loadImagesFromDirectory(defaultImagesDirectory);
	}

	public static synchronized TextureMap getInstance() {
		if(INSTANCE == null) 
			INSTANCE = new TextureMap();
		return INSTANCE;
	}

	public void loadImagesFromDirectory(String directory) {
		File defaultDirectory = new File(defaultImagesDirectory);
		for(File img : defaultDirectory.listFiles()) {
			this.putTexture(img.getAbsolutePath());
		}
	}

	/*
	 * @param textureName
	 * @return the texture
	 */
	public Texture getTexture(String textureName) {
		Texture texture = textureMap.get(textureName);
		if(texture == null)
			System.out.println("Could not locate texture from texture name " + textureName);
		return texture;
	}

	
	public void putTexture(File file) {
		Texture textureToAdd = new Texture(file.getAbsolutePath());
		if(textureToAdd != null)
			textureMap.put(file.getName(), textureToAdd);
	}

	public void putTexture(String textureName) {
		this.putTexture(new File(textureName));
	}

}
