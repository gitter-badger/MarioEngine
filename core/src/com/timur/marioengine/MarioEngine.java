package com.timur.marioengine;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MarioEngine extends ApplicationAdapter {
	SpriteBatch batch;
	Player player;

	@Override
	public void create() {
		player = new Player("playerRight.png", 0, 0);
		batch = new SpriteBatch();
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(player.getTexture(), player.getPosX(), player.getPosY());
		processInput();
		batch.end();
	}

	private void processInput() {
		if (Gdx.input.isKeyPressed(Keys.LEFT)) {
			player.setTexture("playerLeft.png");
			player.setPosX(player.getPosX() - 5);
		}
		if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
			player.setTexture("playerRight.png");
			player.setPosX(player.getPosX() + 5);
		}
		if (Gdx.input.isKeyJustPressed(Keys.UP)) {
			
		}
	}
}