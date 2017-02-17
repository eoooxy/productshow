package com.ahoo.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author xueyuan
 * @dater 2017/2/17.
 */
public class SingleProDesDto {

    private Integer recId;

    private String proType;

    private String remark;

    private String type;

    private String htmlDes;

    private List<SingleProDes> lists;

    private List<String> strings;

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHtmlDes() {
        return htmlDes;
    }

    public void setHtmlDes(String htmlDes) {
        this.htmlDes = htmlDes;
    }

    public List<SingleProDes> getLists() {
        return lists;
    }

    public void setLists(List<SingleProDes> lists) {
        this.lists = lists;
    }

    public static class SingleProDes implements Serializable {


        private Integer recId;

        private String proType;

        private String remark;

        private String type;

        private String htmlDes;

        public Integer getRecId() {
            return recId;
        }

        public void setRecId(Integer recId) {
            this.recId = recId;
        }

        public String getProType() {
            return proType;
        }

        public void setProType(String proType) {
            this.proType = proType;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getHtmlDes() {
            return htmlDes;
        }

        public void setHtmlDes(String htmlDes) {
            this.htmlDes = htmlDes;
        }
    }
}
