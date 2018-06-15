package com.zlpay.templete.common.bo;

import java.util.Date;

import lombok.Data;

@Data
public class RiskBO  {
	
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
}