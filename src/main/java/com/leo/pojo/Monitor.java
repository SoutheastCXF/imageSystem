package com.leo.pojo;

import java.util.Date;

public class Monitor {
    private Byte id;

    private Integer ip;

    private String place;

    private Byte presetcount;

    private Integer recordimagenum;

    private Date createTime;

    private Date updateTime;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public Integer getIp() {
        return ip;
    }

    public void setIp(Integer ip) {
        this.ip = ip;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public Byte getPresetcount() {
        return presetcount;
    }

    public void setPresetcount(Byte presetcount) {
        this.presetcount = presetcount;
    }

    public Integer getRecordimagenum() {
        return recordimagenum;
    }

    public void setRecordimagenum(Integer recordimagenum) {
        this.recordimagenum = recordimagenum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}