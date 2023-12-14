package com.forkgame.services;

import java.util.Scanner;

import com.forkgame.models.Player;
import com.forkgame.models.Scene;
import com.forkgame.models.Game;
import com.forkgame.controllers.PlayerController;
import com.forkgame.controllers.SceneController;
import com.forkgame.daos.GameDao;

public class GameService {
	
	private GameDao gameDao = new GameDao();
	private PlayerController playerController = new PlayerController();
	private SceneController sceneController = new SceneController();
	private Scanner scanner = new Scanner(System.in);
	
	private Scene scene;
	private Player player;
	private String sceneSetChoice;
	
	public Game getGame() {
		return gameDao.getGame();
	}
	
	public void startGame() {		
		System.out.print(getGame());
		System.out.println(sceneController.startScene());
		player = playerController.createPlayer();
	}
	
	public void playGame() {
		do {
			try {
				System.out.print(">");
				sceneSetChoice = scanner.nextLine();
				scene = sceneController.getScenes(sceneSetChoice);
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid response, try again.");
				playGame();
			}
			
			playerController.updatePlayer(player, scene);
			System.out.println(player.toStringScore()); 
			System.out.println(scene);
		} while(!scene.getSceneSetId().contains("last"));
	}
	
	public void endGame() {			
		System.out.print("Please enter your name: ");
		player.setPlayerName(scanner.nextLine());
		System.out.println(playerController.updatePlayers(player));
	}
	
	public void resetGame() {
		sceneController.resetScene();
		System.out.println();
	}
	
	public boolean restartGame() {
		String response;
		boolean isRestarting = false;
		
		System.out.print("Play again?\na) yes\nb) no\n\n");
		
		do {
			System.out.print(">");
			response = scanner.nextLine();
			if (response.equals("a")) {
				isRestarting = true;
				break;
			} else if (response.equals("b")) {
				System.out.println("Game Over");
				break;
			} else {
				System.out.println("Invalid response, try again.");
			}	
		} while (!response.equals("a") || !response.equals("b"));
		
		return isRestarting;
	}

}
