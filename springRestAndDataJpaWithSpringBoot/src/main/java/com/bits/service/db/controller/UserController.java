package com.bits.service.db.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bits.service.db.model.UserModel;
import com.bits.service.db.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	
	@Autowired
	private UserService userservie;
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/api/SaveUser")
	public void saveUser(@RequestBody UserModel userModel){
		//predictRepository.save(predictModel);
		userservie.saveUserModel(userModel);
	  System.out.println("User Saved Successfully");
	 }
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/api/getUser/{userId}")
	 public Optional<UserModel> getUser(@PathVariable Long userId) {
		Optional<UserModel> userModel = userservie.getUserModel(userId);
		//List<PredictModel> employees = predictRepository.findAll();
	  System.out.println("User Get Call");
	  return userModel;
	 }
}



