package com.bits.service.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_PREDICT_MODEL")
public class UserPredictModel {
	 
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long userPredictId;
	
	@Column(name = "USERID")
	private Long userId;
	
	@Column(name="GAMEID")
	private Long gameId;
	
	@Column(name="PREDICTION")
	private String prediction;
	
	@Column(name="POINTS")
	private Integer point;

	public Long getUserPredictId() {
		return userPredictId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getGameId() {
		return gameId;
	}

	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}

	public String getPrediction() {
		return prediction;
	}

	public void setPrediction(String prediction) {
		this.prediction = prediction;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public void setUserPredictId(Long userPredictId) {
		this.userPredictId = userPredictId;
	}

	
	 
}
