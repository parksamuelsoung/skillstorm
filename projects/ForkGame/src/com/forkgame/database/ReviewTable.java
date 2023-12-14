package com.forkgame.database;

import java.util.ArrayList;
import java.util.Collections;

import com.forkgame.models.Review;

public class ReviewTable {
	
	private ArrayList<Review> reviews = new ArrayList<>();
	private int reviewId = 0;
	
	{
		Collections.addAll(reviews,
				new Review(reviewId++, 0,
						"*I'm ANDY*",
						"Do Not Buy!!" +
						"Always has food on it." +
						"Save yourself the trouble."),
				new Review(reviewId++, 1,
						"BuZzLiGhT-year",
						"--eh--" +
						"Back in my day, forks were alright." +
						"This product is a disappointment."),
				new Review(reviewId++, 2,
						"call me Mr. P. H.",
						"It's a fork." +
						"Nothing special about it." +
						"You can eat with it."),
				new Review(reviewId++, 3,
						"Woody173",
						"This lasso works great." +
						"16inches and 1inch diameter." +
						"Oops, wrong product."),
				new Review(reviewId++, 4,
						"~~slinky dog~~",
						"Pretty nice." +
						"Great fork." +
						"But, I just can't find mine anywhere."),
				new Review(reviewId++, 5,
						"ForkyTheFork",
						"Buy This!!" +
						"Super clean fork!" +
						"I'm a verified buyer.")
				);
	}
	
	public ArrayList<Review> getReviews() {
		return reviews;
	}

}
