package com.chainsys.main.DTO;

import java.time.LocalDateTime;


public class RatingDetailsDTO {

	private int ratingId;
	private double rating;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private int usrId;
	
	public RatingDetailsDTO(int id,LocalDateTime createdAt,double rating,LocalDateTime updatedAt,int userId) {
		this.setRating(id);
		this.setRating(rating);
		this.setCreatedAt(createdAt);
		this.setUpdatedAt(updatedAt);
		this.setUsrId(userId);
	}
	
	public int getRatingId() {
		return ratingId;
	}
	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public int getUsrId() {
		return usrId;
	}

	public void setUsrId(int usrId) {
		this.usrId = usrId;
	}
	
}
