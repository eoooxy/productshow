package com.ahoo.entity;

public class ChildSeriesProductEntity {
    private Integer recId;

    private String productChildType;

    private String productChildPicUrl;

    private String productChildTitle;

    private String productChildDes;

    private Integer fkRecId;

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public String getProductChildType() {
        return productChildType;
    }

    public void setProductChildType(String productChildType) {
        this.productChildType = productChildType == null ? null : productChildType.trim();
    }

    public String getProductChildPicUrl() {
        return productChildPicUrl;
    }

    public void setProductChildPicUrl(String productChildPicUrl) {
        this.productChildPicUrl = productChildPicUrl == null ? null : productChildPicUrl.trim();
    }

    public String getProductChildTitle() {
        return productChildTitle;
    }

    public void setProductChildTitle(String productChildTitle) {
        this.productChildTitle = productChildTitle == null ? null : productChildTitle.trim();
    }

    public String getProductChildDes() {
        return productChildDes;
    }

    public void setProductChildDes(String productChildDes) {
        this.productChildDes = productChildDes == null ? null : productChildDes.trim();
    }

    public Integer getFkRecId() {
        return fkRecId;
    }

    public void setFkRecId(Integer fkRecId) {
        this.fkRecId = fkRecId;
    }
}