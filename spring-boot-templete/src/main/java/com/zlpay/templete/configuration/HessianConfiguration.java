package com.zlpay.templete.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianServiceExporter;

import com.zlpay.common.app.mall.MallAppService;

public class HessianConfiguration {
	
	private MallAppService mallAppService;
	
	@Bean(name = "/mallAppService")
    public HessianServiceExporter accountService() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(mallAppService);
        exporter.setServiceInterface(MallAppService.class);
        return exporter;
    }
}
