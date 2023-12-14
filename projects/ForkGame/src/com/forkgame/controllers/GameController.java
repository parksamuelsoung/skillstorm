package com.forkgame.controllers;

import com.forkgame.services.GameService;

public class GameController {
	
	private GameService gameService = new GameService();
	
	public void start() {
		gameService.startGame();
		gameService.playGame();
		gameService.endGame();
		gameService.resetGame();
		reStart(gameService.restartGame());
	}
	
	public void reStart(boolean isRestarting) {
		if (isRestarting) {
			start();
		}
	}

}
