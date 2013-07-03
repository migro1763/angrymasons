package com.migronomus.angrymasons.Screens;

import com.badlogic.gdx.Screen;
import com.migronomus.angrymasons.AngryMasons;
import com.migronomus.angrymasons.View.World;
import com.migronomus.angrymasons.View.WorldRenderer;

public class GameScreen implements Screen {
	
	AngryMasons game;
	World world;
	WorldRenderer render;
	
	public GameScreen(AngryMasons game) {
		this.game = game;
		world = new World(game);
		render = new WorldRenderer(world);
	}

	@Override
	public void render(float delta) {
		world.update();
		render.render();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		dispose();
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
