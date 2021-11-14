package com.main;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

import com.bitblaster.managers.InputManager;

public class Window extends JFrame {
	
	private static final long serialVersionUID = 1L;
	public static int WIDTH = 1920;
	public static int HEIGHT = 1080;
	Panel panel;
	
	public Window() {
		this.panel = new Panel();
		this.add(panel);
		this.setSize(WIDTH, HEIGHT);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.addKeyListener(new InputManager());
	}
	
	public void updateWindowComponents() {
		repaint();
	}
}
