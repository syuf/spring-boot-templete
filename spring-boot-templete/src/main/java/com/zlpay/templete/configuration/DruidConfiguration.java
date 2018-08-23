/**   
 * Copyright © 2018 zlpay.
 */
package com.zlpay.templete.configuration;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

/** 
 * @Description: 初始化Druid连接池
 * @author: syuf
 * @date: 2018年6月14日 下午1:58:28  
 */
@Configuration
public class DruidConfiguration {
	
	  
    @Bean  
    public ServletRegistrationBean<StatViewServlet> druidStatViewServlet() {  
        ServletRegistrationBean<StatViewServlet> registrationBean = new ServletRegistrationBean<StatViewServlet>(new StatViewServlet(), "/druid/*");  
        // IP白名单(没有配置或者为空，则允许所有访问)
        registrationBean.addInitParameter("allow", "127.0.0.1");  
        // IP黑名单 (存在共同时，deny优先于allow)
        registrationBean.addInitParameter("deny", "");  
        registrationBean.addInitParameter("loginUsername", "admin");  
        registrationBean.addInitParameter("loginPassword", "admin");  
        // 禁用HTML页面上的“Reset All”功能,是否能够重置数据.
        registrationBean.addInitParameter("resetEnable", "false");  
  
        return registrationBean;  
    }  
  
    @Bean  
    public FilterRegistrationBean<WebStatFilter> druidWebStatViewFilter() {  
        FilterRegistrationBean<WebStatFilter> registrationBean = new FilterRegistrationBean<WebStatFilter>(new WebStatFilter());  
        registrationBean.addUrlPatterns("/*");
        registrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");  
  
        return registrationBean;  
  
    }  

}
