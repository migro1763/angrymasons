package com.migronomus.angrymasons.Model;

import com.badlogic.gdx.math.Vector2;

public abstract class MoveableEntity extends Entity {
	protected Vector2 velocity;
	protected float SPEED;
	protected float rotation;

	public MoveableEntity(float speed, float rotation, float width, float height, Vector2 position) {
		super(position, width, height);
		this.SPEED = speed;
		this.rotation = rotation;
		velocity = new Vector2(0, 0);
	}
	
	public Vector2 getVelocity() {
		return velocity;
	}

	public void setVelocity(Vector2 velocity) {
		this.velocity = velocity;
	}

	public float getRotation() {
		return rotation;
	}

	public void setRotation(float rotation) {
		this.rotation = rotation;
	}
	
	public void update(Ship ship) {
		bounds.x = position.x;
		bounds.y = position.y;
	}
}
