package com.tt.urbantrend.model;

import java.time.LocalDate;

public class Review {

	private double rating;
	private String reviewComment;
	private LocalDate reviewPostDate;
	private int likes;
	private int dislikes;

	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Review(double rating, String reviewComment, LocalDate reviewPostDate, int likes, int dislikes) {
		super();
		this.rating = rating;
		this.reviewComment = reviewComment;
		this.reviewPostDate = reviewPostDate;
		this.likes = likes;
		this.dislikes = dislikes;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getReviewComment() {
		return reviewComment;
	}
	public void setReviewComment(String reviewComment) {
		this.reviewComment = reviewComment;
	}
	public LocalDate getReviewPostDate() {
		return reviewPostDate;
	}
	public void setReviewPostDate(LocalDate reviewPostDate) {
		this.reviewPostDate = reviewPostDate;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getDislikes() {
		return dislikes;
	}
	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}
	
	
}
