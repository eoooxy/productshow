package com.ahoo.entity;

public class MainSeriesProductEntity {
    private Integer recId;

    private String productMainType;

    private String productPicUrl;

    private String productMainTitle;

    private String productMainDes;

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public String getProductMainType() {
        return productMainType;
    }

    public void setProductMainType(String productMainType) {
        this.productMainType = productMainType == null ? null : productMainType.trim();
    }

    public String getProductPicUrl() {
        return productPicUrl;
    }

    public void setProductPicUrl(String productPicUrl) {
        this.productPicUrl = productPicUrl == null ? null : productPicUrl.trim();
    }

    public String getProductMainTitle() {
        return productMainTitle;
    }

    public void setProductMainTitle(String productMainTitle) {
        this.productMainTitle = productMainTitle == null ? null : productMainTitle.trim();
    }

    public String getProductMainDes() {
        return productMainDes;
    }

    public void setProductMainDes(String productMainDes) {
        this.productMainDes = productMainDes == null ? null : productMainDes.trim();
    }
}