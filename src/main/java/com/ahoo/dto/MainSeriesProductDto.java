package com.ahoo.dto;

import java.io.Serializable;
import java.util.List;

public class MainSeriesProductDto {
    private Integer recId;

    private String productMainType;

    private String productPicUrl;

    private String productMainTitle;

    private String productMainDes;

    public List<MainSeriesProduct> mainSeriesProductList;

    public List<MainSeriesProduct> getMainSeriesProductList() {
        return mainSeriesProductList;
    }

    public void setMainSeriesProductList(List<MainSeriesProduct> mainSeriesProductList) {
        this.mainSeriesProductList = mainSeriesProductList;
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
        this.productMainType = productMainType == null ? null : productMainType.trim();
    }

    public String getProductPicUrl() {
        return productPicUrl;
    }

    public void setProductPicUrl(String productPicUrl) {
        this.productPicUrl = productPicUrl == null ? null : productPicUrl.trim();
    }

    public String getProductMainTitle() {
        return productMainTitle;
    }

    public void setProductMainTitle(String productMainTitle) {
        this.productMainTitle = productMainTitle == null ? null : productMainTitle.trim();
    }

    public String getProductMainDes() {
        return productMainDes;
    }

    public void setProductMainDes(String productMainDes) {
        this.productMainDes = productMainDes == null ? null : productMainDes.trim();
    }

    public static class MainSeriesProduct implements Serializable {

        private Integer recId;

        private String productMainType;

        private String productPicUrl;

        private String productMainTitle;

        private String productMainDes;

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

        public String getProductPicUrl() {
            return productPicUrl;
        }

        public void setProductPicUrl(String productPicUrl) {
            this.productPicUrl = productPicUrl;
        }

        public String getProductMainTitle() {
            return productMainTitle;
        }

        public void setProductMainTitle(String productMainTitle) {
            this.productMainTitle = productMainTitle;
        }

        public String getProductMainDes() {
            return productMainDes;
        }

        public void setProductMainDes(String productMainDes) {
            this.productMainDes = productMainDes;
        }
    }
}