package com.migronomus.angrymasons.View;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.migronomus.angrymasons.AngryMasons;
import com.migronomus.angrymasons.Model.Ship;

public class World {
	
	AngryMasons game;
	Ship ship;
	
	public World(AngryMasons game) {
		this.game = game;
		ship = new Ship(new Vector2(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2), 1, 1, 0, 5f);
	}
	
	public Ship getShip() {
		return ship;
	}
	
	public void update() {
		
	}
	
	public void dispose() {
		
	}
}
