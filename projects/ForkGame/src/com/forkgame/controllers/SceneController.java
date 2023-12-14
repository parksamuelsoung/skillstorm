package com.forkgame.controllers;

import com.forkgame.models.Scene;
import com.forkgame.services.SceneService;

public class SceneController {
	
	private SceneService sceneService = new SceneService();
	
	public Scene startScene() {
		return sceneService.getScene("a");
	}
	
	public Scene getScenes(String sceneSetChoice) {
		Scene scene = sceneService.getScene(sceneSetChoice);
			return scene;
	}
	
	public void resetScene() {
		sceneService.resetScene();
	}
	
}
