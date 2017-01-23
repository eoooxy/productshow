package com.ahoo.dto;

import com.ahoo.entity.MainSeriesProDesEntity;

import java.io.Serializable;
import java.util.List;

public class ChildSeriesProductDto {

    private Integer recId;

    private String productChildType;

    private String productChildUrl;

    private String productTitle;

    private String productDes;

    private String remark;

    private Integer fkRecId;

    private MainSeriesProDesEntity desEntity;

    private List<ChildSeriesProduct> childSeriesProductList;

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