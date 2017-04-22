package com.ssm.pojo;

public class Section {
    private String secid;

    private String secname;

    private String memo;

    public String getSecid() {
        return secid;
    }

    public void setSecid(String secid) {
        this.secid = secid == null ? null : secid.trim();
    }

    public String getSecname() {
        return secname;
    }

    public void setSecname(String secname) {
        this.secname = secname == null ? null : secname.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}