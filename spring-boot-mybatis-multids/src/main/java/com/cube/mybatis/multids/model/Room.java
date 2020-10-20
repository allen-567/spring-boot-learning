package com.cube.mybatis.multids.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Room implements Serializable {
    private Integer id;

    private String code;

    private Integer suiteId;

    private String roomNumber;

    private Integer customerId;

    private Integer dealerId;

    private Integer privateId;

    private Date contractSignedDate;

    private Short area;

    private Integer price;

    private Integer monthPrice;

    private String status;

    private String unusableStatus;

    private String soldOutStatus;

    private String rentType;

    private String fire;

    private Byte hasError;

    private String cityName;

    private String face;

    private Date availableDate;

    private Date rentBeginDate;

    private Date rentEndDate;

    private String isSeparatedRoom;

    private String isAbs;

    private String hasToilet;

    private String hasShower;

    private String hasBalcony;

    private String hasTv;

    private String hasTerrace;

    private String hasStoreroom;

    private BigDecimal bayWindowArea;

    private String allowQuarterly;

    private BigDecimal livingArea;

    private BigDecimal toiletArea;

    private BigDecimal balconyArea;

    private BigDecimal terraceArea;

    private BigDecimal storeroomArea;

    private String hasImage;

    private String version;

    private String style;

    private String lighting;

    private String isSmallWindow;

    private String hasCurtains;

    private String isRentFurniture;

    private String isLeaveFurniture;

    private String isWallWhite;

    private String shape;

    private String shapeNote;

    private String addressText;

    private String searchText;

    private Date disableExpireDate;

    private Integer disableBy;

    private String disableNote;

    private Byte imageNumber;

    private String isPhotographerUploaded;

    private String advantages;

    private Date deletedAt;

    private Date autoChangeDate;

    private Date autoChangeEndDate;

    private String autoStatus;

    private Date createdAt;

    private Date updatedAt;

    private String hasVideo;

    private String videos;

    private String videoRackStatus;

    private Double roomLength;

    private Double roomWidth;

    private String roomType;

    private String hasCloakroom;

    private String hasBayWindow;

    private String hasWindow;

    private String isWiredLoft;

    private String isWiredLongAndThin;

    private String isBadLighting;

    private String isPrivateWindow;

    private String isNearStreet;

    private String cleaningToolsTag;

    private String doorTag;

    private String floorTag;

    private String kitchenWareTag;

    private String isHouseStateReadonly;

    private String isPriceReadonly;

    private String isRoomInfoReadonly;

    private String isRoughRoom;

    private String roofTag;

    private String wallFloorTag;

    private String wallTag;

    private String windowTag;

    private String othersTearDownTag;

    private String toiletTag;

    private String hasPrivateKitchen;

    private String hasToiletInBathroom;

    private String toiletType;

    private Integer tempPriceYuan;

    private Integer revaluePriceYuan;

    private Integer planId;

    private Integer houseId;

    private Integer biRoomId;

    private String iszHouseId;

    private String iszRoomId;

    private String images;

    private String documents;

    private String autoNote;

    private String iszRoomNo;

    private String bedroomType;

    private String isVerify;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getSuiteId() {
        return suiteId;
    }

    public void setSuiteId(Integer suiteId) {
        this.suiteId = suiteId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber == null ? null : roomNumber.trim();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getDealerId() {
        return dealerId;
    }

    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    public Integer getPrivateId() {
        return privateId;
    }

    public void setPrivateId(Integer privateId) {
        this.privateId = privateId;
    }

    public Date getContractSignedDate() {
        return contractSignedDate;
    }

    public void setContractSignedDate(Date contractSignedDate) {
        this.contractSignedDate = contractSignedDate;
    }

    public Short getArea() {
        return area;
    }

    public void setArea(Short area) {
        this.area = area;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getMonthPrice() {
        return monthPrice;
    }

    public void setMonthPrice(Integer monthPrice) {
        this.monthPrice = monthPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getUnusableStatus() {
        return unusableStatus;
    }

    public void setUnusableStatus(String unusableStatus) {
        this.unusableStatus = unusableStatus == null ? null : unusableStatus.trim();
    }

    public String getSoldOutStatus() {
        return soldOutStatus;
    }

    public void setSoldOutStatus(String soldOutStatus) {
        this.soldOutStatus = soldOutStatus == null ? null : soldOutStatus.trim();
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType == null ? null : rentType.trim();
    }

    public String getFire() {
        return fire;
    }

    public void setFire(String fire) {
        this.fire = fire == null ? null : fire.trim();
    }

    public Byte getHasError() {
        return hasError;
    }

    public void setHasError(Byte hasError) {
        this.hasError = hasError;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face == null ? null : face.trim();
    }

    public Date getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(Date availableDate) {
        this.availableDate = availableDate;
    }

    public Date getRentBeginDate() {
        return rentBeginDate;
    }

    public void setRentBeginDate(Date rentBeginDate) {
        this.rentBeginDate = rentBeginDate;
    }

    public Date getRentEndDate() {
        return rentEndDate;
    }

    public void setRentEndDate(Date rentEndDate) {
        this.rentEndDate = rentEndDate;
    }

    public String getIsSeparatedRoom() {
        return isSeparatedRoom;
    }

    public void setIsSeparatedRoom(String isSeparatedRoom) {
        this.isSeparatedRoom = isSeparatedRoom == null ? null : isSeparatedRoom.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getDocuments() {
        return documents;
    }

    public void setDocuments(String documents) {
        this.documents = documents;
    }

    public String getAutoNote() {
        return autoNote;
    }

    public void setAutoNote(String autoNote) {
        this.autoNote = autoNote;
    }

    public String getIsAbs() {
        return isAbs;
    }

    public void setIsAbs(String isAbs) {
        this.isAbs = isAbs == null ? null : isAbs.trim();
    }

    public String getHasToilet() {
        return hasToilet;
    }

    public void setHasToilet(String hasToilet) {
        this.hasToilet = hasToilet == null ? null : hasToilet.trim();
    }

    public String getHasShower() {
        return hasShower;
    }

    public void setHasShower(String hasShower) {
        this.hasShower = hasShower == null ? null : hasShower.trim();
    }

    public String getHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(String hasBalcony) {
        this.hasBalcony = hasBalcony == null ? null : hasBalcony.trim();
    }

    public String getHasTv() {
        return hasTv;
    }

    public void setHasTv(String hasTv) {
        this.hasTv = hasTv == null ? null : hasTv.trim();
    }

    public String getHasTerrace() {
        return hasTerrace;
    }

    public void setHasTerrace(String hasTerrace) {
        this.hasTerrace = hasTerrace == null ? null : hasTerrace.trim();
    }

    public String getHasStoreroom() {
        return hasStoreroom;
    }

    public void setHasStoreroom(String hasStoreroom) {
        this.hasStoreroom = hasStoreroom == null ? null : hasStoreroom.trim();
    }

    public BigDecimal getBayWindowArea() {
        return bayWindowArea;
    }

    public void setBayWindowArea(BigDecimal bayWindowArea) {
        this.bayWindowArea = bayWindowArea;
    }

    public String getAllowQuarterly() {
        return allowQuarterly;
    }

    public void setAllowQuarterly(String allowQuarterly) {
        this.allowQuarterly = allowQuarterly == null ? null : allowQuarterly.trim();
    }

    public BigDecimal getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(BigDecimal livingArea) {
        this.livingArea = livingArea;
    }

    public BigDecimal getToiletArea() {
        return toiletArea;
    }

    public void setToiletArea(BigDecimal toiletArea) {
        this.toiletArea = toiletArea;
    }

    public BigDecimal getBalconyArea() {
        return balconyArea;
    }

    public void setBalconyArea(BigDecimal balconyArea) {
        this.balconyArea = balconyArea;
    }

    public BigDecimal getTerraceArea() {
        return terraceArea;
    }

    public void setTerraceArea(BigDecimal terraceArea) {
        this.terraceArea = terraceArea;
    }

    public BigDecimal getStoreroomArea() {
        return storeroomArea;
    }

    public void setStoreroomArea(BigDecimal storeroomArea) {
        this.storeroomArea = storeroomArea;
    }

    public String getHasImage() {
        return hasImage;
    }

    public void setHasImage(String hasImage) {
        this.hasImage = hasImage == null ? null : hasImage.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    public String getLighting() {
        return lighting;
    }

    public void setLighting(String lighting) {
        this.lighting = lighting == null ? null : lighting.trim();
    }

    public String getIsSmallWindow() {
        return isSmallWindow;
    }

    public void setIsSmallWindow(String isSmallWindow) {
        this.isSmallWindow = isSmallWindow == null ? null : isSmallWindow.trim();
    }

    public String getHasCurtains() {
        return hasCurtains;
    }

    public void setHasCurtains(String hasCurtains) {
        this.hasCurtains = hasCurtains == null ? null : hasCurtains.trim();
    }

    public String getIsRentFurniture() {
        return isRentFurniture;
    }

    public void setIsRentFurniture(String isRentFurniture) {
        this.isRentFurniture = isRentFurniture == null ? null : isRentFurniture.trim();
    }

    public String getIsLeaveFurniture() {
        return isLeaveFurniture;
    }

    public void setIsLeaveFurniture(String isLeaveFurniture) {
        this.isLeaveFurniture = isLeaveFurniture == null ? null : isLeaveFurniture.trim();
    }

    public String getIsWallWhite() {
        return isWallWhite;
    }

    public void setIsWallWhite(String isWallWhite) {
        this.isWallWhite = isWallWhite == null ? null : isWallWhite.trim();
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape == null ? null : shape.trim();
    }

    public String getShapeNote() {
        return shapeNote;
    }

    public void setShapeNote(String shapeNote) {
        this.shapeNote = shapeNote == null ? null : shapeNote.trim();
    }

    public String getAddressText() {
        return addressText;
    }

    public void setAddressText(String addressText) {
        this.addressText = addressText == null ? null : addressText.trim();
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText == null ? null : searchText.trim();
    }

    public Date getDisableExpireDate() {
        return disableExpireDate;
    }

    public void setDisableExpireDate(Date disableExpireDate) {
        this.disableExpireDate = disableExpireDate;
    }

    public Integer getDisableBy() {
        return disableBy;
    }

    public void setDisableBy(Integer disableBy) {
        this.disableBy = disableBy;
    }

    public String getDisableNote() {
        return disableNote;
    }

    public void setDisableNote(String disableNote) {
        this.disableNote = disableNote == null ? null : disableNote.trim();
    }

    public Byte getImageNumber() {
        return imageNumber;
    }

    public void setImageNumber(Byte imageNumber) {
        this.imageNumber = imageNumber;
    }

    public String getIsPhotographerUploaded() {
        return isPhotographerUploaded;
    }

    public void setIsPhotographerUploaded(String isPhotographerUploaded) {
        this.isPhotographerUploaded = isPhotographerUploaded == null ? null : isPhotographerUploaded.trim();
    }

    public String getAdvantages() {
        return advantages;
    }

    public void setAdvantages(String advantages) {
        this.advantages = advantages == null ? null : advantages.trim();
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Date getAutoChangeDate() {
        return autoChangeDate;
    }

    public void setAutoChangeDate(Date autoChangeDate) {
        this.autoChangeDate = autoChangeDate;
    }

    public Date getAutoChangeEndDate() {
        return autoChangeEndDate;
    }

    public void setAutoChangeEndDate(Date autoChangeEndDate) {
        this.autoChangeEndDate = autoChangeEndDate;
    }

    public String getAutoStatus() {
        return autoStatus;
    }

    public void setAutoStatus(String autoStatus) {
        this.autoStatus = autoStatus == null ? null : autoStatus.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(String hasVideo) {
        this.hasVideo = hasVideo == null ? null : hasVideo.trim();
    }

    public String getVideos() {
        return videos;
    }

    public void setVideos(String videos) {
        this.videos = videos == null ? null : videos.trim();
    }

    public String getVideoRackStatus() {
        return videoRackStatus;
    }

    public void setVideoRackStatus(String videoRackStatus) {
        this.videoRackStatus = videoRackStatus == null ? null : videoRackStatus.trim();
    }

    public Double getRoomLength() {
        return roomLength;
    }

    public void setRoomLength(Double roomLength) {
        this.roomLength = roomLength;
    }

    public Double getRoomWidth() {
        return roomWidth;
    }

    public void setRoomWidth(Double roomWidth) {
        this.roomWidth = roomWidth;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    public String getHasCloakroom() {
        return hasCloakroom;
    }

    public void setHasCloakroom(String hasCloakroom) {
        this.hasCloakroom = hasCloakroom == null ? null : hasCloakroom.trim();
    }

    public String getHasBayWindow() {
        return hasBayWindow;
    }

    public void setHasBayWindow(String hasBayWindow) {
        this.hasBayWindow = hasBayWindow == null ? null : hasBayWindow.trim();
    }

    public String getHasWindow() {
        return hasWindow;
    }

    public void setHasWindow(String hasWindow) {
        this.hasWindow = hasWindow == null ? null : hasWindow.trim();
    }

    public String getIsWiredLoft() {
        return isWiredLoft;
    }

    public void setIsWiredLoft(String isWiredLoft) {
        this.isWiredLoft = isWiredLoft == null ? null : isWiredLoft.trim();
    }

    public String getIsWiredLongAndThin() {
        return isWiredLongAndThin;
    }

    public void setIsWiredLongAndThin(String isWiredLongAndThin) {
        this.isWiredLongAndThin = isWiredLongAndThin == null ? null : isWiredLongAndThin.trim();
    }

    public String getIsBadLighting() {
        return isBadLighting;
    }

    public void setIsBadLighting(String isBadLighting) {
        this.isBadLighting = isBadLighting == null ? null : isBadLighting.trim();
    }

    public String getIsPrivateWindow() {
        return isPrivateWindow;
    }

    public void setIsPrivateWindow(String isPrivateWindow) {
        this.isPrivateWindow = isPrivateWindow == null ? null : isPrivateWindow.trim();
    }

    public String getIsNearStreet() {
        return isNearStreet;
    }

    public void setIsNearStreet(String isNearStreet) {
        this.isNearStreet = isNearStreet == null ? null : isNearStreet.trim();
    }

    public String getCleaningToolsTag() {
        return cleaningToolsTag;
    }

    public void setCleaningToolsTag(String cleaningToolsTag) {
        this.cleaningToolsTag = cleaningToolsTag == null ? null : cleaningToolsTag.trim();
    }

    public String getDoorTag() {
        return doorTag;
    }

    public void setDoorTag(String doorTag) {
        this.doorTag = doorTag == null ? null : doorTag.trim();
    }

    public String getFloorTag() {
        return floorTag;
    }

    public void setFloorTag(String floorTag) {
        this.floorTag = floorTag == null ? null : floorTag.trim();
    }

    public String getKitchenWareTag() {
        return kitchenWareTag;
    }

    public void setKitchenWareTag(String kitchenWareTag) {
        this.kitchenWareTag = kitchenWareTag == null ? null : kitchenWareTag.trim();
    }

    public String getIsHouseStateReadonly() {
        return isHouseStateReadonly;
    }

    public void setIsHouseStateReadonly(String isHouseStateReadonly) {
        this.isHouseStateReadonly = isHouseStateReadonly == null ? null : isHouseStateReadonly.trim();
    }

    public String getIsPriceReadonly() {
        return isPriceReadonly;
    }

    public void setIsPriceReadonly(String isPriceReadonly) {
        this.isPriceReadonly = isPriceReadonly == null ? null : isPriceReadonly.trim();
    }

    public String getIsRoomInfoReadonly() {
        return isRoomInfoReadonly;
    }

    public void setIsRoomInfoReadonly(String isRoomInfoReadonly) {
        this.isRoomInfoReadonly = isRoomInfoReadonly == null ? null : isRoomInfoReadonly.trim();
    }

    public String getIsRoughRoom() {
        return isRoughRoom;
    }

    public void setIsRoughRoom(String isRoughRoom) {
        this.isRoughRoom = isRoughRoom == null ? null : isRoughRoom.trim();
    }

    public String getRoofTag() {
        return roofTag;
    }

    public void setRoofTag(String roofTag) {
        this.roofTag = roofTag == null ? null : roofTag.trim();
    }

    public String getWallFloorTag() {
        return wallFloorTag;
    }

    public void setWallFloorTag(String wallFloorTag) {
        this.wallFloorTag = wallFloorTag == null ? null : wallFloorTag.trim();
    }

    public String getWallTag() {
        return wallTag;
    }

    public void setWallTag(String wallTag) {
        this.wallTag = wallTag == null ? null : wallTag.trim();
    }

    public String getWindowTag() {
        return windowTag;
    }

    public void setWindowTag(String windowTag) {
        this.windowTag = windowTag == null ? null : windowTag.trim();
    }

    public String getOthersTearDownTag() {
        return othersTearDownTag;
    }

    public void setOthersTearDownTag(String othersTearDownTag) {
        this.othersTearDownTag = othersTearDownTag == null ? null : othersTearDownTag.trim();
    }

    public String getToiletTag() {
        return toiletTag;
    }

    public void setToiletTag(String toiletTag) {
        this.toiletTag = toiletTag == null ? null : toiletTag.trim();
    }

    public String getHasPrivateKitchen() {
        return hasPrivateKitchen;
    }

    public void setHasPrivateKitchen(String hasPrivateKitchen) {
        this.hasPrivateKitchen = hasPrivateKitchen == null ? null : hasPrivateKitchen.trim();
    }

    public String getHasToiletInBathroom() {
        return hasToiletInBathroom;
    }

    public void setHasToiletInBathroom(String hasToiletInBathroom) {
        this.hasToiletInBathroom = hasToiletInBathroom == null ? null : hasToiletInBathroom.trim();
    }

    public String getToiletType() {
        return toiletType;
    }

    public void setToiletType(String toiletType) {
        this.toiletType = toiletType == null ? null : toiletType.trim();
    }

    public Integer getTempPriceYuan() {
        return tempPriceYuan;
    }

    public void setTempPriceYuan(Integer tempPriceYuan) {
        this.tempPriceYuan = tempPriceYuan;
    }

    public Integer getRevaluePriceYuan() {
        return revaluePriceYuan;
    }

    public void setRevaluePriceYuan(Integer revaluePriceYuan) {
        this.revaluePriceYuan = revaluePriceYuan;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getBiRoomId() {
        return biRoomId;
    }

    public void setBiRoomId(Integer biRoomId) {
        this.biRoomId = biRoomId;
    }

    public String getIszHouseId() {
        return iszHouseId;
    }

    public void setIszHouseId(String iszHouseId) {
        this.iszHouseId = iszHouseId == null ? null : iszHouseId.trim();
    }

    public String getIszRoomId() {
        return iszRoomId;
    }

    public void setIszRoomId(String iszRoomId) {
        this.iszRoomId = iszRoomId == null ? null : iszRoomId.trim();
    }

    public String getIszRoomNo() {
        return iszRoomNo;
    }

    public void setIszRoomNo(String iszRoomNo) {
        this.iszRoomNo = iszRoomNo == null ? null : iszRoomNo.trim();
    }

    public String getBedroomType() {
        return bedroomType;
    }

    public void setBedroomType(String bedroomType) {
        this.bedroomType = bedroomType == null ? null : bedroomType.trim();
    }

    public String getIsVerify() {
        return isVerify;
    }

    public void setIsVerify(String isVerify) {
        this.isVerify = isVerify == null ? null : isVerify.trim();
    }
}