package com.bitblaster.entity;

import com.bitblaster.utils.Vector2D;

import lombok.Getter;

@Getter
public abstract class PlayerSpaceShip extends SpaceShip {
	protected double rotationalVelocity;
	protected double orientation;
}
