package com.bitblaster.entity;

import java.awt.Graphics2D;

import com.bitblaster.texture.Texture;
import com.bitblaster.utils.Vector2D;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Player extends PlayerSpaceShip {
	//PlayerSpaceShip spaceShip;

	public Player(int x, int y, int height, int width, String imagePath) {
		setPosition(new Vector2D<Integer>(x, y));
		setSize(new Vector2D<Integer>(height, width));
		texture = new Texture(imagePath);
	}
	
	
	public void draw() {

	}

	public void update() {

	}

	public void incrementPosition(double x, double y) {

	}

	@Override
	public void paint(Graphics2D graphic) {
		graphic.drawImage(getTexture().getImage(), getPosition().first,
				getPosition().second, getSize().first, getSize().second, null);
	}

	@Override
	public void move(int direction) {
		
	}
	
	public void moveRotatinalDirection(int direction) {
		orientation += rotationalVelocity * direction;
	}
}
