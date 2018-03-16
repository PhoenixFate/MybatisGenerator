package com.entity;

import java.util.Date;

public class Data {
    private Integer id;

    private String cityName;

    private Integer cityId;

    private String markName;

    private Double markLatitude;

    private Double markLongitude;

    private String markDescribe;

    private String markAddress;

    private Date createDate;

    private Date lastDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getMarkName() {
        return markName;
    }

    public void setMarkName(String markName) {
        this.markName = markName == null ? null : markName.trim();
    }

    public Double getMarkLatitude() {
        return markLatitude;
    }

    public void setMarkLatitude(Double markLatitude) {
        this.markLatitude = markLatitude;
    }

    public Double getMarkLongitude() {
        return markLongitude;
    }

    public void setMarkLongitude(Double markLongitude) {
        this.markLongitude = markLongitude;
    }

    public String getMarkDescribe() {
        return markDescribe;
    }

    public void setMarkDescribe(String markDescribe) {
        this.markDescribe = markDescribe == null ? null : markDescribe.trim();
    }

    public String getMarkAddress() {
        return markAddress;
    }

    public void setMarkAddress(String markAddress) {
        this.markAddress = markAddress == null ? null : markAddress.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }
}