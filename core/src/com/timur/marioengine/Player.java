package com.timur.marioengine;

import com.badlogic.gdx.graphics.Texture;

public class Player {

	private int posX, posY;
	private Texture texture;

	public Player(String textureHandle, int posX, int posY) {
		this.texture = new Texture(textureHandle);
		this.posX = posX;
		this.posY = posY;
	}

	public Texture getTexture() {
		return texture;
	}

	public void setTexture(String textureHandle) {
		this.texture = new Texture(textureHandle);
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

}
