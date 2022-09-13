package com.module.autographs.lcvregistration.microservice.util;

public class Constants {

    // HTTP STATUS CODES
    public static final String HTTP_RESPONSE_CODE_OK = "200";
    public static final String HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR = "500";

    // API CONSTANTS ---------------------------------------------------

    // 1 - NEW LCV REGISTRATIONS
    public static final String GET_API_PATH = "/getAllNewLcvRegistrationsData";
    public static final String POST_API_PATH = "/addNewLcvRegistrationsData";
    public static final String DELETE_ALL_API_PATH = "/deleteAllNewLcvRegistrationsData";

    // 2 - NEW LCV REGISTRATIONS BY FUEL TYPE
    public static final String GET_API_PATH_BY_FUEL_TYPE = "/getAllNewLcvRegistrationsByFuelTypeData";
    public static final String POST_API_PATH_BY_FUEL_TYPE = "/addNewLcvRegistrationsByFuelTypeData";
    public static final String DELETE_ALL_API_PATH_BY_FUEL_TYPE = "/deleteAllNewLcvRegistrationsByFuelTypeData";

    // 3 - NEW LCV REGISTRATIONS BY SALES TYPE
    public static final String GET_API_PATH_BY_SALES_TYPE = "/getAllNewLcvRegistrationsBySalesTypeData";
    public static final String POST_API_PATH_BY_SALES_TYPE = "/addNewLcvRegistrationsBySalesTypeData";
    public static final String DELETE_ALL_API_PATH_BY_SALES_TYPE = "/deleteAllNewLcvRegistrationsBySalesTypeData";


    // SWAGGER CONSTANTS ---------------------------------------------------

    // 1 - NEW LCV REGISTRATIONS
    // GET API
    public static final String SWAGGER_GET_API_SUMMARY = "GET API - New Lcv Registration Data Summary.";
    public static final String SWAGGER_GET_API_SUCCESS = "GET API - New Lcv Registration Data Fetched Successfully.";
    public static final String SWAGGER_GET_API_NO_DATA_FOUND = "GET API - New Lcv Registration Data Not Available.";

    // POST API
    public static final String SWAGGER_POST_API_SUMMARY = "POST API - New Lcv Registration Data Summary.";
    public static final String SWAGGER_POST_API_SUCCESS = "POST API - New Lcv Registration Data Added Successfully.";
    public static final String SWAGGER_POST_API_FAILURE = "POST API - Failure Occurred While Adding New Lcv Registration data.";

    // DELETE API
    public static final String SWAGGER_DELETE_API_SUMMARY = "DELETE API - New Lcv Registration Data Summary.";
    public static final String SWAGGER_DELETE_API_SUCCESS = "DELETE API - New Lcv Registration Data Deleted Successfully.";
    public static final String SWAGGER_DELETE_API_FAILURE = "DELETE API - Failure occurred while deleting New Lcv Registration data.";

    // 2 - NEW LCV REGISTRATIONS BY FUEL TYPE
    // GET API
    public static final String SWAGGER_GET_API_BY_FUEL_TYPE_SUMMARY = "GET API - New Lcv Registration By Fuel Type Data Summary.";
    public static final String SWAGGER_GET_API_BY_FUEL_TYPE_SUCCESS = "GET API - New Lcv Registration By Fuel Type Data Fetched Successfully.";
    public static final String SWAGGER_GET_API_BY_FUEL_TYPE_NO_DATA_FOUND = "GET API - New Lcv Registration By Fuel Type Data Not Available.";

    // POST API
    public static final String SWAGGER_POST_API_BY_FUEL_TYPE_SUMMARY = "POST API - New Lcv Registration By Fuel Type Data Summary.";
    public static final String SWAGGER_POST_API_BY_FUEL_TYPE_SUCCESS = "POST API - New Lcv Registration By Fuel Type Data Added Successfully.";
    public static final String SWAGGER_POST_API_BY_FUEL_TYPE_FAILURE = "POST API - Failure Occurred While Adding New Lcv Registration Data By Fuel Type.";

    // DELETE API
    public static final String SWAGGER_DELETE_API_BY_FUEL_TYPE_SUMMARY = "DELETE API - New Lcv Registration By Fuel Type Data Summary.";
    public static final String SWAGGER_DELETE_API_BY_FUEL_TYPE_SUCCESS = "DELETE API - New Lcv Registration By Fuel Type Data Deleted Successfully.";
    public static final String SWAGGER_DELETE_API_BY_FUEL_TYPE_FAILURE = "DELETE API - Failure Occurred While Deleting New Lcv Registration Data By Fuel Type.";

    // 3 - NEW LCV REGISTRATIONS BY SALES TYPE
    // GET API
    public static final String SWAGGER_GET_API_BY_SALES_TYPE_SUMMARY = "GET API - New Lcv Registration By Sales Type Data Summary.";
    public static final String SWAGGER_GET_API_BY_SALES_TYPE_SUCCESS = "GET API - New Lcv Registration By Sales Type Data Fetched Successfully.";
    public static final String SWAGGER_GET_API_BY_SALES_TYPE_NO_DATA_FOUND = "GET API - New Lcv Registration By Sales Type Data Not Available.";

    // POST API
    public static final String SWAGGER_POST_API_BY_SALES_TYPE_SUMMARY = "POST API - New Lcv Registration By Sales Type Data Summary.";
    public static final String SWAGGER_POST_API_BY_SALES_TYPE_SUCCESS = "POST API - New Lcv Registration By Sales Type Data Added Successfully.";
    public static final String SWAGGER_POST_API_BY_SALES_TYPE_FAILURE = "POST API - Failure Occurred While Adding New Lcv Registration Data By Sales Type.";

    // DELETE API
    public static final String SWAGGER_DELETE_API_BY_SALES_TYPE_SUMMARY = "DELETE API - New Lcv Registration By Sales Type Data Summary.";
    public static final String SWAGGER_DELETE_API_BY_SALES_TYPE_SUCCESS = "DELETE API - New Lcv Registration By Sales Type Data Deleted Successfully.";
    public static final String SWAGGER_DELETE_API_BY_SALES_TYPE_FAILURE = "DELETE API - Failure Occurred While Deleting New Lcv Registration Data By Sales Type.";

    // LOGGER CONSTANTS ---------------------------------------------------
    // LOGGER CONSTANTS ---------------------------------------------------
    public static final String LOGGER_GET_API_SUCCESS = "NewLCVRegistrationsRestController : LOGGER : GET API : Data Fetch Success";
    public static final String LOGGER_GET_API_FAILURE = "NewLCVRegistrationsRestController : LOGGER : GET API : Data Fetch Failure";
    public static final String LOGGER_POST_API_SUCCESS = "NewLCVRegistrationsRestController : LOGGER : POST API : Data Adding Success";
    public static final String LOGGER_POST_API_FAILURE = "NewLCVRegistrationsRestController : LOGGER : POST API : Data Adding Failure";
    public static final String LOGGER_DELETE_API_SUCCESS = "NewLCVRegistrationsRestController : LOGGER : DELETE API : Data Deleting Success";

    public static final String LOGGER_GET_API_BY_FUEL_TYPE_SUCCESS = "NewLCVRegistrationsByFuelTypeRestController : LOGGER : GET API : Data Fetch Success";
    public static final String LOGGER_GET_API_BY_FUEL_TYPE_FAILURE = "NewLCVRegistrationsByFuelTypeRestController : LOGGER : GET API : Data Fetch Failure";
    public static final String LOGGER_POST_API_BY_FUEL_TYPE_SUCCESS = "NewLCVRegistrationsByFuelTypeRestController : LOGGER : POST API : Data Adding Success";
    public static final String LOGGER_POST_API_BY_FUEL_TYPE_FAILURE = "NewLCVRegistrationsByFuelTypeRestController : LOGGER : POST API : Data Adding Failure";
    public static final String LOGGER_DELETE_API_BY_FUEL_TYPE_SUCCESS = "NewLCVRegistrationsByFuelTypeRestController : LOGGER : DELETE API : Data Deleting Success";

    public static final String LOGGER_GET_API_BY_SALES_TYPE_SUCCESS = "NewLCVRegistrationsBySalesTypeRestController : LOGGER : GET API : Data Fetch Success";
    public static final String LOGGER_GET_API_BY_SALES_TYPE_FAILURE = "NewLCVRegistrationsBySalesTypeRestController : LOGGER : GET API : Data Fetch Failure";
    public static final String LOGGER_POST_API_BY_SALES_TYPE_SUCCESS = "NewLCVRegistrationsBySalesTypeRestController : LOGGER : POST API : Data Adding Success";
    public static final String LOGGER_POST_API_BY_SALES_TYPE_FAILURE = "NewLCVRegistrationsBySalesTypeRestController : LOGGER : POST API : Data Adding Failure";
    public static final String LOGGER_DELETE_API_BY_SALES_TYPE_SUCCESS = "NewLCVRegistrationsBySalesTypeRestController : LOGGER : DELETE API : Data Deleting Success";

}
