package com.bitblaster.entity;

import java.awt.Graphics;
import java.awt.Graphics2D;

import com.bitblaster.texture.Texture;
import com.bitblaster.utils.EntityLists;
import com.bitblaster.utils.Vector2D;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Entity {
	protected Texture texture;
	protected Vector2D<Integer> size;
	protected Vector2D<Integer> position;
	
	public Entity() {
		EntityLists.getInstance().add(this);
	}
	public abstract void draw();
	public abstract void update();
	public abstract void incrementPosition(double x, double y);
	public abstract void paint(Graphics2D graphic);

}
