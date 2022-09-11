package com.module.autographs.lcvregistration.microservice.dto;

import org.springframework.data.annotation.Id;

/**
 * rsb34
 */

public class NewLCVRegistrationBySalesTypeDTO {

    @Id
    private String id;
    private String year;
    private String month;
    private String type;
    private String newLCVRegistrationBySalesTypeCount;

    private String percentage;


    public NewLCVRegistrationBySalesTypeDTO() {
    }

    public NewLCVRegistrationBySalesTypeDTO(String id, String year, String month, String type, String newLCVRegistrationBySalesTypeCount, String percentage) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.type = type;
        this.newLCVRegistrationBySalesTypeCount = newLCVRegistrationBySalesTypeCount;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "NewLCVRegistrationBySalesTypeDTO{" +
                "id='" + id + '\'' +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", type='" + type + '\'' +
                ", newLCVRegistrationBySalesTypeCount='" + newLCVRegistrationBySalesTypeCount + '\'' +
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

    public String getNewLCVRegistrationBySalesTypeCount() {
        return newLCVRegistrationBySalesTypeCount;
    }

    public void setNewLCVRegistrationBySalesTypeCount(String newLCVRegistrationBySalesTypeCount) {
        this.newLCVRegistrationBySalesTypeCount = newLCVRegistrationBySalesTypeCount;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }
}