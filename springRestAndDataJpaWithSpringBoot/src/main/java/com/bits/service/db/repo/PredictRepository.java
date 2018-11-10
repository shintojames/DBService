package com.bits.service.db.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bits.service.db.model.PredictModel;

//import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
@Repository
public interface  PredictRepository extends JpaRepository<PredictModel,Long>{

}
