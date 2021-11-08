package com.bitblaster.managers;

import java.util.PriorityQueue;

import com.bitblaster.entity.Entity;
import com.bitblaster.utils.EntityList;

public class CollisionManager {

	private EntityList entityList;
	private PriorityQueue<Entity> nearPlayerEntities;
	private static CollisionManager INSTANCE;
	
	public CollisionManager() {
		entityList = new EntityList();
	}
	
	public static synchronized CollisionManager getInstance() {
		if(INSTANCE == null) {
			return new CollisionManager();
		}
		return INSTANCE;
	}
	
}
