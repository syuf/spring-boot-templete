/**   
 * Copyright © 2018 zlpay.
 */
package com.zlpay.templete.common.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * @Description: hessian配置信息
 * @author: syuf
 * @date: 2018年6月14日 下午2:00:48
 */
@ConfigurationProperties(prefix = "hessian")
@Data
public class HessianProperties {

	/**
	 * 服务url
	 */
	private String activemqUrl;
}
