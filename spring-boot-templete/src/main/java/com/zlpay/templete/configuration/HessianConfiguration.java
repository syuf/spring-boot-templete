package com.zlpay.templete.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

//import com.syuf.common.ActivemqAppService;
import com.zlpay.templete.common.properties.HessianProperties;


@Configuration
@EnableConfigurationProperties(HessianProperties.class)
public class HessianConfiguration {
	
	
	@Bean
	public HessianProxyFactoryBean initHessianConfiguration(HessianProperties properties){
		HessianProxyFactoryBean hessianFactory = new HessianProxyFactoryBean();
		hessianFactory.setServiceUrl(properties.getActivemqUrl());
//		hessianFactory.setServiceInterface(ActivemqAppService.class);
		return hessianFactory;
	}
}
