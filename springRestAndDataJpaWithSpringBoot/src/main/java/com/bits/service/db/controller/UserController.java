package com.bits.service.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
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
	public void saveEmployee(UserModel userModel){
		//predictRepository.save(predictModel);
		userservie.saveUserModel(userModel);
	  System.out.println("Employee Saved Successfully");
	 }

}

