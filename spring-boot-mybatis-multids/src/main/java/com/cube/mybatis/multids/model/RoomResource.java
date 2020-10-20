package com.cube.mybatis.multids.model;

import java.io.Serializable;
import java.util.Date;

public class RoomResource implements Serializable {
    private Integer id;

    private Integer roomId;

    private String roomCode;

    private Integer suiteId;

    private Double price;

    private Double area;

    private String face;

    private String rentType;

    private String hasToilet;

    private String hasBalcony;

    private String roomStatus;

    private String status;

    private String xiaoquName;

    private Double isParking;

    private String blockName;

    private Integer distance;

    private Integer vacancyDays;

    private Date createdAt;

    private String city;

    private Integer bedroomNum;

    private Integer toiletNum;

    private Integer sfRemainDays;

    private String hasMonthRent;

    private Integer dkAvgPrice;

    private String hdnamesMon;

    private Integer cashbackMon;

    private Integer cutdirectMon;

    private String hdnamesYear;

    private Integer cashbackYear;

    private Integer cutdirectYear;

    private String rentGender;

    private Integer rentNum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode == null ? null : roomCode.trim();
    }

    public Integer getSuiteId() {
        return suiteId;
    }

    public void setSuiteId(Integer suiteId) {
        this.suiteId = suiteId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face == null ? null : face.trim();
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType == null ? null : rentType.trim();
    }

    public String getHasToilet() {
        return hasToilet;
    }

    public void setHasToilet(String hasToilet) {
        this.hasToilet = hasToilet == null ? null : hasToilet.trim();
    }

    public String getHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(String hasBalcony) {
        this.hasBalcony = hasBalcony == null ? null : hasBalcony.trim();
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus == null ? null : roomStatus.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getXiaoquName() {
        return xiaoquName;
    }

    public void setXiaoquName(String xiaoquName) {
        this.xiaoquName = xiaoquName == null ? null : xiaoquName.trim();
    }

    public Double getIsParking() {
        return isParking;
    }

    public void setIsParking(Double isParking) {
        this.isParking = isParking;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName == null ? null : blockName.trim();
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getVacancyDays() {
        return vacancyDays;
    }

    public void setVacancyDays(Integer vacancyDays) {
        this.vacancyDays = vacancyDays;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getBedroomNum() {
        return bedroomNum;
    }

    public void setBedroomNum(Integer bedroomNum) {
        this.bedroomNum = bedroomNum;
    }

    public Integer getToiletNum() {
        return toiletNum;
    }

    public void setToiletNum(Integer toiletNum) {
        this.toiletNum = toiletNum;
    }

    public Integer getSfRemainDays() {
        return sfRemainDays;
    }

    public void setSfRemainDays(Integer sfRemainDays) {
        this.sfRemainDays = sfRemainDays;
    }

    public String getHasMonthRent() {
        return hasMonthRent;
    }

    public void setHasMonthRent(String hasMonthRent) {
        this.hasMonthRent = hasMonthRent == null ? null : hasMonthRent.trim();
    }

    public Integer getDkAvgPrice() {
        return dkAvgPrice;
    }

    public void setDkAvgPrice(Integer dkAvgPrice) {
        this.dkAvgPrice = dkAvgPrice;
    }

    public String getHdnamesMon() {
        return hdnamesMon;
    }

    public void setHdnamesMon(String hdnamesMon) {
        this.hdnamesMon = hdnamesMon == null ? null : hdnamesMon.trim();
    }

    public Integer getCashbackMon() {
        return cashbackMon;
    }

    public void setCashbackMon(Integer cashbackMon) {
        this.cashbackMon = cashbackMon;
    }

    public Integer getCutdirectMon() {
        return cutdirectMon;
    }

    public void setCutdirectMon(Integer cutdirectMon) {
        this.cutdirectMon = cutdirectMon;
    }

    public String getHdnamesYear() {
        return hdnamesYear;
    }

    public void setHdnamesYear(String hdnamesYear) {
        this.hdnamesYear = hdnamesYear == null ? null : hdnamesYear.trim();
    }

    public Integer getCashbackYear() {
        return cashbackYear;
    }

    public void setCashbackYear(Integer cashbackYear) {
        this.cashbackYear = cashbackYear;
    }

    public Integer getCutdirectYear() {
        return cutdirectYear;
    }

    public void setCutdirectYear(Integer cutdirectYear) {
        this.cutdirectYear = cutdirectYear;
    }

    public String getRentGender() {
        return rentGender;
    }

    public void setRentGender(String rentGender) {
        this.rentGender = rentGender == null ? null : rentGender.trim();
    }

    public Integer getRentNum() {
        return rentNum;
    }

    public void setRentNum(Integer rentNum) {
        this.rentNum = rentNum;
    }
}