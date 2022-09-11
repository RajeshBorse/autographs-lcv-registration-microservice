package com.module.autographs.lcvregistration.microservice.service;

import com.module.autographs.lcvregistration.microservice.model.NewLCVRegistrationDataModel;

import java.util.List;

public interface NewLCVRegistrationService {

    List<NewLCVRegistrationDataModel> findAll();

    List<NewLCVRegistrationDataModel> addNewLCVRegistrationData(List<NewLCVRegistrationDataModel> newLCVRegistrationDataModelList);

    List<NewLCVRegistrationDataModel> findAllNewLCVRegistrationsByType(String type);
}