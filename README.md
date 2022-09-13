# University of Leicester - Masters Project

Autographs is an application designed and developed as a part of an academic project for the year 2021/22. This is designed and developed by Rajesh Borse (rsb34)

## Requirements
As per the project requirements, we are expected to display the cloud-based data in the form of charts to android mobile users.

## Microservice

Autographs LCV Registration Microservice - This is a spring-boot java microservice which has RESTful APIs which will be used by the android mobile application for displaying the charts in the frontend systems based on the service response.

Below are the services that this microservice serves.

- New LCV Registrations.
- New LCV Registrations by Fuel Type.
- New LCV Registrations by Sales Type.

Below are the endpoints that are exposed by this microservice.

## New LCV Registrations

- GET API Endpoint - Used for fetching all the LCV registration data from the MongoDB database.


```bash
/api/v1/newLcvRegistrations/getAllNewLcvRegistrationsData
```


- POST API Endpoint - Used for inserting all the LCV registration data in the MongoDB database.

```bash
/api/v1/newLcvRegistrations/addNewLcvRegistrationsData
```


- DELETE API Endpoint - Used for deleting all the LCV registrations in the MongoDB database.
```bash
/api/v1/newLcvRegistrations/deleteAllNewLcvRegistrationsData
```


## New LCV Registrations by Fuel Type

- GET API Endpoint - Used for fetching all the LCV Registrations by Fuel Type data from the MongoDB database.

```bash
/api/v1/newLcvRegistrations/getAllNewLcvRegistrationsByFuelTypeData
```

- POST API Endpoint - Used for inserting all the LCV Registrations by Fuel Type data in the MongoDB database.

```bash
/api/v1/newLcvRegistrations/addNewLcvRegistrationsByFuelTypeData
```

- DELETE API Endpoint - Used for deleting all the LCV Registrations by Fuel Type data in the MongoDB database.
```bash
/api/v1/newLcvRegistrations/deleteAllNewLcvRegistrationsByFuelTypeData
```

## New LCV Registrations by Sales Type
- GET API Endpoint - Used for fetching all the LCV Registrations by Sales Type data from the MongoDB database.

```bash
/api/v1/newLcvRegistrations/getAllNewLcvRegistrationsBySalesTypeData
```

- POST API Endpoint - Used for inserting all the LCV Registrations by Sales Type data in the MongoDB database.

```bash
/api/v1/newLcvRegistrations/addNewLcvRegistrationsBySalesTypeData
```

- DELETE API Endpoint - Used for deleting all the LCV Registrations by Sales Type data in the MongoDB database.
```bash
/api/v1/newLcvRegistrations/deleteAllNewLcvRegistrationsBySalesTypeData
