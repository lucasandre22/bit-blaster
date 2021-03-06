package com.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import com.bitblaster.entity.Entity;
import com.bitblaster.managers.InputManager;
import com.bitblaster.utils.EntityLists;

public class Panel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public static int WIDTH = 1920;
	public static int HEIGHT = 1080;
	int lala = 0;

	public Panel() {
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		this.addKeyListener(new InputManager());
		this.setBackground(Color.BLACK);
	}
	
	public void paint(Entity entity) {
		
	}
	
	@Override
	public void paint(Graphics graphic) {
		super.paintComponent(graphic);
        Graphics2D g2d = (Graphics2D) graphic.create();
		for(Entity entity : EntityLists.getInstance().getCurrentlyEntities()) {
			entity.paint(g2d);
		}

        //g2d.dispose();
	}

}
