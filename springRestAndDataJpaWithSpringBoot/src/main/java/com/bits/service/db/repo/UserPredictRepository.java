package com.bits.service.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bits.service.db.model.UserPredictModel;

public interface UserPredictRepository extends JpaRepository<UserPredictModel,Long>{ 

}
