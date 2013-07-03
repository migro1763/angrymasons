package com.migronomus.angrymasons.Model;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

public class Ship extends MoveableEntity {

	public Ship(Vector2 position, float width, float height, float rotation, float speed) {
		super(speed, rotation, width, height, position);
	}
	
	@Override
	public void update() {
		position.add(velocity.tmp().mul(Gdx.graphics.getDeltaTime() * SPEED));
		rotation = velocity.angle() - 90;
	}
}
