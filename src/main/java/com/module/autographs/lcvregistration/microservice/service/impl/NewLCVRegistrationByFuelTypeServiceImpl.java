package com.module.autographs.lcvregistration.microservice.service.impl;

import com.module.autographs.lcvregistration.microservice.service.NewLCVRegistrationByFuelTypeService;
import com.module.autographs.lcvregistration.microservice.model.NewLCVRegistrationByFuelTypeDataModel;
import com.module.autographs.lcvregistration.microservice.repository.NewLCVRegistrationByFuelTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewLCVRegistrationByFuelTypeServiceImpl implements NewLCVRegistrationByFuelTypeService {

    @Autowired
    NewLCVRegistrationByFuelTypeRepository newLCVRegistrationByFuelTypeRepository;

    @Override
    public List<NewLCVRegistrationByFuelTypeDataModel> findAll() {
        return newLCVRegistrationByFuelTypeRepository.findAll();
    }

    @Override
    public List<NewLCVRegistrationByFuelTypeDataModel> addNewLCVRegistrationByFuelTypeData(List<NewLCVRegistrationByFuelTypeDataModel> newLCVRegistrationByFuelTypeDataModelList) {
        return newLCVRegistrationByFuelTypeRepository.saveAll(newLCVRegistrationByFuelTypeDataModelList);
    }

    public List<NewLCVRegistrationByFuelTypeDataModel> findAllNewLCVRegistrationsByType(String type) {
        List<NewLCVRegistrationByFuelTypeDataModel> newLCVRegistrationByFuelTypeDataModelList = newLCVRegistrationByFuelTypeRepository.findAllLCVRegistrationByFuelTypeByType(type);
        return newLCVRegistrationByFuelTypeDataModelList;
    }

}