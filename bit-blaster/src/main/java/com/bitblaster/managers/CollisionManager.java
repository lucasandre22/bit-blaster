package com.bitblaster.managers;

import java.util.PriorityQueue;

import com.bitblaster.entity.Entity;
import com.bitblaster.utils.EntityLists;

public class CollisionManager {

	private PriorityQueue<Entity> nearPlayerEntities;
	private static CollisionManager INSTANCE;
	
	public CollisionManager() {

	}
	
	public static synchronized CollisionManager getInstance() {
		if(INSTANCE == null) {
			return new CollisionManager();
		}
		return INSTANCE;
	}
	
}
