package com.ahoo.dto;

import com.ahoo.entity.MainSeriesProDesEntity;

import java.io.Serializable;
import java.util.List;

public class MainSeriesProductDto {
    private Integer recId;

    private String productMainType;

    private String productMainUrl;

    private String productTitle;

    private String productDes;

    private String remark;

    private List<String> strings;

    private MainSeriesProDesEntity desEntity;

    private List<MainSeriesProduct> mainSeriesProductList;

    private Integer totalPage;

    private String mark;

    private Integer recIdDes;

    public Integer getRecIdDes() {
        return recIdDes;
    }

    public void setRecIdDes(Integer recIdDes) {
        this.recIdDes = recIdDes;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductDes() {
        return productDes;
    }

    public void setProductDes(String productDes) {
        this.productDes = productDes;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

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