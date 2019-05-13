package com.leo.pojo;

import java.util.Date;

public class Image {
    private Integer id;

    private Byte userId;

    private Byte cameraId;

    private Byte presetId;

    private String imagepath;

    private String weather;

    private Date acquiredTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getUserId() {
        return userId;
    }

    public void setUserId(Byte userId) {
        this.userId = userId;
    }

    public Byte getCameraId() {
        return cameraId;
    }

    public void setCameraId(Byte cameraId) {
        this.cameraId = cameraId;
    }

    public Byte getPresetId() {
        return presetId;
    }

    public void setPresetId(Byte presetId) {
        this.presetId = presetId;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath == null ? null : imagepath.trim();
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather == null ? null : weather.trim();
    }

    public Date getAcquiredTime() {
        return acquiredTime;
    }

    public void setAcquiredTime(Date acquiredTime) {
        this.acquiredTime = acquiredTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}