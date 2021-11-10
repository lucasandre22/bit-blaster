package com.bitblaster.entity;

import com.bitblaster.utils.Vector2D;

public abstract class MovingEntity extends Entity {

	protected Vector2D<Double> velocity;
	
	public abstract void move(int direction);
}
