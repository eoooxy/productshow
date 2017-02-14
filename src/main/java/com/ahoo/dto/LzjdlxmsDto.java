package com.ahoo.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/2/11 0011
 * Time: 18:21
 */
public class LzjdlxmsDto {

    private Integer recId;

    private String productTitle;

    private String productDes;

    private String remark;

    private Integer fkRecId;

    private List<Lzjdlxms> lzjdlxmsList;

    public List<Lzjdlxms> getLzjdlxmsList() {
        return lzjdlxmsList;
    }

    public void setLzjdlxmsList(List<Lzjdlxms> lzjdlxmsList) {
        this.lzjdlxmsList = lzjdlxmsList;
    }

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
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

    public static class Lzjdlxms implements Serializable {
        private Integer recId;

        private String productTitle;

        private String productDes;

        private String remark;

        private Integer fkRecId;

        public Integer getRecId() {
            return recId;
        }

        public void setRecId(Integer recId) {
            this.recId = recId;
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
