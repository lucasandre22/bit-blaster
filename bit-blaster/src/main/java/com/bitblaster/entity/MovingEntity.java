package com.bitblaster.entity;

import com.bitblaster.utils.Vector2D;

public abstract class MovingEntity extends Entity {

	protected Vector2D<Double> velocity = new Vector2D<Double>();
	
	public MovingEntity(Vector2D<Integer> position, Vector2D<Integer> size, String texturePath) {
		super(position, size, texturePath);
	}

	public abstract void move(int direction);
}
