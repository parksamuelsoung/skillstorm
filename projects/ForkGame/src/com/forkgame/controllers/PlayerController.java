package com.forkgame.controllers;

import java.util.ArrayList;

import com.forkgame.models.Player;
import com.forkgame.models.Scene;
import com.forkgame.services.PlayerService;

public class PlayerController {
	
	private PlayerService playerService = new PlayerService();
	
	public Player createPlayer() {
		return playerService.createPlayer();
	}
	
	public Player getPlayer(int playerId) {
		return playerService.getPlayer(playerId);
	}
	
	public Player updatePlayer(Player player, Scene scene) {
		return playerService.updatePlayer(player, scene);
	}
	
	public ArrayList<Player> updatePlayers(Player player) {
		return playerService.updatePlayers(player);
	}

}
