package com.chainsys.main.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@Entity
public class RatingModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ratingId;
	
	@ManyToOne
	@JoinColumn(name="userId",nullable = false)
	private UserModel usr;
	
	private double rating;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	public int getRatingId() {
		return ratingId;
	}

	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}

	public UserModel getUsr() {
		return usr;
	}

	public void setUsr(UserModel usr) {
		this.usr = usr;
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

	public void setCreatedAt(LocalDateTime localDateTime) {
		this.createdAt = localDateTime;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@PrePersist
	protected void createdOn() {
		this.setCreatedAt(LocalDateTime.now());
		this.setUpdatedAt(this.getCreatedAt());
	}
	
	@PreUpdate
	protected void updatedOn() {
		this.setUpdatedAt(LocalDateTime.now());
	}
	
}
