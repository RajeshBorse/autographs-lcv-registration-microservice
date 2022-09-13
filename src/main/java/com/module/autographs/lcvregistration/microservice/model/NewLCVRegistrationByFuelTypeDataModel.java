package com.module.autographs.lcvregistration.microservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fuelTypeCollection")
public class NewLCVRegistrationByFuelTypeDataModel {

    @Id
    private String id;
    private String year;
    private String month;
    private String type;
    private String newLCVRegistrationByFuelTypeCount;

    private String percentage;

    public NewLCVRegistrationByFuelTypeDataModel() {
    }

    public NewLCVRegistrationByFuelTypeDataModel(String id, String year, String month, String type, String newLCVRegistrationByFuelTypeCount, String percentage) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.type = type;
        this.newLCVRegistrationByFuelTypeCount = newLCVRegistrationByFuelTypeCount;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "NewLCVRegistrationByFuelTypeDataModel{" +
                "id='" + id + '\'' +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", type='" + type + '\'' +
                ", newLCVRegistrationByFuelTypeCount='" + newLCVRegistrationByFuelTypeCount + '\'' +
                ", percentage='" + percentage + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNewLCVRegistrationByFuelTypeCount() {
        return newLCVRegistrationByFuelTypeCount;
    }

    public void setNewLCVRegistrationByFuelTypeCount(String newLCVRegistrationByFuelTypeCount) {
        this.newLCVRegistrationByFuelTypeCount = newLCVRegistrationByFuelTypeCount;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }
}