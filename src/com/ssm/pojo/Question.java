package com.ssm.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Question {
    private String qusid;

    private Integer qustype;

    private String qustext;

    private String qusvoice;

    private String qusimage;

    private BigDecimal qusprice;

    private String statusimg;

    private Date qussubtime;

    private Date qusendtime;

    private String openid;

    public String getQusid() {
        return qusid;
    }

    public void setQusid(String qusid) {
        this.qusid = qusid == null ? null : qusid.trim();
    }

    public Integer getQustype() {
        return qustype;
    }

    public void setQustype(Integer qustype) {
        this.qustype = qustype;
    }

    public String getQustext() {
        return qustext;
    }

    public void setQustext(String qustext) {
        this.qustext = qustext == null ? null : qustext.trim();
    }

    public String getQusvoice() {
        return qusvoice;
    }

    public void setQusvoice(String qusvoice) {
        this.qusvoice = qusvoice == null ? null : qusvoice.trim();
    }

    public String getQusimage() {
        return qusimage;
    }

    public void setQusimage(String qusimage) {
        this.qusimage = qusimage == null ? null : qusimage.trim();
    }

    public BigDecimal getQusprice() {
        return qusprice;
    }

    public void setQusprice(BigDecimal qusprice) {
        this.qusprice = qusprice;
    }

    public String getStatusimg() {
        return statusimg;
    }

    public void setStatusimg(String statusimg) {
        this.statusimg = statusimg == null ? null : statusimg.trim();
    }

    public Date getQussubtime() {
        return qussubtime;
    }

    public void setQussubtime(Date qussubtime) {
        this.qussubtime = qussubtime;
    }

    public Date getQusendtime() {
        return qusendtime;
    }

    public void setQusendtime(Date qusendtime) {
        this.qusendtime = qusendtime;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }
}