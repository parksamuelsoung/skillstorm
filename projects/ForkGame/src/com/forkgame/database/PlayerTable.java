package com.forkgame.database;

import java.util.ArrayList;

import com.forkgame.models.Player;

public class PlayerTable {
	
	private ArrayList<Player> players = new ArrayList<>();
	private int playerId = 0;
	
	public Player createPlayer() {
		Player player = new Player(playerId++);
		this.players.add(player);
		return player;
	}
	
	public ArrayList<Player> getPlayers() {
		return players;
	}
	
	public Player getPlayer(int playerId) {
		return players.get(playerId);
	}
	
	public Player updatePlayer(Player player) {
		return players.set(player.getPlayerId(), player);
	}
	
	public ArrayList<Player> updatePlayers(ArrayList<Player> players) {
		return this.players = players;
	}

}
