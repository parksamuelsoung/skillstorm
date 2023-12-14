package com.forkgame.daos;

import java.util.ArrayList;

import com.forkgame.database.SceneTable;
import com.forkgame.models.Scene;

public class SceneDao {
	
	private SceneTable sceneTable = new SceneTable();
	
	public ArrayList<Scene> getScenes() {
		return sceneTable.getScenes();
	}
	
	public ArrayList<Scene> getSceneSet(String sceneSetNumber) {
		ArrayList<Scene> sceneSet = new ArrayList<>();
		for(Scene scene : getScenes()) {
			if(scene.getSceneSetId().contains(sceneSetNumber)) {
				sceneSet.add(scene);
			}
		}
		return sceneSet;
	}
	
	public Scene getScene(String sceneSetId) {
		for(Scene scene : getScenes()) {
			if(scene.getSceneSetId().contains(sceneSetId)) {
				return scene;
			}
		}
		throw new IllegalArgumentException();
	}
	

}
