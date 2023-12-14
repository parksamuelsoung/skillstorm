package com.forkgame.models;

public class Game {

	private String info;
	
	public Game(String info) {
		this.info = info;
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info;
	}
	
	@Override
	public String toString() {
		return String.format("%s%n", info);
	}
}
