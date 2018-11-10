package com.bits.service.db.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.bits.service.db.model.UserPredictModel;
@Service
public interface UserPredictService {
	
	 public List<UserPredictModel> retrieveUserPredictModels();	 
	 public UserPredictModel getUserPredictModel(Long userPredictModelId);
	 public UserPredictModel getUserPredictModelByGameId(Long gameId);
	 public UserPredictModel getUserPredictModelByUserId(Long userId);
	 public void saveUserPredictModel(UserPredictModel userPredictModel);
	 public void deleteUserPredictModel(Long userPredictModelId);
	 public void updateUserPredictModel(UserPredictModel userPredictModel);

}
