package com.module.autographs.lcvregistration.microservice.controller;

import com.module.autographs.lcvregistration.microservice.model.NewLCVRegistrationDataModel;
import com.module.autographs.lcvregistration.microservice.service.NewLCVRegistrationService;
import com.module.autographs.lcvregistration.microservice.util.Constants;
import com.module.autographs.lcvregistration.microservice.util.ObjectMapperUtils;
import com.module.autographs.lcvregistration.microservice.dto.NewLCVRegistrationDTO;
import com.module.autographs.lcvregistration.microservice.repository.NewLCVRegistrationRepository;
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

public class NewLCVRegistrationsRestController {

    @Autowired
    private NewLCVRegistrationService newLCVRegistrationService;

    @Autowired
    private NewLCVRegistrationRepository newLCVRegistrationRepository;

    @GetMapping(value = Constants.NEW_LCV_REGISTRATION_GET_API_PATH)
    @Operation(summary = Constants.NEW_LCV_REGISTRATION_GET_SUMMARY, responses = {@ApiResponse(description = Constants.NEW_LCV_REGISTRATION_SUCCESS, responseCode = Constants.HTTP_RESPONSE_CODE_OK, content = @Content(mediaType = "application/json", schema = @Schema(implementation = NewLCVRegistrationDTO.class))), @ApiResponse(description = Constants.NEW_LCV_REGISTRATION_NO_DATA_FOUND, responseCode = Constants.HTTP_RESPONSE_CODE_OK, content = @Content)})
    public List<NewLCVRegistrationDTO> getNewLCVRegistrationData() {
        List<NewLCVRegistrationDTO> newLCVRegistrationDTOList = ObjectMapperUtils.mapAll(newLCVRegistrationService.findAll(), NewLCVRegistrationDTO.class);
        if (newLCVRegistrationDTOList.size() > 0) {
            return ResponseEntity.ok(newLCVRegistrationDTOList).getBody();
        } else {
            throw new ResponseStatusException(HttpStatus.OK, Constants.NEW_LCV_REGISTRATION_NO_DATA_FOUND);
        }
    }

    @PostMapping(value = Constants.NEW_LCV_REGISTRATION_POST_API_PATH)
    @Operation(summary = Constants.NEW_LCV_REGISTRATION_POST_SUMMARY, responses = {@ApiResponse(description = Constants.NEW_LCV_REGISTRATION_ADD_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewLCVRegistrationDTO.class))), @ApiResponse(description = Constants.NEW_LCV_REGISTRATION_ADD_FAILURE, responseCode = Constants.HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> addLCVRegistrationData(@RequestBody List<NewLCVRegistrationDTO> newLCVRegistrationDTOList) {
        List<NewLCVRegistrationDataModel> newLCVRegistrationDataModelList = newLCVRegistrationService.addNewLCVRegistrationData(ObjectMapperUtils.mapAll(newLCVRegistrationDTOList, NewLCVRegistrationDataModel.class));
        if (newLCVRegistrationDataModelList.size() > 0) {
            return ResponseEntity.ok(Constants.NEW_LCV_REGISTRATION_ADD_SUCCESS);
        } else {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, Constants.NEW_LCV_REGISTRATION_ADD_FAILURE);
        }
    }

    @DeleteMapping(value = Constants.NEW_LCV_REGISTRATION_DELETE_ALL_API_PATH)
    @Operation(summary = Constants.NEW_LCV_REGISTRATION_DELETE_ALL_SUMMARY, responses = {@ApiResponse(description = Constants.NEW_LCV_REGISTRATION_DELETE_ALL_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewLCVRegistrationDTO.class))), @ApiResponse(description = Constants.NEW_LCV_REGISTRATION_DELETE_ALL_FAILURE, responseCode = Constants.HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> deleteAllLCVRegistrationData() {
        newLCVRegistrationRepository.deleteAll();
        return ResponseEntity.ok(Constants.NEW_LCV_REGISTRATION_DELETE_ALL_SUCCESS);
    }

}
