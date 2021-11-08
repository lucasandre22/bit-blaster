package com.main;

import com.bitblaster.entity.Player;

import lombok.Getter;

@Getter
public class BitBlaster {
	
	public static int deltaTime;
	public static Player player;
	
	public BitBlaster() {
		player = new Player();
		initEntities();
		initPhase();
	}

	public static void main(String[] args) {
		BitBlaster game = new BitBlaster();
		game.run();
	}

	public void run() {
		new Thread() {
			
		};
	}
	
	public void initEntities() {
		
	}

	public void initPhase() {
		
	}
}

