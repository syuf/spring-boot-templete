/**   
 * Copyright © 2018 zlpay.
 */
package com.zlpay.templete.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zlpay.templete.common.bo.RiskBO;
import com.zlpay.templete.common.entity.Risk;
import com.zlpay.templete.common.entity.RiskExample;
import com.zlpay.templete.mapper.RiskMapper;
import com.zlpay.templete.service.RiskService;

/** 
 * @Description: TODO
 * @author: syuf
 * @date: 2018年6月13日 下午5:23:35  
 */
@Service("riskService")
public class RiskServiceImpl implements RiskService {
	
	@Autowired
	private RiskMapper riskMapper;

	@Override
	public List<RiskBO> listRisk() {
		List<RiskBO> riskBoList = new ArrayList<>();
		RiskExample example = new RiskExample();
		example.createCriteria().andDeviceIdEqualTo("12");
		List<Risk> riskList = riskMapper.selectByExample(example);
		RiskBO riskBo = null;
		for(Risk risk : riskList){
			riskBo = new RiskBO();
			riskBo.setId(risk.getId());
			riskBoList.add(riskBo);
		}
		return riskBoList;
	}

}
