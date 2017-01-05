package com.ahoo.entity;

public class SupProductParameterUrlEntity {
    private Integer recId;

    private String toolboxUrl;

    private String dhqUrl;

    private String pd1Url;

    private String pd2Url;

    private String pd3Url;

    private String qm1Url;

    private String qm2Url;

    private String mj1Url;

    private String mj2Url;

    private String remark;

    private Integer fkChildRecId;

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public String getToolboxUrl() {
        return toolboxUrl;
    }

    public void setToolboxUrl(String toolboxUrl) {
        this.toolboxUrl = toolboxUrl == null ? null : toolboxUrl.trim();
    }

    public String getDhqUrl() {
        return dhqUrl;
    }

    public void setDhqUrl(String dhqUrl) {
        this.dhqUrl = dhqUrl == null ? null : dhqUrl.trim();
    }

    public String getPd1Url() {
        return pd1Url;
    }

    public void setPd1Url(String pd1Url) {
        this.pd1Url = pd1Url == null ? null : pd1Url.trim();
    }

    public String getPd2Url() {
        return pd2Url;
    }

    public void setPd2Url(String pd2Url) {
        this.pd2Url = pd2Url == null ? null : pd2Url.trim();
    }

    public String getPd3Url() {
        return pd3Url;
    }

    public void setPd3Url(String pd3Url) {
        this.pd3Url = pd3Url == null ? null : pd3Url.trim();
    }

    public String getQm1Url() {
        return qm1Url;
    }

    public void setQm1Url(String qm1Url) {
        this.qm1Url = qm1Url == null ? null : qm1Url.trim();
    }

    public String getQm2Url() {
        return qm2Url;
    }

    public void setQm2Url(String qm2Url) {
        this.qm2Url = qm2Url == null ? null : qm2Url.trim();
    }

    public String getMj1Url() {
        return mj1Url;
    }

    public void setMj1Url(String mj1Url) {
        this.mj1Url = mj1Url == null ? null : mj1Url.trim();
    }

    public String getMj2Url() {
        return mj2Url;
    }

    public void setMj2Url(String mj2Url) {
        this.mj2Url = mj2Url == null ? null : mj2Url.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getFkChildRecId() {
        return fkChildRecId;
    }

    public void setFkChildRecId(Integer fkChildRecId) {
        this.fkChildRecId = fkChildRecId;
    }
}