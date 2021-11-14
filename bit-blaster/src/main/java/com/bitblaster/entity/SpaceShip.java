package com.bitblaster.entity;

import com.bitblaster.utils.Vector2D;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public abstract class SpaceShip extends MovingEntity {
	private boolean isShooting;
	private double shotCooldown;

	public static final int DEFAULT_SHOOTING_COOLDOWN = 1;

	public SpaceShip(Vector2D<Integer> position, Vector2D<Integer> size, String texturePath) {
		super(position, size, texturePath);
		this.isShooting = false;
		this.shotCooldown = DEFAULT_SHOOTING_COOLDOWN;
	}

}
