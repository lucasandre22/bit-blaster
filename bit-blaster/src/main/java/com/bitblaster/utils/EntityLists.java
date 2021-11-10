package com.bitblaster.utils;

import java.awt.List;
import java.util.ArrayList;

import com.bitblaster.entity.Entity;
import com.bitblaster.entity.Player;

import lombok.Getter;

@Getter
public class EntityLists {

	private static final long serialVersionUID = 1L;
	
	private ArrayList<Entity> currentlyEntities;
	private static EntityLists INSTANCE = null;
	
	public EntityLists() {
		currentlyEntities = new ArrayList<>();
	}
	
	public static synchronized EntityLists getInstance() {
		if(INSTANCE == null) {
			return new EntityLists();
		}
		return INSTANCE;
	}
	
	public ArrayList<Entity> getCurrentlyEntities() {
		return this.currentlyEntities;
	}

	public void addPlayer(int x, int y, int height, int width) {
		currentlyEntities.add(new Player(x, y, height, width, "SpaceShip.jpeg"));
	}
	
	public void add(Entity e) {
		currentlyEntities.add(e);
	}
}
