/**   
 * Copyright © 2018 zlpay.
 */
package com.zlpay.templete.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zlpay.templete.common.bo.RiskBO;
import com.zlpay.templete.service.RiskService;

import lombok.extern.slf4j.Slf4j;

/** 
 * @Description: risk控制器
 * @author: syuf
 * @date: 2018年6月13日 下午5:24:02  
 */
@Slf4j
@Controller  
@RestController
public class RiskController {
	
	
	@Autowired
	private RiskService riskService;
	
	@GetMapping("/risk")
	public List<RiskBO> showRisk(){
		List<RiskBO> list = riskService.listRisk();
		log.info("查询到记录[{}]条",list.size());
		return list;
	}
}
