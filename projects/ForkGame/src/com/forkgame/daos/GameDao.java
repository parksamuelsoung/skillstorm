package com.forkgame.daos;

import java.util.ArrayList;

import com.forkgame.database.GameTable;
import com.forkgame.models.Game;

public class GameDao {
	
	GameTable gameTable = new GameTable();
	
	public ArrayList<Game> getGames() {
		return gameTable.getGames();
	}
	
	public Game getGame() {
		for(Game game : getGames()) {
			return game;
		}
		return null;
	}

}
