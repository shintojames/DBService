package com.bits.service.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_MODEL")
public class UserModel {
	 
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long userId;
	
	@Column(name="SCORE")
	private Long score;
	
	@Column(name="HVPSCORE")
	private Long hvpscore;
	
	@Column(name="RANK")
	private Long rank;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public Long getHvpscore() {
		return hvpscore;
	}

	public void setHvpscore(Long hvpscore) {
		this.hvpscore = hvpscore;
	}

	public Long getRank() {
		return rank;
	}

	public void setRank(Long rank) {
		this.rank = rank;
	}
	
	 
}
