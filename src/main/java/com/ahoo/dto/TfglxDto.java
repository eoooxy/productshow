package com.ahoo.dto;

import com.ahoo.entity.TfglxmsEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/2/11 0011
 * Time: 18:30
 */
public class TfglxDto {

    private Integer recId;

    private String productType;

    private String productUrl;

    private String remark;

    private List<Tfglx> tfglxList;

    private TfglxmsEntity desEntity;

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

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<Tfglx> getTfglxList() {
        return tfglxList;
    }

    public void setTfglxList(List<Tfglx> tfglxList) {
        this.tfglxList = tfglxList;
    }

    public static class Tfglx implements Serializable {
        private Integer recId;

        private String productType;

        private String productUrl;

        private String remark;

        public Integer getRecId() {
            return recId;
        }

        public void setRecId(Integer recId) {
            this.recId = recId;
        }

        public String getProductType() {
            return productType;
        }

        public void setProductType(String productType) {
            this.productType = productType;
        }

        public String getProductUrl() {
            return productUrl;
        }

        public void setProductUrl(String productUrl) {
            this.productUrl = productUrl;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }
}
