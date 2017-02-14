package com.ahoo.dto;

import com.ahoo.entity.LzjdlxmsEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/2/11 0011
 * Time: 18:21
 */
public class LzjdlxDto {

    private Integer recId;

    private String productType;

    private String productUrl;

    private String remark;

    private List<Lzjdlx> lzjdlxList;

    private LzjdlxmsEntity desEntity;

    public LzjdlxmsEntity getDesEntity() {
        return desEntity;
    }

    public void setDesEntity(LzjdlxmsEntity desEntity) {
        this.desEntity = desEntity;
    }

    public List<Lzjdlx> getLzjdlxList() {
        return lzjdlxList;
    }

    public void setLzjdlxList(List<Lzjdlx> lzjdlxList) {
        this.lzjdlxList = lzjdlxList;
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

    public static class Lzjdlx implements Serializable {

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
