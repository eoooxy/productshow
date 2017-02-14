package com.ahoo.dto;

import com.ahoo.entity.LzjdlxmsEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/2/11 0011
 * Time: 18:15
 */
public class LzjdDto {

    private Integer recId;

    private String productNormsA;

    private String productNormsB;

    private String model;

    private String tagline;

    private String ph;

    private String shape;

    private String remark;

    private Integer fkRecId;

    private List<Lzjd> lzjdList;

    private LzjdlxmsEntity desEntity;

    private List<String> strings;

    private int pageNumber;

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

    public LzjdlxmsEntity getDesEntity() {
        return desEntity;
    }

    public void setDesEntity(LzjdlxmsEntity desEntity) {
        this.desEntity = desEntity;
    }

    public List<Lzjd> getLzjdList() {
        return lzjdList;
    }

    public void setLzjdList(List<Lzjd> lzjdList) {
        this.lzjdList = lzjdList;
    }

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public String getProductNormsA() {
        return productNormsA;
    }

    public void setProductNormsA(String productNormsA) {
        this.productNormsA = productNormsA;
    }

    public String getProductNormsB() {
        return productNormsB;
    }

    public void setProductNormsB(String productNormsB) {
        this.productNormsB = productNormsB;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
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

    public static class Lzjd implements Serializable {

        private Integer recId;

        private String productNormsA;

        private String productNormsB;

        private String model;

        private String tagline;

        private String ph;

        private String shape;

        private String remark;

        private Integer fkRecId;

        public Integer getRecId() {
            return recId;
        }

        public void setRecId(Integer recId) {
            this.recId = recId;
        }

        public String getProductNormsA() {
            return productNormsA;
        }

        public void setProductNormsA(String productNormsA) {
            this.productNormsA = productNormsA;
        }

        public String getProductNormsB() {
            return productNormsB;
        }

        public void setProductNormsB(String productNormsB) {
            this.productNormsB = productNormsB;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getTagline() {
            return tagline;
        }

        public void setTagline(String tagline) {
            this.tagline = tagline;
        }

        public String getPh() {
            return ph;
        }

        public void setPh(String ph) {
            this.ph = ph;
        }

        public String getShape() {
            return shape;
        }

        public void setShape(String shape) {
            this.shape = shape;
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
