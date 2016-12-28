package com.ahoo.dto;

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

    private String remark;

    private Integer fkChildRecId;

    private String remark2;

    private String remark3;

    private List<ProductParameter> productParameterList;

    public List<ProductParameter> getProductParameterList() {
        return productParameterList;
    }

    public void setProductParameterList(List<ProductParameter> productParameterList) {
        this.productParameterList = productParameterList;
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

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }

    public  static class ProductParameter implements Serializable {
        private Integer recId;

        private String conductorA;

        private String conductorB;

        private String modelNumber;

        private String modelType;

        private String powerType;

        private String modelClip;

        private String remark;

        private Integer fkChildRecId;

        private String remark2;

        private String remark3;

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

        public String getRemark2() {
            return remark2;
        }

        public void setRemark2(String remark2) {
            this.remark2 = remark2;
        }

        public String getRemark3() {
            return remark3;
        }

        public void setRemark3(String remark3) {
            this.remark3 = remark3;
        }
    }
}