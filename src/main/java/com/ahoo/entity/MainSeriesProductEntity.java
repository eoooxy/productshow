package com.ahoo.entity;

public class MainSeriesProductEntity {
    private Integer recId;

    private String productMainType;

    private String productMainUrl;

    private String remark;

    private String remark2;

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

    public String getProductMainUrl() {
        return productMainUrl;
    }

    public void setProductMainUrl(String productMainUrl) {
        this.productMainUrl = productMainUrl == null ? null : productMainUrl.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }
}