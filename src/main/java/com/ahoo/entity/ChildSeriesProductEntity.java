package com.ahoo.entity;

public class ChildSeriesProductEntity {
    private Integer recId;

    private String productChildType;

    private String productChildUrl;

    private String remark;

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

    public String getProductChildUrl() {
        return productChildUrl;
    }

    public void setProductChildUrl(String productChildUrl) {
        this.productChildUrl = productChildUrl == null ? null : productChildUrl.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getFkRecId() {
        return fkRecId;
    }

    public void setFkRecId(Integer fkRecId) {
        this.fkRecId = fkRecId;
    }
}