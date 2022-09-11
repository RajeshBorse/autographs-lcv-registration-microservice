package com.module.autographs.lcvregistration.microservice.service;

import com.module.autographs.lcvregistration.microservice.model.NewLCVRegistrationBySalesTypeDataModel;

import java.util.List;

public interface NewLCVRegistrationBySalesTypeService {

    List<NewLCVRegistrationBySalesTypeDataModel> findAll();

    List<NewLCVRegistrationBySalesTypeDataModel> addNewLCVRegistrationBySalesTypeData(List<NewLCVRegistrationBySalesTypeDataModel> newLCVRegistrationBySalesTypeDataModelList);

    List<NewLCVRegistrationBySalesTypeDataModel> findAllNewLCVRegistrationsByType(String type);
}