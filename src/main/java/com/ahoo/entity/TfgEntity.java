package com.ahoo.entity;

public class TfgEntity {
    private Integer recId;

    private String productNorms;

    private String productName;

    private String productMaterial;

    private String productWenli;

    private String isfangfu;

    private String productSize;

    private String productDiameter;

    private String cuPly;

    private String weight;

    private Integer fkRecId;

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public String getProductNorms() {
        return productNorms;
    }

    public void setProductNorms(String productNorms) {
        this.productNorms = productNorms == null ? null : productNorms.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductMaterial() {
        return productMaterial;
    }

    public void setProductMaterial(String productMaterial) {
        this.productMaterial = productMaterial == null ? null : productMaterial.trim();
    }

    public String getProductWenli() {
        return productWenli;
    }

    public void setProductWenli(String productWenli) {
        this.productWenli = productWenli == null ? null : productWenli.trim();
    }

    public String getIsfangfu() {
        return isfangfu;
    }

    public void setIsfangfu(String isfangfu) {
        this.isfangfu = isfangfu == null ? null : isfangfu.trim();
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize == null ? null : productSize.trim();
    }

    public String getProductDiameter() {
        return productDiameter;
    }

    public void setProductDiameter(String productDiameter) {
        this.productDiameter = productDiameter == null ? null : productDiameter.trim();
    }

    public String getCuPly() {
        return cuPly;
    }

    public void setCuPly(String cuPly) {
        this.cuPly = cuPly == null ? null : cuPly.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public Integer getFkRecId() {
        return fkRecId;
    }

    public void setFkRecId(Integer fkRecId) {
        this.fkRecId = fkRecId;
    }
}