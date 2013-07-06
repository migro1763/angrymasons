package com.migronomus.angrymasons;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.FPSLogger;
import com.migronomus.angrymasons.Screens.GameScreen;
import com.migronomus.angrymasons.Screens.SplashScreen;

public class AngryMasons extends Game {

	public static final String VERSION = "0.0.0.02 Pre-Alpha";
	public static final String LOG = "Angry Masons";
	FPSLogger log;
	
	@Override
	public void create() {
		log = new FPSLogger();
		// setScreen(new SplashScreen(this));
		setScreen(new GameScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void render() {		
		super.render();
		log.log();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}
}
