package com.main;

import com.bitblaster.entity.Player;

import lombok.Getter;

@Getter
public class BitBlaster {
	Window gameWindow;
	private static int deltaTime;
	private static Player player;
	
	public BitBlaster() {
		//player = new Player();
		initEntities();
		initPhase();
		gameWindow = new Window();
		//this.player = new Player();
		gameWindow.updateWindowComponents();
		
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

