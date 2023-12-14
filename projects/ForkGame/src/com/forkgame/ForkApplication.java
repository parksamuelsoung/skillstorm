package com.forkgame;

import com.forkgame.controllers.GameController;

public class ForkApplication {
	
	public static void main(String[] args) {
		GameController gameController = new GameController();
		gameController.start();
	}

}
