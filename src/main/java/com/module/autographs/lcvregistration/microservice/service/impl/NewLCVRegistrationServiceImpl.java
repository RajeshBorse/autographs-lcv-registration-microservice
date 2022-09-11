package com.module.autographs.lcvregistration.microservice.service.impl;

import com.module.autographs.lcvregistration.microservice.model.NewLCVRegistrationDataModel;
import com.module.autographs.lcvregistration.microservice.service.NewLCVRegistrationService;
import com.module.autographs.lcvregistration.microservice.repository.NewLCVRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewLCVRegistrationServiceImpl implements NewLCVRegistrationService {

    @Autowired
    NewLCVRegistrationRepository newLCVRegistrationRepository;

    @Override
    public List<NewLCVRegistrationDataModel> findAll() {
        return newLCVRegistrationRepository.findAll();
    }

    @Override
    public List<NewLCVRegistrationDataModel> addNewLCVRegistrationData(List<NewLCVRegistrationDataModel> newLCVRegistrationDataModelList) {
        return newLCVRegistrationRepository.saveAll(newLCVRegistrationDataModelList);
    }

    public List<NewLCVRegistrationDataModel> findAllNewLCVRegistrationsByType(String type) {
        List<NewLCVRegistrationDataModel> newLCVRegistrationDataModelList = newLCVRegistrationRepository.findAllLCVRegistrationByType(type);
        return newLCVRegistrationDataModelList;
    }

}