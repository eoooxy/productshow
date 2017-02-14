package com.ahoo.entity;

public class LzjdEntity {
    private Integer recId;

    private String productNormsA;

    private String productNormsB;

    private String model;

    private String tagline;

    private String ph;

    private String shape;

    private String remark;

    private Integer fkRecId;

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public String getProductNormsA() {
        return productNormsA;
    }

    public void setProductNormsA(String productNormsA) {
        this.productNormsA = productNormsA == null ? null : productNormsA.trim();
    }

    public String getProductNormsB() {
        return productNormsB;
    }

    public void setProductNormsB(String productNormsB) {
        this.productNormsB = productNormsB == null ? null : productNormsB.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline == null ? null : tagline.trim();
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph == null ? null : ph.trim();
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape == null ? null : shape.trim();
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