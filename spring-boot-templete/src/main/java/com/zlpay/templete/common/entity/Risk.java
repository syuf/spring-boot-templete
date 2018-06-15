package com.zlpay.templete.common.entity;

import java.io.Serializable;
import java.util.Date;

public class Risk implements Serializable {
    private String id;

    private String tradeDetailId;

    private String payerId;

    private String deviceId;

    private String deviceType;

    private String deviceOs;

    private String deviceOsVersion;

    private String deviceIp;

    private String deviceGps;

    private String deviceSim;

    private Date createTime;

    private Date updateTime;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTradeDetailId() {
        return tradeDetailId;
    }

    public void setTradeDetailId(String tradeDetailId) {
        this.tradeDetailId = tradeDetailId == null ? null : tradeDetailId.trim();
    }

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId == null ? null : payerId.trim();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getDeviceOs() {
        return deviceOs;
    }

    public void setDeviceOs(String deviceOs) {
        this.deviceOs = deviceOs == null ? null : deviceOs.trim();
    }

    public String getDeviceOsVersion() {
        return deviceOsVersion;
    }

    public void setDeviceOsVersion(String deviceOsVersion) {
        this.deviceOsVersion = deviceOsVersion == null ? null : deviceOsVersion.trim();
    }

    public String getDeviceIp() {
        return deviceIp;
    }

    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp == null ? null : deviceIp.trim();
    }

    public String getDeviceGps() {
        return deviceGps;
    }

    public void setDeviceGps(String deviceGps) {
        this.deviceGps = deviceGps == null ? null : deviceGps.trim();
    }

    public String getDeviceSim() {
        return deviceSim;
    }

    public void setDeviceSim(String deviceSim) {
        this.deviceSim = deviceSim == null ? null : deviceSim.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}