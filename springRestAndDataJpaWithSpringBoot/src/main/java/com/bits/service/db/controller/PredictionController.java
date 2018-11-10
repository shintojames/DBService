package com.bits.service.db.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bits.service.db.model.PredictModel;
import com.bits.service.db.repo.PredictRepository;
import com.bits.service.db.service.PredictService;


@RestController

public class PredictionController {

	 @Autowired
	 private PredictService predictservice;
	 
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/api/SavePredict")
	 public void saveEmployee(PredictModel predictModel){
		//predictRepository.save(predictModel);
		System.out.println("PredictModel Inserting"+predictModel.getTeam1());
		System.out.println("PredictModel Inserting"+predictModel.getTeam2());
		System.out.println("PredictModel Inserting"+predictModel.getDate());
	//System.out.println("PredictModel"+predictModel.getTeam1());
		predictservice.savePredictModel(predictModel);
		
	  System.out.println("Employee Saved Successfully");
	 }
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/api/predictList")
	 public List<PredictModel> getEmployees() {
		List<PredictModel> employees = predictservice.retrievePredictModels();
		//List<PredictModel> employees = predictRepository.findAll();
	  System.out.println("Employee Get Call");
	  return employees;
	 }

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/api/predictList")
	 public void  updateEmployees(PredictModel predictModel) {
	  predictservice.updatePredictModel(predictModel);;
	  System.out.println("Employee Update Call");
	 }

	
	

}
