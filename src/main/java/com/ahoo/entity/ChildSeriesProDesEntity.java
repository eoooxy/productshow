package com.ahoo.entity;

public class ChildSeriesProDesEntity {
    private Integer recId;

    private String productChildType;

    private String productTitle;

    private String productDes;

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

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle == null ? null : productTitle.trim();
    }

    public String getProductDes() {
        return productDes;
    }

    public void setProductDes(String productDes) {
        this.productDes = productDes == null ? null : productDes.trim();
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