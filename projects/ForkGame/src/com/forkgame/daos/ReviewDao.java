package com.forkgame.daos;

import java.util.ArrayList;

import com.forkgame.database.ReviewTable;
import com.forkgame.models.Review;

public class ReviewDao {
	
	private ReviewTable reviewTable = new ReviewTable();
	
	public ArrayList<Review> getReviews() {
		return reviewTable.getReviews();
	}

}
