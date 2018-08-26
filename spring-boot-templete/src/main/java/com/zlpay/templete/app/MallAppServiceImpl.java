/**   
 * Copyright © 2018 zlpay.
 */
package com.zlpay.templete.app;

import org.springframework.stereotype.Service;

import com.zlpay.boot.common.MallAppService;

import lombok.extern.slf4j.Slf4j;

/** 
 * @Description: TODO
 * @author: syuf
 * @date: 2018年8月2日 上午10:42:13  
 */
@Slf4j
@Service("mallAppService")
public class MallAppServiceImpl implements MallAppService {

	@Override
	public String trade(String merchNo, String txCode, String data) {
		log.info("收到请求{}",merchNo);
		return "hello " + merchNo;
	}

}
