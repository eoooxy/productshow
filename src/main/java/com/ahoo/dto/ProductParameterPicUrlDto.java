package com.ahoo.dto;

/**
 * @author xueyuan
 * @dater 2017-1-5 0005.
 */
public class ProductParameterPicUrlDto {

    private Integer recId;

    private String conductorUrl;

    private String modelNumberUrl;

    private String modelTypeUrl;

    private String powerTypeUrl;

    private String modelClipUrl;

    private String parameter1Url;

    private String parameter2Url;

    private String remark;

    private Integer fkChildRecId;


    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public String getConductorUrl() {
        return conductorUrl;
    }

    public void setConductorUrl(String conductorUrl) {
        this.conductorUrl = conductorUrl;
    }

    public String getModelNumberUrl() {
        return modelNumberUrl;
    }

    public void setModelNumberUrl(String modelNumberUrl) {
        this.modelNumberUrl = modelNumberUrl;
    }

    public String getModelTypeUrl() {
        return modelTypeUrl;
    }

    public void setModelTypeUrl(String modelTypeUrl) {
        this.modelTypeUrl = modelTypeUrl;
    }

    public String getPowerTypeUrl() {
        return powerTypeUrl;
    }

    public void setPowerTypeUrl(String powerTypeUrl) {
        this.powerTypeUrl = powerTypeUrl;
    }

    public String getModelClipUrl() {
        return modelClipUrl;
    }

    public void setModelClipUrl(String modelClipUrl) {
        this.modelClipUrl = modelClipUrl;
    }

    public String getParameter1Url() {
        return parameter1Url;
    }

    public void setParameter1Url(String parameter1Url) {
        this.parameter1Url = parameter1Url;
    }

    public String getParameter2Url() {
        return parameter2Url;
    }

    public void setParameter2Url(String parameter2Url) {
        this.parameter2Url = parameter2Url;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getFkChildRecId() {
        return fkChildRecId;
    }

    public void setFkChildRecId(Integer fkChildRecId) {
        this.fkChildRecId = fkChildRecId;
    }
}
