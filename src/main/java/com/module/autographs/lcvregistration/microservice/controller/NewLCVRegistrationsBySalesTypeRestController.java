package com.module.autographs.lcvregistration.microservice.controller;

import com.module.autographs.lcvregistration.microservice.service.NewLCVRegistrationBySalesTypeService;
import com.module.autographs.lcvregistration.microservice.util.Constants;
import com.module.autographs.lcvregistration.microservice.util.ObjectMapperUtils;
import com.module.autographs.lcvregistration.microservice.dto.NewLCVRegistrationBySalesTypeDTO;
import com.module.autographs.lcvregistration.microservice.model.NewLCVRegistrationBySalesTypeDataModel;
import com.module.autographs.lcvregistration.microservice.repository.NewLCVRegistrationBySalesTypeRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/v1/newLCVRegistrations")
@Tag(name = "NewLCVRegistrations")

public class NewLCVRegistrationsBySalesTypeRestController {

    @Autowired
    private NewLCVRegistrationBySalesTypeService newLCVRegistrationBySalesTypeService;

    @Autowired
    private NewLCVRegistrationBySalesTypeRepository newLCVRegistrationBySalesTypeRepository;

    @GetMapping(value = Constants.NEW_LCV_REGISTRATION_BY_SALES_TYPE_GET_API_PATH)
    @Operation(summary = Constants.NEW_LCV_REGISTRATION_BY_SALES_TYPE_GET_SUMMARY, responses = {@ApiResponse(description = Constants.NEW_LCV_REGISTRATION_BY_SALES_TYPE_SUCCESS, responseCode = Constants.HTTP_RESPONSE_CODE_OK, content = @Content(mediaType = "application/json", schema = @Schema(implementation = NewLCVRegistrationBySalesTypeDTO.class))), @ApiResponse(description = Constants.NEW_LCV_REGISTRATION_BY_SALES_TYPE_NO_DATA_FOUND, responseCode = Constants.HTTP_RESPONSE_CODE_OK, content = @Content)})
    public List<NewLCVRegistrationBySalesTypeDTO> getLCVRegistrationBySalesTypeData() {
        List<NewLCVRegistrationBySalesTypeDTO> newLCVRegistrationBySalesTypeDTOList = ObjectMapperUtils.mapAll(newLCVRegistrationBySalesTypeService.findAll(), NewLCVRegistrationBySalesTypeDTO.class);
        if (newLCVRegistrationBySalesTypeDTOList.size() > 0) {
            return ResponseEntity.ok(newLCVRegistrationBySalesTypeDTOList).getBody();
        } else {
            throw new ResponseStatusException(HttpStatus.OK, Constants.NEW_LCV_REGISTRATION_BY_SALES_TYPE_NO_DATA_FOUND);
        }
    }

    @PostMapping(value = Constants.NEW_LCV_REGISTRATION_BY_SALES_TYPE_POST_API_PATH)
    @Operation(summary = Constants.NEW_LCV_REGISTRATION_BY_SALES_TYPE_POST_SUMMARY, responses = {@ApiResponse(description = Constants.NEW_LCV_REGISTRATION_BY_SALES_TYPE_ADD_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewLCVRegistrationBySalesTypeDTO.class))), @ApiResponse(description = Constants.NEW_LCV_REGISTRATION_BY_SALES_TYPE_ADD_FAILURE, responseCode = Constants.HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> addLCVRegistrationBySalesTypeData(@RequestBody List<NewLCVRegistrationBySalesTypeDTO> newLCVRegistrationBySalesTypeDTOList) {
        List<NewLCVRegistrationBySalesTypeDataModel> newLCVRegistrationBySalesTypeDataModelList = newLCVRegistrationBySalesTypeService.addNewLCVRegistrationBySalesTypeData(ObjectMapperUtils.mapAll(newLCVRegistrationBySalesTypeDTOList, NewLCVRegistrationBySalesTypeDataModel.class));
        if (newLCVRegistrationBySalesTypeDataModelList.size() > 0) {
            return ResponseEntity.ok(Constants.NEW_LCV_REGISTRATION_BY_SALES_TYPE_ADD_SUCCESS);
        } else {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, Constants.NEW_LCV_REGISTRATION_BY_SALES_TYPE_ADD_FAILURE);
        }
    }

    @DeleteMapping(value = Constants.NEW_LCV_REGISTRATION_BY_SALES_TYPE_DELETE_ALL_API_PATH)
    @Operation(summary = Constants.NEW_LCV_REGISTRATION_BY_SALES_TYPE_DELETE_ALL_SUMMARY, responses = {@ApiResponse(description = Constants.NEW_LCV_REGISTRATION_BY_SALES_TYPE_DELETE_ALL_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewLCVRegistrationBySalesTypeDTO.class))), @ApiResponse(description = Constants.NEW_LCV_REGISTRATION_BY_SALES_TYPE_DELETE_ALL_FAILURE, responseCode = Constants.HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> deleteAllLCVRegistrationBySalesTypeData() {
        newLCVRegistrationBySalesTypeRepository.deleteAll();
        return ResponseEntity.ok(Constants.NEW_LCV_REGISTRATION_BY_SALES_TYPE_DELETE_ALL_SUCCESS);
    }

}
