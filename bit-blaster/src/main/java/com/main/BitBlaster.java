package com.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.math.BigInteger;

import javax.swing.Timer;

import com.bitblaster.entity.Player;
import com.bitblaster.managers.InputManager;
import com.bitblaster.utils.EntityFactory;
import com.bitblaster.utils.EntityLists;
import com.bitblaster.utils.GameKey;

import lombok.Getter;

@Getter
public class BitBlaster {
	private Window gameWindow;
	private static int deltaTime = 0;
	private Player player;
	private boolean isRunnning = false;
	private int frames = 0;
	
	private static BitBlaster INSTANCE;
	
	public BitBlaster() {
		initEntities();
		initPhase();
		gameWindow = new Window();
	}
	
	public static synchronized BitBlaster getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new BitBlaster();
		}
		return INSTANCE;
	}

	public static void main(String[] args) {
		BitBlaster.getInstance().run();
	}
	
	public void run() {
		/*new Thread(new Runnable() {
			@Override
			public void run() {
				BitBlaster.this.gameWindow.updateWindowComponents();
			}
		}).start();*/
		mainLoop();
	}
	
	public void initEntities() {
		this.player = EntityFactory.createPlayer(Window.WIDTH/2, Window.HEIGHT - Window.HEIGHT/3, 100, 100, "player.jpeg");
		EntityLists.getInstance().add(player);
	}

	public void initPhase() {
		
	}
	
	public void mainLoop() {
		long lastTime = System.nanoTime();
		long currentTime;
		int ns = 1000000;
		isRunnning = true;
		Timer timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Frames:" + frames);
				frames = 0;
			}
			
		});
		timer.start();
		while(isRunnning) {
			currentTime = System.nanoTime();
			deltaTime += (currentTime - lastTime) / ns;
			if(deltaTime >= 1) {
				deltaTime--;
				BitBlaster.this.gameWindow.updateWindowComponents();
				lastTime = currentTime;
				frames++;
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

