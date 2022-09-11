package com.module.autographs.lcvregistration.microservice.service.impl;

import com.module.autographs.lcvregistration.microservice.service.NewLCVRegistrationBySalesTypeService;
import com.module.autographs.lcvregistration.microservice.model.NewLCVRegistrationBySalesTypeDataModel;
import com.module.autographs.lcvregistration.microservice.repository.NewLCVRegistrationBySalesTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewLCVRegistrationBySalesTypeServiceImpl implements NewLCVRegistrationBySalesTypeService {

    @Autowired
    NewLCVRegistrationBySalesTypeRepository newLCVRegistrationBySalesTypeRepository;

    @Override
    public List<NewLCVRegistrationBySalesTypeDataModel> findAll() {
        return newLCVRegistrationBySalesTypeRepository.findAll();
    }

    @Override
    public List<NewLCVRegistrationBySalesTypeDataModel> addNewLCVRegistrationBySalesTypeData(List<NewLCVRegistrationBySalesTypeDataModel> newLCVRegistrationBySalesTypeDataModelList) {
        return newLCVRegistrationBySalesTypeRepository.saveAll(newLCVRegistrationBySalesTypeDataModelList);
    }

    public List<NewLCVRegistrationBySalesTypeDataModel> findAllNewLCVRegistrationsByType(String type) {
        List<NewLCVRegistrationBySalesTypeDataModel> newLCVRegistrationBySalesTypeDataModelList = newLCVRegistrationBySalesTypeRepository.findAllLCVRegistrationBySalesTypeByType(type);
        return newLCVRegistrationBySalesTypeDataModelList;
    }

}
