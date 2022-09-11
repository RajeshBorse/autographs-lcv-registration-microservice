package com.module.autographs.lcvregistration.microservice.repository;

import com.module.autographs.lcvregistration.microservice.model.NewLCVRegistrationDataModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface NewLCVRegistrationRepository extends MongoRepository<NewLCVRegistrationDataModel, String> {

    @Query("{type:'?0'}")
    List<NewLCVRegistrationDataModel> findAllLCVRegistrationByType(String type);
}