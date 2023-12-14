package com.forkgame.services;

import com.forkgame.daos.GameDao;
import com.forkgame.models.Game;

public class GameService {
	
	GameDao gameDao = new GameDao();
	
	public Game getGame() {
		return gameDao.getGame();
	}

}
