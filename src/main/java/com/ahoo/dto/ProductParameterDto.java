package com.ahoo.dto;

import com.ahoo.entity.ChildSeriesProDesEntity;

import java.io.Serializable;
import java.util.List;

public class ProductParameterDto {
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

    private ChildSeriesProDesEntity desEntity;

    private List<ProductParameter> productParameterList;

    //private

    public ChildSeriesProDesEntity getDesEntity() {
        return desEntity;
    }

    public void setDesEntity(ChildSeriesProDesEntity desEntity) {
        this.desEntity = desEntity;
    }

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
        this.conductorA = conductorA;
    }

    public String getConductorB() {
        return conductorB;
    }

    public void setConductorB(String conductorB) {
        this.conductorB = conductorB;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

    public String getModelClip() {
        return modelClip;
    }

    public void setModelClip(String modelClip) {
        this.modelClip = modelClip;
    }

    public String getParameter1() {
        return parameter1;
    }

    public void setParameter1(String parameter1) {
        this.parameter1 = parameter1;
    }

    public String getParameter2() {
        return parameter2;
    }

    public void setParameter2(String parameter2) {
        this.parameter2 = parameter2;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getFkChildRecId() {
        return fkChildRecId;
    }

    public void setFkChildRecId(Integer fkChildRecId) {
        this.fkChildRecId = fkChildRecId;
    }

    public List<ProductParameter> getProductParameterList() {
        return productParameterList;
    }

    public void setProductParameterList(List<ProductParameter> productParameterList) {
        this.productParameterList = productParameterList;
    }

    public static class ProductParameter implements Serializable {
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
            this.conductorA = conductorA;
        }

        public String getConductorB() {
            return conductorB;
        }

        public void setConductorB(String conductorB) {
            this.conductorB = conductorB;
        }

        public String getModelNumber() {
            return modelNumber;
        }

        public void setModelNumber(String modelNumber) {
            this.modelNumber = modelNumber;
        }

        public String getModelType() {
            return modelType;
        }

        public void setModelType(String modelType) {
            this.modelType = modelType;
        }

        public String getPowerType() {
            return powerType;
        }

        public void setPowerType(String powerType) {
            this.powerType = powerType;
        }

        public String getModelClip() {
            return modelClip;
        }

        public void setModelClip(String modelClip) {
            this.modelClip = modelClip;
        }

        public String getParameter1() {
            return parameter1;
        }

        public void setParameter1(String parameter1) {
            this.parameter1 = parameter1;
        }

        public String getParameter2() {
            return parameter2;
        }

        public void setParameter2(String parameter2) {
            this.parameter2 = parameter2;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public Integer getFkChildRecId() {
            return fkChildRecId;
        }

        public void setFkChildRecId(Integer fkChildRecId) {
            this.fkChildRecId = fkChildRecId;
        }
    }

    public class Query {
    }
}