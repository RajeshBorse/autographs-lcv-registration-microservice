package com.module.autographs.lcvregistration.microservice.controller;

import com.module.autographs.lcvregistration.microservice.AutographsLcvRegistrationApplication;
import com.module.autographs.lcvregistration.microservice.dto.NewLCVRegistrationBySalesTypeDTO;
import com.module.autographs.lcvregistration.microservice.model.NewLCVRegistrationBySalesTypeDataModel;
import com.module.autographs.lcvregistration.microservice.repository.NewLCVRegistrationBySalesTypeRepository;
import com.module.autographs.lcvregistration.microservice.service.NewLCVRegistrationBySalesTypeService;
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
import static com.module.autographs.lcvregistration.microservice.util.Constants.SWAGGER_DELETE_API_BY_SALES_TYPE_SUCCESS;

@RestController
@RequestMapping("/api/v1/newLcvRegistrations")
@Tag(name = "NewLCVRegistrationsBySalesTypeRestController")

public class NewLCVRegistrationsBySalesTypeRestController {

    @Autowired
    private NewLCVRegistrationBySalesTypeService newLCVRegistrationBySalesTypeService;

    @Autowired
    private NewLCVRegistrationBySalesTypeRepository newLCVRegistrationBySalesTypeRepository;

    private static final Logger logger = LogManager.getLogger(AutographsLcvRegistrationApplication.class);

    @GetMapping(value = GET_API_PATH_BY_SALES_TYPE)
    @Operation(summary = SWAGGER_GET_API_BY_SALES_TYPE_SUMMARY, responses = {@ApiResponse(description = SWAGGER_GET_API_BY_SALES_TYPE_SUCCESS, responseCode = HTTP_RESPONSE_CODE_OK, content = @Content(mediaType = "application/json", schema = @Schema(implementation = NewLCVRegistrationBySalesTypeDTO.class))), @ApiResponse(description = SWAGGER_GET_API_BY_SALES_TYPE_NO_DATA_FOUND, responseCode = HTTP_RESPONSE_CODE_OK, content = @Content)})
    public List<NewLCVRegistrationBySalesTypeDTO> getLCVRegistrationBySalesTypeData() {
        List<NewLCVRegistrationBySalesTypeDTO> newLCVRegistrationBySalesTypeDTOList = ObjectMapperUtils.mapAll(newLCVRegistrationBySalesTypeService.findAll(), NewLCVRegistrationBySalesTypeDTO.class);
        if (newLCVRegistrationBySalesTypeDTOList.size() > 0) {
            logger.info(LOGGER_GET_API_BY_SALES_TYPE_SUCCESS);
            return ResponseEntity.ok(newLCVRegistrationBySalesTypeDTOList).getBody();
        } else {
            logger.info(LOGGER_GET_API_BY_SALES_TYPE_FAILURE);
            throw new ResponseStatusException(HttpStatus.OK, SWAGGER_GET_API_BY_SALES_TYPE_NO_DATA_FOUND);
        }
    }

    @PostMapping(value = POST_API_PATH_BY_SALES_TYPE)
    @Operation(summary = SWAGGER_POST_API_BY_SALES_TYPE_SUMMARY, responses = {@ApiResponse(description = SWAGGER_POST_API_BY_SALES_TYPE_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewLCVRegistrationBySalesTypeDTO.class))), @ApiResponse(description = SWAGGER_POST_API_BY_SALES_TYPE_FAILURE, responseCode = HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> addLCVRegistrationBySalesTypeData(@RequestBody List<NewLCVRegistrationBySalesTypeDTO> newLCVRegistrationBySalesTypeDTOList) {
        List<NewLCVRegistrationBySalesTypeDataModel> newLCVRegistrationBySalesTypeDataModelList = newLCVRegistrationBySalesTypeService.addNewLCVRegistrationBySalesTypeData(ObjectMapperUtils.mapAll(newLCVRegistrationBySalesTypeDTOList, NewLCVRegistrationBySalesTypeDataModel.class));
        if (newLCVRegistrationBySalesTypeDataModelList.size() > 0) {
            logger.info(LOGGER_POST_API_BY_SALES_TYPE_SUCCESS);

            return ResponseEntity.ok(SWAGGER_POST_API_BY_SALES_TYPE_SUCCESS);
        } else {
            logger.info(LOGGER_POST_API_BY_SALES_TYPE_FAILURE);

            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, SWAGGER_POST_API_BY_SALES_TYPE_FAILURE);
        }
    }

    @DeleteMapping(value = DELETE_ALL_API_PATH_BY_SALES_TYPE)
    @Operation(summary = SWAGGER_DELETE_API_BY_SALES_TYPE_SUMMARY, responses = {@ApiResponse(description = SWAGGER_DELETE_API_BY_SALES_TYPE_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewLCVRegistrationBySalesTypeDTO.class))), @ApiResponse(description = SWAGGER_DELETE_API_BY_SALES_TYPE_FAILURE, responseCode = HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> deleteAllLCVRegistrationBySalesTypeData() {
        logger.info(LOGGER_DELETE_API_BY_SALES_TYPE_SUCCESS);

        newLCVRegistrationBySalesTypeRepository.deleteAll();
        return ResponseEntity.ok(SWAGGER_DELETE_API_BY_SALES_TYPE_SUCCESS);
    }

}
