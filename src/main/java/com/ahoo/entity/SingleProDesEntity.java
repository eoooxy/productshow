package com.ahoo.entity;

public class SingleProDesEntity {
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
        this.proType = proType == null ? null : proType.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getHtmlDes() {
        return htmlDes;
    }

    public void setHtmlDes(String htmlDes) {
        this.htmlDes = htmlDes == null ? null : htmlDes.trim();
    }
}