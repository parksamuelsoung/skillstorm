package com.forkgame.controllers;

import com.forkgame.models.Review;
import com.forkgame.services.ReviewService;

public class ReviewController {
	
	private ReviewService reviewService = new ReviewService();
	
	public Review getReview(int reviewRating) {
		return reviewService.getReview(reviewRating);
	}

}
