package com.ahoo.dto;

import com.ahoo.entity.ChildSeriesProDesEntity;

import java.io.Serializable;
import java.util.List;

public class ChildSeriesProductDto {

    private Integer recId;

    private String productChildType;

    private String productChildUrl;

    private String remark;

    private Integer fkRecId;

    private ChildSeriesProDesEntity desEntity;

    private List<ChildSeriesProduct> childSeriesProductList;

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

    public String getProductChildType() {
        return productChildType;
    }

    public void setProductChildType(String productChildType) {
        this.productChildType = productChildType;
    }

    public String getProductChildUrl() {
        return productChildUrl;
    }

    public void setProductChildUrl(String productChildUrl) {
        this.productChildUrl = productChildUrl;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getFkRecId() {
        return fkRecId;
    }

    public void setFkRecId(Integer fkRecId) {
        this.fkRecId = fkRecId;
    }

    public List<ChildSeriesProduct> getChildSeriesProductList() {
        return childSeriesProductList;
    }

    public void setChildSeriesProductList(List<ChildSeriesProduct> childSeriesProductList) {
        this.childSeriesProductList = childSeriesProductList;
    }

    public static class ChildSeriesProduct implements Serializable {
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
            this.productChildType = productChildType;
        }

        public String getProductChildUrl() {
            return productChildUrl;
        }

        public void setProductChildUrl(String productChildUrl) {
            this.productChildUrl = productChildUrl;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public Integer getFkRecId() {
            return fkRecId;
        }

        public void setFkRecId(Integer fkRecId) {
            this.fkRecId = fkRecId;
        }
    }
}