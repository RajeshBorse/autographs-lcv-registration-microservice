package com.module.autographs.lcvregistration.microservice.repository;

import com.module.autographs.lcvregistration.microservice.model.NewLCVRegistrationBySalesTypeDataModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface NewLCVRegistrationBySalesTypeRepository extends MongoRepository<NewLCVRegistrationBySalesTypeDataModel, String> {

    @Query("{type:'?0'}")
    List<NewLCVRegistrationBySalesTypeDataModel> findAllLCVRegistrationBySalesTypeByType(String type);
}