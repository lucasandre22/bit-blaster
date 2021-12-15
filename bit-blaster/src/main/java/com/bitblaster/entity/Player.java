package com.bitblaster.entity;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;

import com.bitblaster.texture.Texture;
import com.bitblaster.utils.Vector2D;
import com.main.BitBlaster;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Player extends SpaceShip {
	protected double rotationalVelocity = 8;
	protected double orientation;
	protected double angle = 0.0f;

	public Player(Vector2D<Integer> position, Vector2D<Integer> size, String texturePath) {
		super(position, size, texturePath);
		velocity.first = 1.0d;
	}

	public void update() {
		double a = 0.0d;
		double b = 0.0d;
		double angleInRadians = Math.toRadians(angle);
		a = velocity.first * 0.0000125 * Math.cos(angleInRadians);
		b = velocity.first * 0.0000125 * Math.sin(angleInRadians);
		this.position.first = (int) (this.position.first + a);
		this.position.second = (int) (this.position.second + b);
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
		a += velocity.first * 0.25 + Math.cos(angleInRadians);
		b += velocity.first * 0.25 * Math.sin(angleInRadians);
		this.setPosition(a, b);
		angle += direction * 5;
	}

	public void keyPressed(int direction) {
		moveRotatinalDirection(direction);
	}
}
