package com.ahoo.dto;

import com.ahoo.entity.MainSeriesProDesEntity;

import java.io.Serializable;
import java.util.List;

public class MainSeriesProductDto {
    private Integer recId;

    private String productMainType;

    private String productMainUrl;

    private String remark;

    private MainSeriesProDesEntity desEntity;

    private List<MainSeriesProduct> mainSeriesProductList;


    public MainSeriesProDesEntity getDesEntity() {
        return desEntity;
    }

    public void setDesEntity(MainSeriesProDesEntity desEntity) {
        this.desEntity = desEntity;
    }

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
        this.productMainType = productMainType;
    }

    public String getProductMainUrl() {
        return productMainUrl;
    }

    public void setProductMainUrl(String productMainUrl) {
        this.productMainUrl = productMainUrl;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<MainSeriesProduct> getMainSeriesProductList() {
        return mainSeriesProductList;
    }

    public void setMainSeriesProductList(List<MainSeriesProduct> mainSeriesProductList) {
        this.mainSeriesProductList = mainSeriesProductList;
    }

    public static class MainSeriesProduct implements Serializable {

        private Integer recId;

        private String productMainType;

        private String productMainUrl;

        private String remark;

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
            this.productMainType = productMainType;
        }

        public String getProductMainUrl() {
            return productMainUrl;
        }

        public void setProductMainUrl(String productMainUrl) {
            this.productMainUrl = productMainUrl;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }
}