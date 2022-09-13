package com.module.autographs.lcvregistration.microservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "lcvRegistrationCollection")
public class NewLCVRegistrationDataModel {

    @Id
    private String id;
    private String year;
    private String month;
    private String newLCVRegistrationCount;

    public NewLCVRegistrationDataModel() {
    }

    public NewLCVRegistrationDataModel(String id, String year, String month, String newLCVRegistrationCount) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.newLCVRegistrationCount = newLCVRegistrationCount;
    }

    @Override
    public String toString() {
        return "NewLCVRegistrationDataModel{" + "id='" + id + '\'' + ", year='" + year + '\'' + ", month='" + month + '\'' + ", newLCVRegistrationCount='" + newLCVRegistrationCount + '\'' + '}';
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

    public String getNewLCVRegistrationCount() {
        return newLCVRegistrationCount;
    }

    public void setNewLCVRegistrationCount(String newLCVRegistrationCount) {
        this.newLCVRegistrationCount = newLCVRegistrationCount;
    }
}