package com.module.autographs.lcvregistration.microservice.service;

import com.module.autographs.lcvregistration.microservice.model.NewLCVRegistrationByFuelTypeDataModel;

import java.util.List;

public interface NewLCVRegistrationByFuelTypeService {

    List<NewLCVRegistrationByFuelTypeDataModel> findAll();

    List<NewLCVRegistrationByFuelTypeDataModel> addNewLCVRegistrationByFuelTypeData(List<NewLCVRegistrationByFuelTypeDataModel> newLCVRegistrationByFuelTypeDataModelsList);

    List<NewLCVRegistrationByFuelTypeDataModel> findAllNewLCVRegistrationsByType(String type);
}