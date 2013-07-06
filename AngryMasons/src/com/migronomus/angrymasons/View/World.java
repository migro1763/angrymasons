package com.migronomus.angrymasons.View;

import java.util.Iterator;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.migronomus.angrymasons.AngryMasons;
import com.migronomus.angrymasons.Model.Bullet;
import com.migronomus.angrymasons.Model.Enemy;
import com.migronomus.angrymasons.Model.Follower;
import com.migronomus.angrymasons.Model.Ship;

public class World {
	
	AngryMasons game;
	Ship ship;
	Array<Bullet> bullets = new Array<Bullet>();
	Array<Enemy> enemies = new Array<Enemy>();
	WorldRenderer wr;
	Iterator<Bullet> bIter;
	Iterator<Enemy> eIter;
	Bullet b;
	Enemy e;
	
	public World(AngryMasons game) {
		this.game = game;
		ship = new Ship(new Vector2(5, 5), 1, 1, 0, 5f);
		enemies.add(new Follower(5f, 0, 1, 1, new Vector2(10, 10)));
		Gdx.input.setInputProcessor(new InputHandler(this));
	}
	
	public Ship getShip() {
		return ship;
	}
	
	public Array<Enemy> getEnemies() {
		return enemies;
	}
	
	public void update() {
		ship.update();
		
        bIter = bullets.iterator();
        while(bIter.hasNext()){
                b = bIter.next();
                
                eIter = enemies.iterator();
                while (eIter.hasNext()) { // loop through enemy array until end of list
                	e = eIter.next();
                	e.advance(Gdx.graphics.getDeltaTime(), ship);
                	// if enemy/ship hit each other
            		if(ship.getBounds().overlaps(e.getBounds()))
            			Gdx.app.log(AngryMasons.LOG, "SHIP HIT!!");
            		
                	// if bullet hits enemy
                	if(e.getBounds().overlaps(b.getBounds())) {
                		Gdx.app.log(AngryMasons.LOG, "Enemy hit!");
                		eIter.remove();
                		bIter.remove();               		
                	}
                }
                b.update(ship);
        }
   
	}
	
	public void addBullet(Bullet b) {
		bullets.add(b);
	}
	
	public Array<Bullet> getBullets() {
		return bullets;
	}
	
	public void setRenderer(WorldRenderer wr) {
		this.wr = wr;
	}
	
	public WorldRenderer getRenderer() {
		return wr;
	}
	
	public void dispose() {
		
	}
}
