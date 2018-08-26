package com.zlpay.templete.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianServiceExporter;

import com.zlpay.boot.common.MallAppService;

@EnableAutoConfiguration
public class HessianConfiguration {
	
	@Autowired
	private MallAppService mallAppService;
	
	@Bean(name = "/mallAppService")
    public HessianServiceExporter mallService() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(mallAppService);
        exporter.setServiceInterface(MallAppService.class);
        return exporter;
    }
}
