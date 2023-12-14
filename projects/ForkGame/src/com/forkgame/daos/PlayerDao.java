package com.forkgame.daos;

import java.util.ArrayList;

import com.forkgame.database.PlayerTable;
import com.forkgame.models.Player;

public class PlayerDao {
	
	private PlayerTable playerTable = new PlayerTable();
	
	public Player createPlayer() {
		return playerTable.createPlayer();
	}
	
	public ArrayList<Player> getPlayers() {
		return playerTable.getPlayers();
	}
	
	public Player getPlayer(int playerId) {
		return playerTable.getPlayer(playerId);
	}
	
	public Player updatePlayer(Player player) {
		return playerTable.updatePlayer(player);
	}
	
	public ArrayList<Player> updatePlayers(ArrayList<Player> players) {
		return playerTable.updatePlayers(players);
	}

}
