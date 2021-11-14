package com.bitblaster.entity;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import com.bitblaster.texture.Texture;
import com.bitblaster.texture.TextureMap;
import com.bitblaster.utils.EntityLists;
import com.bitblaster.utils.Vector2D;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Entity {
	protected Texture texture;
	protected Vector2D<Integer> position;
	protected Vector2D<Integer> size;

	public Entity(Vector2D<Integer> position, Vector2D<Integer> size, String texturePath) {
		this.position = position;
		this.size = size;
		this.texture = TextureMap.getInstance().getTexture(texturePath);
		EntityLists.getInstance().add(this);
	}

	public abstract void update();
	public abstract void incrementPosition(double x, double y);
	public void paint(Graphics2D graphic) {
		update();
		graphic.drawImage(getImage(), getPosition().first.intValue(),
				getPosition().second.intValue(), getSize().first, getSize().second, null);
	}

	public Image getImage() {
		return texture.getImage();
	}
	
	public void setPosition(int x, int y) {
		this.position.set(x, y);
	}

}
