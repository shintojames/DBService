package com.bits.service.db.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.bits.service.db.model.PredictModel;
@Service
public interface PredictService {
	
	 public List<PredictModel> retrievePredictModels();	
	 public PredictModel getPredictModel(Long PredictModelId);
	 public void savePredictModel(PredictModel PredictModel);
	 public void deletePredictModel(Long PredictModelId);
	 public void updatePredictModel(PredictModel PredictModel);


}
