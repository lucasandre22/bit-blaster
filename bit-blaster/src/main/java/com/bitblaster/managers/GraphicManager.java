package com.bitblaster.managers;

public class GraphicManager {
	
	
	private static GraphicManager INSTANCE;
	
	public GraphicManager() {
	}
	
	public static synchronized GraphicManager getInstance() {
		if(INSTANCE == null) {
			return new GraphicManager();
		}
		return INSTANCE;
	}

}
