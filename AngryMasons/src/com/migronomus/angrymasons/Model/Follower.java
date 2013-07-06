package com.migronomus.angrymasons.Model;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

public class Follower extends Enemy {
	
	float ROTATION_SPEED = 500;

	public Follower(float speed, float rotation, float width, float height,
			Vector2 position) {
		super(speed, rotation, width, height, position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void advance(float delta, Ship ship) {
		position.lerp(ship.getPosition(), delta);
		
		rotation += Gdx.graphics.getDeltaTime() * ROTATION_SPEED;
		
		if(rotation > 360)
			rotation -= 360;
		
		super.update(ship);
		
	}

}
