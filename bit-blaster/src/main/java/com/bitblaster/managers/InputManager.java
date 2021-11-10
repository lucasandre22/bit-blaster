package com.bitblaster.managers;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import com.main.BitBlaster;

public class InputManager extends KeyAdapter {

	public enum GameKey {
		LEFT(KeyEvent.VK_LEFT),
		RIGHT(KeyEvent.VK_RIGHT);
		
		int code;
		GameKey(int code) {
			this.code = code;
		}
	}
	
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
			case KeyEvent.VK_LEFT :
				BitBlaster.getInstance().keyPressed(e.getKeyCode());
				break;
			case KeyEvent.VK_RIGHT:
				BitBlaster.getInstance().keyPressed(e.getKeyCode());
				break;
			default :
				break;
		}
	}

	public void keyReleased(KeyEvent e) {
		
	}
}
