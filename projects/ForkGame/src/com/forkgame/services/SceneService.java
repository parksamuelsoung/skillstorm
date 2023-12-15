package com.forkgame.services;

import java.util.ArrayList;
import java.util.Random;

import com.forkgame.daos.SceneDao;
import com.forkgame.models.Scene;

public class SceneService {
	
	private SceneDao sceneDao = new SceneDao();
	private ArrayList<Scene> sceneSet;
	private Scene scene;
	private String sceneSetId;
	private int sceneSetNumber = 0;
	
	public void getSceneSet() {
		sceneSet = sceneDao.getSceneSet("" + sceneSetNumber);
	}
	
	public Scene getScene(String sceneSetChoice) {
		if (sceneSetNumber <= 9) {
			sceneSetId = sceneSetNumber + sceneSetChoice + "-ones";
		} else {
			sceneSetId = sceneSetNumber + sceneSetChoice;
		}
		scene = sceneDao.getScene(sceneSetId);

		if (!scene.getSceneCall().contains(sceneSetChoice) ||
				sceneSetChoice.isEmpty()) {
			throw new IllegalArgumentException();
		}
		
		if (scene.getSceneSetId().contains("random")) {
			setRandomScene();
		}
		
		sceneSetNumber++;
		return scene;
	}
	
	public void setRandomScene() {
		Random randomSceneNumber = new Random();
		getSceneSet();
		scene = sceneSet.get(randomSceneNumber.nextInt(sceneSet.size()));
	}
	
	public void resetScene() {
		this.sceneSetNumber = 0;
	}
	

}
