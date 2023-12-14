package com.forkgame.services;

import java.util.ArrayList;

import com.forkgame.daos.ReviewDao;
import com.forkgame.models.Review;

public class ReviewService {
	
	private ReviewDao reviewDao = new ReviewDao();
	
	public ArrayList<Review> getReviews() {
		return reviewDao.getReviews();
	}
	
	public Review getReview(int reviewRating) {
		for (Review review: getReviews()) {
			if (review.getReviewRating() == reviewRating) {
				return review;
			}
		}
		return null;
	}

}
