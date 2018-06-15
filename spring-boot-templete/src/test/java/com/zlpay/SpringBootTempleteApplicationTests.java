package com.zlpay;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zlpay.templete.common.bo.RiskBO;
import com.zlpay.templete.service.RiskService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTempleteApplicationTests {
	
	@Autowired
	private RiskService riskService;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void test(){
		List<RiskBO> list = riskService.listRisk();
		System.out.println(list.size());
	}
}
