package com.forkgame.database;

import java.util.ArrayList;
import java.util.Collections;

import com.forkgame.models.Game;

public class GameTable {
	
	ArrayList<Game> game = new ArrayList<>();
	
	{
		Collections.addAll(game,
				new Game("Fork: The Finest Silverware Utensil\n" +
						"CopyBite (c) 2023 ForkGame, Inc. No Bites Reserved.\n" +
						"Fork is a command line game inspired by Zork.\n" +
						"Created by Samuel Park, a student at Skillstorm.\n")
				);
	}
	
	public ArrayList<Game> getGames() {
		return game;
	}

}
