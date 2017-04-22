package com.ssm.pojo;

public class Focus {
    private String focid;

    private String focfollow;

    private String befollow;

    public String getFocid() {
        return focid;
    }

    public void setFocid(String focid) {
        this.focid = focid == null ? null : focid.trim();
    }

    public String getFocfollow() {
        return focfollow;
    }

    public void setFocfollow(String focfollow) {
        this.focfollow = focfollow == null ? null : focfollow.trim();
    }

    public String getBefollow() {
        return befollow;
    }

    public void setBefollow(String befollow) {
        this.befollow = befollow == null ? null : befollow.trim();
    }
}