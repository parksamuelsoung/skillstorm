package com.forkgame.models;

public class Review {
	
	private int reviewId;
	private int reviewRating;
	private String reviewUser;
	private String reviewMessage;
	private String productDetails;
	private String productManufacturer;
	
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
	
	public String getProductDetails() {
		return productDetails;
	}
	
	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}
	
	public String getProductManufacturer() {
		return productManufacturer;
	}
	
	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}

	@Override
	public String toString() {
		return String.format("Manufacturer: %s's Fork Warehouse%n"
				+ "Product: %s%n"
				+ "Rating: %s/5 stars%n"
				+ "Customer: %s%n"
				+ "Comment: %s", 
				productManufacturer, productDetails, 
				reviewRating, reviewUser, reviewMessage);
	}
	
	

}
