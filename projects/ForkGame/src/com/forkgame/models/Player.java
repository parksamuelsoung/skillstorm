package com.forkgame.models;

public class Player {
	
	public static final String RED = "\u001B[31m";
	public static final String YELLOW = "\u001B[33m";
	public static final String GREEN = "\u001B[32m";
	public static final String RESET = "\u001B[0m";
	
	private int playerId;
	private String playerName;
	private int playerRank;
	private int overallRating;
	private int cleanlinessRating;
	private int stealthinessRating;
	
	public Player(int playerId) {
		this.playerId = playerId;
		this.cleanlinessRating = 0;
		this.stealthinessRating = 0;
	}
	
	public Player(int playerId, String playerName, int playerRank,
			int overallRating, int cleanlinessRating, int stealthinessRating) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerRank = playerRank;
		this.overallRating = overallRating;
		this.cleanlinessRating = cleanlinessRating;
		this.stealthinessRating = stealthinessRating;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public int getPlayerRank() {
		return playerRank;
	}
	
	public void setPlayerRank(int playerRank) {
		this.playerRank = playerRank;
	}

	public int getOverallRating() {
		return overallRating;
	}

	public void setOverallRating(int overallRating) {
		this.overallRating = overallRating;
	}

	public int getCleanlinessRating() {
		return cleanlinessRating;
	}

	public void setCleanlinessRating(int cleanlinessRating) {
		if(cleanlinessRating < 0) {
			this.cleanlinessRating = 0;
		} else if(cleanlinessRating > 5) {
			this.cleanlinessRating = 5;
		} else {
			this.cleanlinessRating = cleanlinessRating;
		}
	}

	public int getStealthinessRating() {
		return stealthinessRating;
	}

	public void setStealthinessRating(int stealthinessRating) {
		if(stealthinessRating < 0) {
			this.stealthinessRating = 0;
		} else if(stealthinessRating > 5) {
			this.stealthinessRating = 5;
		} else {
			this.stealthinessRating = stealthinessRating;
		}
		
	}
	
	public String cleanlinessRatingColor() {
		switch (cleanlinessRating) {
		case 0:
		case 1:
			return RED;
		case 2:
		case 3:
			return YELLOW;
		case 4:
		case 5:
			return GREEN;
		default:
			return RESET;
		}
	}
	
	public String stealthinessRatingColor() {
		switch (stealthinessRating) {
		case 0:
		case 1:
			return RED;
		case 2:
		case 3:
			return YELLOW;
		case 4:
		case 5:
			return GREEN;
		default:
			return RESET;
		}
	}
	
	public String toStringScore() {
		return String.format("Cleanliness:" + cleanlinessRatingColor() + "%s/5 " + RESET +
				"Stealthiness:" + stealthinessRatingColor() + "%s/5" + RESET
				, cleanlinessRating, stealthinessRating);
	}

	@Override
	public String toString() {
		return String.format("%s %s %s", 
				playerRank, playerName, overallRating);
	}
		

}
