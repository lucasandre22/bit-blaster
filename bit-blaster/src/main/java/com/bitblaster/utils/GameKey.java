package com.bitblaster.utils;

import java.awt.event.KeyEvent;

public enum GameKey {
	LEFT(KeyEvent.VK_LEFT),
	RIGHT(KeyEvent.VK_RIGHT);
	
	int code;
	GameKey(int code) {
		this.code = code;
	}
}
