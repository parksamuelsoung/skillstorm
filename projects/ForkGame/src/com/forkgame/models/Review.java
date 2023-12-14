package com.forkgame.models;

public class Review {
	
	private int reviewId;
	private int reviewRating;
	private String reviewUser;
	private String reviewMessage;
	
	public Review() {

	}
	
	public Review(int reviewId, int reviewRating, 
			String reviewUser, String reviewMessage) {
		super();
		this.reviewId = reviewId;
		this.reviewRating = reviewRating;
		this.reviewUser = reviewUser;
		this.reviewMessage = reviewMessage;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getReviewRating() {
		return reviewRating;
	}

	public void setReviewRating(int reviewRating) {
		this.reviewRating = reviewRating;
	}
	
	public String getReviewUser() {
		return reviewUser;
	}
	
	public void setReviewUser(String reviewUser) {
		this.reviewUser = reviewUser;
	}

	public String getReviewMessage() {
		return reviewMessage;
	}

	public void setReviewMessage(String reviewMessage) {
		this.reviewMessage = reviewMessage;
	}

	@Override
	public String toString() {
		return String.format("%s %s", reviewUser, reviewMessage);
	}
	
	

}
