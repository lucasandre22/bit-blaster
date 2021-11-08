package com.bitblaster.entity;

import com.bitblaster.texture.Texture;
import com.bitblaster.utils.Vector2D;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Entity implements EntityInterface {
	private Texture texture;
	private Vector2D<Integer> size;
	private Vector2D<Integer> position;
	private Vector2D<Double> velocity;

}
