package com.timur.marioengine;

import com.badlogic.gdx.graphics.Texture;

public class Player {

	private int posX, posY;
	private Texture texture;

	public Player(Texture texture, int posX, int posY) {
		this.texture = texture;
		this.posX = posX;
		this.posY = posY;
	}

	public Texture getTexture() {
		return texture;
	}

	public void setTexture(Texture texture) {
		this.texture = texture;
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
