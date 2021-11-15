package com.bitblaster.entity;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;

import com.bitblaster.texture.Texture;
import com.bitblaster.utils.Vector2D;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Player extends SpaceShip {
	protected double rotationalVelocity = 5;
	protected double orientation;
	protected double angle = 0.0f;

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
		AffineTransform old = graphic.getTransform();
		graphic.rotate(Math.toRadians(angle), getPosition().first.intValue()+getSize().first/2, getPosition().second.intValue()+getSize().second/2);
		
		graphic.drawImage(getImage(), getPosition().first.intValue(),
				getPosition().second.intValue(), getSize().first, getSize().second, null);
		graphic.setTransform(old);
	}

	@Override
	public void move(int direction) {
		
	}

	public void moveRotatinalDirection(int direction) {
		int a = this.position.first;
		int b = this.position.second;
		double angleInRadians = Math.toRadians(angle);
		a += rotationalVelocity * direction;
		b += rotationalVelocity * direction;
		
		a += Math.cos(angleInRadians);
		b += Math.sin(angleInRadians);
		this.setPosition(a, b);
		angle += direction * 5;
	}

	public void keyPressed(int direction) {
		moveRotatinalDirection(direction);
	}
}
