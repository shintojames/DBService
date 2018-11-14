package com.bits.service.db.repo;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bits.service.db.model.PredictModel;
import com.bits.service.db.model.UserPredictModel;

//import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
@Repository
public interface  PredictRepository extends JpaRepository<PredictModel,Long>{

	 @Query(value = "SELECT * FROM USER_PREDICT_MODEL WHERE DATE > = ?1", nativeQuery = true)
		List<PredictModel> findByUserModelId(String sysdate);
}
