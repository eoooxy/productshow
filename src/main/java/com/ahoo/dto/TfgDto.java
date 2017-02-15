package com.ahoo.dto;

import com.ahoo.entity.TfglxmsEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/2/11 0011
 * Time: 18:24
 */
public class TfgDto {

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

    private List<Tfg> tfgList;

    private TfglxmsEntity desEntity;

    private List<String> strings;

    private List<String> nStrings;

    public List<String> getnStrings() {
        return nStrings;
    }

    public void setnStrings(List<String> nStrings) {
        this.nStrings = nStrings;
    }

    private int pageNumber;

    private String proType;

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public TfglxmsEntity getDesEntity() {
        return desEntity;
    }

    public void setDesEntity(TfglxmsEntity desEntity) {
        this.desEntity = desEntity;
    }

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
        this.productNorms = productNorms;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductMaterial() {
        return productMaterial;
    }

    public void setProductMaterial(String productMaterial) {
        this.productMaterial = productMaterial;
    }

    public String getProductWenli() {
        return productWenli;
    }

    public void setProductWenli(String productWenli) {
        this.productWenli = productWenli;
    }

    public String getIsfangfu() {
        return isfangfu;
    }

    public void setIsfangfu(String isfangfu) {
        this.isfangfu = isfangfu;
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public String getProductDiameter() {
        return productDiameter;
    }

    public void setProductDiameter(String productDiameter) {
        this.productDiameter = productDiameter;
    }

    public String getCuPly() {
        return cuPly;
    }

    public void setCuPly(String cuPly) {
        this.cuPly = cuPly;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Integer getFkRecId() {
        return fkRecId;
    }

    public void setFkRecId(Integer fkRecId) {
        this.fkRecId = fkRecId;
    }

    public List<Tfg> getTfgList() {
        return tfgList;
    }

    public void setTfgList(List<Tfg> tfgList) {
        this.tfgList = tfgList;
    }

    public static class Tfg implements Serializable {
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
            this.productNorms = productNorms;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductMaterial() {
            return productMaterial;
        }

        public void setProductMaterial(String productMaterial) {
            this.productMaterial = productMaterial;
        }

        public String getProductWenli() {
            return productWenli;
        }

        public void setProductWenli(String productWenli) {
            this.productWenli = productWenli;
        }

        public String getIsfangfu() {
            return isfangfu;
        }

        public void setIsfangfu(String isfangfu) {
            this.isfangfu = isfangfu;
        }

        public String getProductSize() {
            return productSize;
        }

        public void setProductSize(String productSize) {
            this.productSize = productSize;
        }

        public String getProductDiameter() {
            return productDiameter;
        }

        public void setProductDiameter(String productDiameter) {
            this.productDiameter = productDiameter;
        }

        public String getCuPly() {
            return cuPly;
        }

        public void setCuPly(String cuPly) {
            this.cuPly = cuPly;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public Integer getFkRecId() {
            return fkRecId;
        }

        public void setFkRecId(Integer fkRecId) {
            this.fkRecId = fkRecId;
        }
    }
}
