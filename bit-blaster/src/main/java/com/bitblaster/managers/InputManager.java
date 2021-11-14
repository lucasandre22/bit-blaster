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

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
			case KeyEvent.VK_LEFT :
				BitBlaster.getInstance().getPlayer().keyPressed(-1);
				break;
			case KeyEvent.VK_RIGHT:
				BitBlaster.getInstance().getPlayer().keyPressed(1);
				break;
			default :
				break;
		}
	}

	public void keyReleased(KeyEvent e) {
		
	}
}
