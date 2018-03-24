package com.markaldrich.jgl;

public class JGLGameProperties {
	private String gameTitle;
	private int gameWidth;
	private int gameHeight;
	public String getGameTitle() {
		return gameTitle;
	}
	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}
	public int getGameWidth() {
		return gameWidth;
	}
	public void setGameWidth(int gameWidth) {
		this.gameWidth = gameWidth;
	}
	public int getGameHeight() {
		return gameHeight;
	}
	public void setGameHeight(int gameHeight) {
		this.gameHeight = gameHeight;
	}
	public JGLGameProperties(String gameTitle, int gameWidth, int gameHeight) {
		super();
		this.gameTitle = gameTitle;
		this.gameWidth = gameWidth;
		this.gameHeight = gameHeight;
	}
}
