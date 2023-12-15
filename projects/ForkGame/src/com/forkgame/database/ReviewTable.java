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
						"Do Not Buy!!\n" +
						"Always has food on it.\n" +
						"Save yourself the trouble.\n"),
				new Review(reviewId++, 1,
						"BuZzLiGhT-year",
						"--eh--\n" +
						"Back in my day, forks were alright.\n" +
						"This product is a disappointment.\n"),
				new Review(reviewId++, 2,
						"call me Mr. P. H.",
						"It's a fork.\n" +
						"Nothing special about it.\n" +
						"You can eat with it.\n"),
				new Review(reviewId++, 3,
						"Woody173",
						"This lasso works great.\n" +
						"16inches and 1inch diameter.\n" +
						"Oops, wrong product.\n"),
				new Review(reviewId++, 4,
						"~~slinky dog~~\n",
						"Pretty nice.\n" +
						"Great fork." +
						"But, I just can't find mine anywhere.\n"),
				new Review(reviewId++, 5,
						"ForkyTheFork",
						"Buy This!!\n" +
						"Super clean fork!\n" +
						"I'm a verified buyer.\n")
				);
	}
	
	public ArrayList<Review> getReviews() {
		return reviews;
	}

}
