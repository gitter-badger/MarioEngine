package com.timur.marioengine;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MarioEngine extends ApplicationAdapter {
	SpriteBatch batch;
	Texture playerRight, playerLeft, playerUp, playerDown;
	Player player;
	int speed = 10;

	@Override
	public void create() {
		loadAssets();
		player = new Player(playerRight, 0, 0);
		batch = new SpriteBatch();
	}

	private void loadAssets() {
		playerRight = new Texture("playerRight.png");
		playerLeft = new Texture("playerLeft.png");
		playerUp = new Texture("playerUp.png");
		playerDown = new Texture("playerDown.png");
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(0.025f, 0, 0.1f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(player.getTexture(), player.getPosX(), player.getPosY());
		processInput();
		batch.end();
	}

	/**
	 * process keyboard input for the player
	 */
	private void processInput() {
		
		if (Gdx.input.isKeyPressed(Keys.LEFT)) {
			player.setTexture(playerLeft);
			if (player.getPosX() > -player.getTexture().getWidth() / 2)
				player.setPosX(player.getPosX() - speed);
		}
		
		if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
			player.setTexture(playerRight);
			if (player.getPosX() < Gdx.graphics.getWidth()
					- player.getTexture().getWidth() / 2)
				player.setPosX(player.getPosX() + speed);
		}
		
		if (Gdx.input.isKeyPressed(Keys.DOWN)) {
			player.setTexture(playerDown);
		}
		
		if(Gdx.input.isKeyJustPressed(Keys.SPACE)){
			player.setTexture(playerUp);
		}
		
		if (Gdx.input.isKeyJustPressed(Keys.BACKSLASH)) {
			debug();
		}
	}

	/**
	 * Check how everything is running in the console
	 */
	private void debug() {
		System.out.print("FPS: " + Gdx.graphics.getFramesPerSecond());
		System.out.print("\t Width: " + Gdx.graphics.getWidth());
		System.out.println("\t Height: " + Gdx.graphics.getHeight());
	}

}