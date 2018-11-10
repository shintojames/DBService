package com.bits.service.db.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bits.service.db.model.UserModel;
import com.bits.service.db.model.UserModel;
@Service
public interface UserService {
	
	 public List<UserModel> retrieveUserModels();	
	 public UserModel getUserModel(Long UserModelId);
	 public void saveUserModel(UserModel UserModel);
	 public void deleteUserModel(Long UserModelId);
	 public void updateUserModel(UserModel UserModel);

}
