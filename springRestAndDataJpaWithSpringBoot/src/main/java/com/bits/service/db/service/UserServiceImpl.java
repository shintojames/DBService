package com.bits.service.db.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bits.service.db.model.UserModel;
import com.bits.service.db.repo.UserRepository;
@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserRepository userServie;
	@Override
	public List<UserModel> retrieveUserModels() {
		// TODO Auto-generated method stub
		return userServie.findAll();
	 
	}

	@Override
	public Optional<UserModel> getUserModel(Long UserModelId) {
		// TODO Auto-generated method stub
		return userServie.findById(UserModelId);
	//	return null;
	}

	@Override
	public void saveUserModel(UserModel userModel) {
		// TODO Auto-generated method stub
		userServie.save(userModel);
		
	}

	@Override
	public void deleteUserModel(Long UserModelId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserModel(UserModel UserModel) {
		// TODO Auto-generated method stub
		
	}

}
