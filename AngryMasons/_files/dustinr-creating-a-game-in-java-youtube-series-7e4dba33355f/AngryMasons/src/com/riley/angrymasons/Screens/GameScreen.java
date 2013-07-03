package com.riley.angrymasons.Screens;

import com.badlogic.gdx.Screen;
import com.riley.angrymasons.AngryMasons;
import com.riley.angrymasons.View.World;
import com.riley.angrymasons.View.WorldRenderer;

public class GameScreen implements Screen {

	AngryMasons game;
	World world;
	WorldRenderer render;
	
	public GameScreen(AngryMasons game){
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
		
	}

	@Override
	public void show() {
		
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
		world.dispose();
		render.dispose();
	}

	
}
