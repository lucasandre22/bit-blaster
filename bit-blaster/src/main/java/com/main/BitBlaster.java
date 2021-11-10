package com.main;

import java.awt.event.KeyEvent;

import com.bitblaster.entity.Player;
import com.bitblaster.managers.InputManager;
import com.bitblaster.utils.EntityLists;
import com.bitblaster.utils.GameKey;

import lombok.Getter;

@Getter
public class BitBlaster {
	private Window gameWindow;
	private static int deltaTime;
	private Player player;
	private boolean isRunnning = false;
	
	private static BitBlaster INSTANCE;
	
	public BitBlaster() {
		//player = new Player();
		initEntities();
		initPhase();
		gameWindow = new Window();
		this.player = new Player(0, 0, 0, 0, null);
	}
	
	public static synchronized BitBlaster getInstance() {
		if(INSTANCE == null) {
			return new BitBlaster();
		}
		return INSTANCE;
	}

	public static void main(String[] args) {
		BitBlaster.getInstance().run();
	}
	
	public void run() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				BitBlaster.this.gameWindow.updateWindowComponents();
			}
		}).start();
	}
	
	public void initEntities() {
		
	}

	public void initPhase() {
		
	}
	
	public void mainLoop() {
		long lastTime = System.nanoTime();
		long currentTime;
		int ns = 100;
		while(isRunnning) {
			currentTime = System.nanoTime();
			deltaTime += (currentTime - lastTime) / ns;
			if(deltaTime >= 1) {
				deltaTime--;
			}
		}
	}
	
	public void keyPressed(int keyCode) {
		
		switch(keyCode) {
			case 1 :
				player.moveRotatinalDirection(-1);
			case -1 :
				player.moveRotatinalDirection(1);
			default:
				break;
		}
	}
}

