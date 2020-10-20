package com.cube.domain;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {
    private Integer id;

    private String saleProduct;

    private String version;

    private String decorationStatus;

    private String rentModel;

    private Byte houseStatePlanType;

    private Byte status;

    private Integer creator;

    private Date deletedAt;

    private Date createdAt;

    private Date updatedAt;

    private String productDes;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSaleProduct() {
        return saleProduct;
    }

    public void setSaleProduct(String saleProduct) {
        this.saleProduct = saleProduct == null ? null : saleProduct.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getDecorationStatus() {
        return decorationStatus;
    }

    public void setDecorationStatus(String decorationStatus) {
        this.decorationStatus = decorationStatus == null ? null : decorationStatus.trim();
    }

    public String getRentModel() {
        return rentModel;
    }

    public void setRentModel(String rentModel) {
        this.rentModel = rentModel == null ? null : rentModel.trim();
    }

    public Byte getHouseStatePlanType() {
        return houseStatePlanType;
    }

    public void setHouseStatePlanType(Byte houseStatePlanType) {
        this.houseStatePlanType = houseStatePlanType;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
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

    public String getProductDes() {
        return productDes;
    }

    public void setProductDes(String productDes) {
        this.productDes = productDes == null ? null : productDes.trim();
    }
}