package com.bits.service.db.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bits.service.db.controller.model.PredictModel;
import com.bits.service.db.service.repo.PredictRepository;


@RestController

public class PredictionController {
	@Autowired

	 private PredictRepository predictRepository;

	@PostMapping("/SavePredict")
	 public void saveEmployee(PredictModel predictModel){
	  predictRepository.save(predictModel);
	  System.out.println("Employee Saved Successfully");
	 }
	
	@GetMapping("/api/predictList")
	 public List<PredictModel> getEmployees() {
	  List<PredictModel> employees = predictRepository.findAll();
	  System.out.println("Employee Get Call");
	  return employees;
	 }

	
	

}
