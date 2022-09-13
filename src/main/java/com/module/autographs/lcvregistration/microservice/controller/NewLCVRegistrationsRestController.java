package com.module.autographs.lcvregistration.microservice.controller;

import com.module.autographs.lcvregistration.microservice.AutographsLcvRegistrationApplication;
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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import static com.module.autographs.lcvregistration.microservice.util.Constants.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/newLcvRegistrations")
@Tag(name = "NewLCVRegistrationsRestController")

public class NewLCVRegistrationsRestController {

    @Autowired
    private NewLCVRegistrationService newLCVRegistrationService;

    @Autowired
    private NewLCVRegistrationRepository newLCVRegistrationRepository;

    private static final Logger logger = LogManager.getLogger(AutographsLcvRegistrationApplication.class);

    @GetMapping(value = GET_API_PATH)
    @Operation(summary = SWAGGER_GET_API_SUMMARY, responses = {@ApiResponse(description = SWAGGER_GET_API_SUCCESS, responseCode = HTTP_RESPONSE_CODE_OK, content = @Content(mediaType = "application/json", schema = @Schema(implementation = NewLCVRegistrationDTO.class))), @ApiResponse(description = SWAGGER_GET_API_NO_DATA_FOUND, responseCode = HTTP_RESPONSE_CODE_OK, content = @Content)})
    public List<NewLCVRegistrationDTO> getNewLCVRegistrationData() {
        List<NewLCVRegistrationDTO> newLCVRegistrationDTOList = ObjectMapperUtils.mapAll(newLCVRegistrationService.findAll(), NewLCVRegistrationDTO.class);
        if (newLCVRegistrationDTOList.size() > 0) {
            logger.info(LOGGER_GET_API_SUCCESS);
            return ResponseEntity.ok(newLCVRegistrationDTOList).getBody();
        } else {
            logger.info(LOGGER_GET_API_FAILURE);
            throw new ResponseStatusException(HttpStatus.OK, SWAGGER_GET_API_NO_DATA_FOUND);
        }
    }

    @PostMapping(value = POST_API_PATH)
    @Operation(summary = SWAGGER_POST_API_SUMMARY, responses = {@ApiResponse(description = SWAGGER_POST_API_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewLCVRegistrationDTO.class))), @ApiResponse(description = SWAGGER_POST_API_FAILURE, responseCode = HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> addLCVRegistrationData(@RequestBody List<NewLCVRegistrationDTO> newLCVRegistrationDTOList) {
        List<NewLCVRegistrationDataModel> newLCVRegistrationDataModelList = newLCVRegistrationService.addNewLCVRegistrationData(ObjectMapperUtils.mapAll(newLCVRegistrationDTOList, NewLCVRegistrationDataModel.class));
        if (newLCVRegistrationDataModelList.size() > 0) {
            logger.info(LOGGER_POST_API_SUCCESS);
            return ResponseEntity.ok(SWAGGER_POST_API_SUCCESS);
        } else {
            logger.info(LOGGER_POST_API_FAILURE);
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, SWAGGER_POST_API_FAILURE);
        }
    }

    @DeleteMapping(value = DELETE_ALL_API_PATH)
    @Operation(summary = SWAGGER_DELETE_API_SUMMARY, responses = {@ApiResponse(description = SWAGGER_DELETE_API_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewLCVRegistrationDTO.class))), @ApiResponse(description = SWAGGER_DELETE_API_FAILURE, responseCode = HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> deleteAllLCVRegistrationData() {
        newLCVRegistrationRepository.deleteAll();
        logger.info(LOGGER_DELETE_API_SUCCESS);

        return ResponseEntity.ok(SWAGGER_DELETE_API_SUCCESS);
    }

}
