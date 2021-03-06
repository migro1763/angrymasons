package com.migronomus.angrymasons.Screens;

import aurelienribon.tweenengine.BaseTween;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenCallback;
import aurelienribon.tweenengine.TweenEquations;
import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.migronomus.angrymasons.AngryMasons;
import com.migronomus.angrymasons.TweenAccessors.SpriteTween;

public class SplashScreen implements Screen {
	
	Texture splashTexture; // just an image
	Sprite splashSprite; // image manipulation
	SpriteBatch batch; // send bindings in a batch
	AngryMasons game;
	TweenManager manager;
	
	public SplashScreen(AngryMasons game) {
		this.game = game;
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1); // set clear colour (black)
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT); // the actual clearing
//		Gdx.app.log(AngryMasons.LOG, "Rendering...");
		manager.update(delta);
		batch.begin();
			splashSprite.draw(batch);
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void show() {
		splashTexture = new Texture("data/amSplash.png");
		splashTexture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		splashSprite = new Sprite(splashTexture);
		splashSprite.setColor(1, 1, 1, 0);
		splashSprite.setX(Gdx.graphics.getWidth() / 2 - (splashSprite.getWidth() / 2)); // place image in middle of screen
		splashSprite.setY(Gdx.graphics.getHeight() / 2 - (splashSprite.getHeight() / 2)); // place image in middle of screen
		
		batch = new SpriteBatch();
		
		Tween.registerAccessor(Sprite.class, new SpriteTween());
		
		manager = new TweenManager();
		
		TweenCallback cb = new TweenCallback() {
			
			@Override
			public void onEvent(int type, BaseTween<?> source) {
				tweenCompleted();
			}
		};
		
		Tween.to(splashSprite, SpriteTween.ALPHA, 1.0f).target(1).ease(TweenEquations.easeInQuad).repeatYoyo(1, 1.0f).setCallback(cb).setCallbackTriggers(TweenCallback.COMPLETE).start(manager);
	}

	protected void tweenCompleted() {
		Gdx.app.log(AngryMasons.LOG, "Tween complete");
		game.setScreen(new MainMenu(game));
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void dispose() {
		
	}

}
