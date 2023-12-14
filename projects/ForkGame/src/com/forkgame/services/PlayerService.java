package com.forkgame.services;

import java.util.ArrayList;

import com.forkgame.daos.PlayerDao;
import com.forkgame.models.Player;
import com.forkgame.models.Scene;

public class PlayerService {
	
	private PlayerDao playerDao = new PlayerDao();
	
	public Player createPlayer() {
		return playerDao.createPlayer();
	}
	
	public ArrayList<Player> getPlayers() {
		return playerDao.getPlayers();
	}
	
	public Player getPlayer(int playerId) {
		return playerDao.getPlayer(playerId);
	}
	
	public Player updatePlayer(Player player, Scene scene) {
		player.setCleanlinessRating(player.getCleanlinessRating() + 
				scene.getSceneCleanScore());
		player.setStealthinessRating(player.getStealthinessRating() + 
				scene.getSceneStealthScore());
		player.setOverallRating((player.getCleanlinessRating() + 
				player.getStealthinessRating()) / 2);
		return playerDao.updatePlayer(player);
	}
	
	public ArrayList<Player> updatePlayers(Player player) {
		ArrayList<Player> players = getPlayers();		
		
		for (int i=0; i<players.size(); i++) {
			if (player.getOverallRating() >= 
					getPlayers().get(i).getOverallRating()) {
				players.set(i, player);
				players.get(i).setPlayerRank(i);
			}
		}
		return playerDao.updatePlayers(players);
	}

}
