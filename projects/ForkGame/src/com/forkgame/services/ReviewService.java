package com.forkgame.services;

import java.util.ArrayList;

import com.forkgame.daos.ReviewDao;
import com.forkgame.models.Player;
import com.forkgame.models.Review;

public class ReviewService {
	
	private ReviewDao reviewDao = new ReviewDao();
	
	public ArrayList<Review> getReviews() {
		return reviewDao.getReviews();
	}
	
	public Review getReview(Player player) {
		for (Review review: getReviews()) {
			if (review.getReviewRating() == player.getOverallRating()) {
				review.setProductManufacturer(player.getPlayerName());
				review.setProductDetails("(1)fork 4in 2-4prongs");
				return review;
			}
		}
		return null;
	}

}
