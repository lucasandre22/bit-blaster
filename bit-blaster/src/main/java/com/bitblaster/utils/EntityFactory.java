package com.bitblaster.utils;

import com.bitblaster.entity.Enemy;
import com.bitblaster.entity.Player;

public class EntityFactory {

	public static Player createPlayer(int x, int y, int height, int width, String imagePath) {
		return new Player(new Vector2D<Integer>(x,y), new Vector2D<Integer>(height,width), imagePath);
	}

	public static Enemy createEnemy(int x, int y, int height, int width, String imagePath) {
		return new Enemy(new Vector2D<Integer>(x,y), new Vector2D<Integer>(height, width), imagePath);
	}
}
