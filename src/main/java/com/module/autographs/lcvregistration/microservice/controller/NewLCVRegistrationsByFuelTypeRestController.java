package com.module.autographs.lcvregistration.microservice.controller;

import com.module.autographs.lcvregistration.microservice.AutographsLcvRegistrationApplication;
import com.module.autographs.lcvregistration.microservice.dto.NewLCVRegistrationByFuelTypeDTO;
import com.module.autographs.lcvregistration.microservice.model.NewLCVRegistrationByFuelTypeDataModel;
import com.module.autographs.lcvregistration.microservice.repository.NewLCVRegistrationByFuelTypeRepository;
import com.module.autographs.lcvregistration.microservice.service.NewLCVRegistrationByFuelTypeService;
import com.module.autographs.lcvregistration.microservice.util.ObjectMapperUtils;
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

import java.util.List;

import static com.module.autographs.lcvregistration.microservice.util.Constants.*;


@RestController
@RequestMapping("/api/v1/newLcvRegistrations")
@Tag(name = "NewLCVRegistrationsByFuelTypeRestController")

public class NewLCVRegistrationsByFuelTypeRestController {

    @Autowired
    private NewLCVRegistrationByFuelTypeService newLCVRegistrationByFuelTypeService;

    @Autowired
    private NewLCVRegistrationByFuelTypeRepository newLCVRegistrationByFuelTypeRepository;

    private static final Logger logger = LogManager.getLogger(AutographsLcvRegistrationApplication.class);

    @GetMapping(value = GET_API_PATH_BY_FUEL_TYPE)
    @Operation(summary = SWAGGER_GET_API_BY_FUEL_TYPE_SUMMARY, responses = {@ApiResponse(description = SWAGGER_GET_API_BY_FUEL_TYPE_SUCCESS, responseCode = HTTP_RESPONSE_CODE_OK, content = @Content(mediaType = "application/json", schema = @Schema(implementation = NewLCVRegistrationByFuelTypeDTO.class))), @ApiResponse(description = SWAGGER_GET_API_BY_FUEL_TYPE_NO_DATA_FOUND, responseCode = HTTP_RESPONSE_CODE_OK, content = @Content)})
    public List<NewLCVRegistrationByFuelTypeDTO> getLCVRegistrationByFuelTypeData() {
        List<NewLCVRegistrationByFuelTypeDTO> newLCVRegistrationByFuelTypeDTOList = ObjectMapperUtils.mapAll(newLCVRegistrationByFuelTypeService.findAll(), NewLCVRegistrationByFuelTypeDTO.class);
        if (newLCVRegistrationByFuelTypeDTOList.size() > 0) {
            logger.info(LOGGER_GET_API_BY_FUEL_TYPE_SUCCESS);
            return ResponseEntity.ok(newLCVRegistrationByFuelTypeDTOList).getBody();
        } else {
            logger.info(LOGGER_GET_API_BY_FUEL_TYPE_FAILURE);

            throw new ResponseStatusException(HttpStatus.OK, SWAGGER_GET_API_BY_FUEL_TYPE_NO_DATA_FOUND);
        }
    }

    @PostMapping(value = POST_API_PATH_BY_FUEL_TYPE)
    @Operation(summary = SWAGGER_POST_API_BY_FUEL_TYPE_SUMMARY, responses = {@ApiResponse(description = SWAGGER_POST_API_BY_FUEL_TYPE_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewLCVRegistrationByFuelTypeDTO.class))), @ApiResponse(description = SWAGGER_POST_API_BY_FUEL_TYPE_FAILURE, responseCode = HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> addLCVRegistrationByFuelTypeData(@RequestBody List<NewLCVRegistrationByFuelTypeDTO> newLCVRegistrationByFuelTypeDTOList) {
        List<NewLCVRegistrationByFuelTypeDataModel> newLCVRegistrationByFuelTypeDataModelsList = newLCVRegistrationByFuelTypeService.addNewLCVRegistrationByFuelTypeData(ObjectMapperUtils.mapAll(newLCVRegistrationByFuelTypeDTOList, NewLCVRegistrationByFuelTypeDataModel.class));
        if (newLCVRegistrationByFuelTypeDataModelsList.size() > 0) {
            logger.info(LOGGER_POST_API_BY_FUEL_TYPE_SUCCESS);

            return ResponseEntity.ok(SWAGGER_POST_API_BY_FUEL_TYPE_SUCCESS);
        } else {
            logger.info(LOGGER_POST_API_BY_FUEL_TYPE_FAILURE);

            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, SWAGGER_POST_API_BY_FUEL_TYPE_FAILURE);
        }
    }

    @DeleteMapping(value = DELETE_ALL_API_PATH_BY_FUEL_TYPE)
    @Operation(summary = SWAGGER_DELETE_API_BY_FUEL_TYPE_SUMMARY, responses = {@ApiResponse(description = SWAGGER_DELETE_API_BY_FUEL_TYPE_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewLCVRegistrationByFuelTypeDTO.class))), @ApiResponse(description = SWAGGER_DELETE_API_BY_FUEL_TYPE_FAILURE, responseCode = HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> deleteAllLCVRegistrationByFuelTypeData() {
        logger.info(LOGGER_DELETE_API_BY_FUEL_TYPE_SUCCESS);

        newLCVRegistrationByFuelTypeRepository.deleteAll();
        return ResponseEntity.ok(SWAGGER_DELETE_API_BY_FUEL_TYPE_SUCCESS);
    }

}
