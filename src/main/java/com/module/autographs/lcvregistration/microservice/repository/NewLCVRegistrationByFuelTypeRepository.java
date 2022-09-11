package com.module.autographs.lcvregistration.microservice.repository;

import com.module.autographs.lcvregistration.microservice.model.NewLCVRegistrationByFuelTypeDataModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface NewLCVRegistrationByFuelTypeRepository extends MongoRepository<NewLCVRegistrationByFuelTypeDataModel, String> {

    @Query("{type:'?0'}")
    List<NewLCVRegistrationByFuelTypeDataModel> findAllLCVRegistrationByFuelTypeByType(String type);
}
