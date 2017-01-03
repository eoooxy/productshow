package com.ahoo.entity;

public class ProductParameterEntity {
    private Integer recId;

    private String conductorA;

    private String conductorB;

    private String modelNumber;

    private String modelType;

    private String powerType;

    private String modelClip;

    private String parameter1;

    private String parameter2;

    private String remark;

    private Integer fkChildRecId;

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public String getConductorA() {
        return conductorA;
    }

    public void setConductorA(String conductorA) {
        this.conductorA = conductorA == null ? null : conductorA.trim();
    }

    public String getConductorB() {
        return conductorB;
    }

    public void setConductorB(String conductorB) {
        this.conductorB = conductorB == null ? null : conductorB.trim();
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber == null ? null : modelNumber.trim();
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType == null ? null : modelType.trim();
    }

    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType == null ? null : powerType.trim();
    }

    public String getModelClip() {
        return modelClip;
    }

    public void setModelClip(String modelClip) {
        this.modelClip = modelClip == null ? null : modelClip.trim();
    }

    public String getParameter1() {
        return parameter1;
    }

    public void setParameter1(String parameter1) {
        this.parameter1 = parameter1 == null ? null : parameter1.trim();
    }

    public String getParameter2() {
        return parameter2;
    }

    public void setParameter2(String parameter2) {
        this.parameter2 = parameter2 == null ? null : parameter2.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getFkChildRecId() {
        return fkChildRecId;
    }

    public void setFkChildRecId(Integer fkChildRecId) {
        this.fkChildRecId = fkChildRecId;
    }
}