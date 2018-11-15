package com.bits.service.db.repo;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bits.service.db.model.PredictModel;
import com.bits.service.db.model.UserPredictModel;
import com.bits.service.db.model.UserScoreModel;

public interface UserScoreRepository extends JpaRepository<UserScoreModel,Long>{ 
	
	//List<UserScoreModel> findTop2ByNameOrderByscoreDesc(String name);
	// List<UserScoreModel> findFirst5Bydate();
	
	@Query(value = "SELECT * FROM USER_SCORE  WHERE username = ?1", nativeQuery = true)
	List<UserScoreModel> findByUserModelId(String userName);
}
