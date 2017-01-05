package com.ahoo.entity;

public class SupProductParameterEntity {
    private Integer recId;

    private String toolbox;

    private String dhq;

    private String pd1;

    private String pd2;

    private String pd3;

    private String qm1;

    private String qm2;

    private String mj1;

    private String mj2;

    private String remark;

    private Integer fkChildRecId;

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public String getToolbox() {
        return toolbox;
    }

    public void setToolbox(String toolbox) {
        this.toolbox = toolbox == null ? null : toolbox.trim();
    }

    public String getDhq() {
        return dhq;
    }

    public void setDhq(String dhq) {
        this.dhq = dhq == null ? null : dhq.trim();
    }

    public String getPd1() {
        return pd1;
    }

    public void setPd1(String pd1) {
        this.pd1 = pd1 == null ? null : pd1.trim();
    }

    public String getPd2() {
        return pd2;
    }

    public void setPd2(String pd2) {
        this.pd2 = pd2 == null ? null : pd2.trim();
    }

    public String getPd3() {
        return pd3;
    }

    public void setPd3(String pd3) {
        this.pd3 = pd3 == null ? null : pd3.trim();
    }

    public String getQm1() {
        return qm1;
    }

    public void setQm1(String qm1) {
        this.qm1 = qm1 == null ? null : qm1.trim();
    }

    public String getQm2() {
        return qm2;
    }

    public void setQm2(String qm2) {
        this.qm2 = qm2 == null ? null : qm2.trim();
    }

    public String getMj1() {
        return mj1;
    }

    public void setMj1(String mj1) {
        this.mj1 = mj1 == null ? null : mj1.trim();
    }

    public String getMj2() {
        return mj2;
    }

    public void setMj2(String mj2) {
        this.mj2 = mj2 == null ? null : mj2.trim();
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