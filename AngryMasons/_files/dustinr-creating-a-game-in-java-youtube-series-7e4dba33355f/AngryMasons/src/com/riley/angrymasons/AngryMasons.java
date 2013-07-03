package com.riley.angrymasons;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.FPSLogger;
import com.riley.angrymasons.Screens.MainMenu;
import com.riley.angrymasons.View.AngryAudio;

public class AngryMasons extends Game {
	
	public static final String VERSION = "0.0.0.02 Pre-Alpha";
	public static final String LOG = "Angry Masons";
	public static final boolean DEBUG = false;
	FPSLogger log;
	
	@Override
	public void create() {
		log = new FPSLogger();
		AngryAudio.playMusic(true);
		setScreen(new MainMenu(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		AngryAudio.dispose();
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
