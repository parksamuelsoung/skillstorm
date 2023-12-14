package com.forkgame.models;

public class Scene {
	
	private int sceneId;
	private int sceneCleanScore;
	private int sceneStealthScore;
	private String sceneCall;
	private String sceneSetId;
	private String sceneTitle;
	private String sceneContent;
	private String sceneChoices;
	
	public Scene(int sceneId, int sceneCleanScore, int sceneStealthScore,
			String sceneCall, String sceneSetId, String sceneTitle, 
			String sceneContent, String sceneChoices) {
		this.sceneId = sceneId;
		this.sceneCleanScore = sceneCleanScore;
		this.sceneStealthScore = sceneStealthScore;
		this.sceneCall = sceneCall;
		this.sceneSetId = sceneSetId;
		this.sceneTitle = sceneTitle;
		this.sceneContent = sceneContent;
		this.sceneChoices = sceneChoices;
	}
	
	public int getSceneId() {
		return sceneId;
	}

	public void setSceneId(int sceneId) {
		this.sceneId = sceneId;
	}

	public int getSceneCleanScore() {
		return sceneCleanScore;
	}

	public void setSceneCleanScore(int sceneCleanScore) {
		this.sceneCleanScore = sceneCleanScore;
	}

	public int getSceneStealthScore() {
		return sceneStealthScore;
	}

	public void setSceneStealthScore(int sceneStealthScore) {
		this.sceneStealthScore = sceneStealthScore;
	}
	
	public String getSceneCall() {
		return sceneCall;
	}
	
	public void setSceneCall(String sceneCall) {
		this.sceneCall = sceneCall;
	}

	public String getSceneSetId() {
		return sceneSetId;
	}

	public void setSceneSet(String sceneSetId) {
		this.sceneSetId = sceneSetId;
	}

	public String getSceneTitle() {
		return sceneTitle;
	}

	public void setSceneTitle(String sceneTitle) {
		this.sceneTitle = sceneTitle;
	}

	public String getSceneContent() {
		return sceneContent;
	}

	public void setSceneContent(String sceneContent) {
		this.sceneContent = sceneContent;
	}

	public String getSceneChoices() {
		return sceneChoices;
	}

	public void setSceneChoices(String sceneChoices) {
		this.sceneChoices = sceneChoices;
	}

	@Override
	public String toString() {
		return String.format("%s%s%n%s%n", sceneTitle, sceneContent, sceneChoices);
	}
	
	
	
	

}
