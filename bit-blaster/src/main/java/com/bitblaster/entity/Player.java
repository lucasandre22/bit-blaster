package com.bitblaster.entity;

import java.awt.Graphics2D;

import com.bitblaster.texture.Texture;
import com.bitblaster.utils.Vector2D;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Player extends SpaceShip {
	protected double rotationalVelocity = 1;
	protected double orientation;

	public Player(Vector2D<Integer> position, Vector2D<Integer> size, String texturePath) {
		super(position, size, texturePath);
	}

	public void update() {
		//int a = this.position.second;
		//a += rotationalVelocity * 1;
		//this.setPosition(this.position.first, a);
	}

	public void incrementPosition(double x, double y) {

	}

	@Override
	public void paint(Graphics2D graphic) {
		update();
		graphic.drawImage(getImage(), getPosition().first.intValue(),
				getPosition().second.intValue(), getSize().first, getSize().second, null);
	}

	@Override
	public void move(int direction) {
		
	}

	public void moveRotatinalDirection(int direction) {
		int a = this.position.first;
		int b = this.position.second;
		a += rotationalVelocity * direction;
		b += rotationalVelocity * direction;
		this.setPosition(a, b);
		System.out.println("moving: " + orientation);
	}

	public void keyPressed(int direction) {
		moveRotatinalDirection(direction);
	}
}
