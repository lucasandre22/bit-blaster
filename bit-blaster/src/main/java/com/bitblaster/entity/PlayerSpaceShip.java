package com.bitblaster.entity;

import com.bitblaster.utils.Vector2D;

import lombok.Getter;

@Getter
public abstract class PlayerSpaceShip extends SpaceShip {

	public PlayerSpaceShip(Vector2D<Integer> position, Vector2D<Integer> size, String texturePath) {
		super(position, size, texturePath);
	}
}
