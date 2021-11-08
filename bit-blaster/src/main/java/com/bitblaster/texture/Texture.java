package com.bitblaster.texture;

import lombok.Getter;

@Getter
public class Texture {
	private String imagePath;
	
	public Texture(String imagePath) {
		this.imagePath = imagePath;
	}

}
