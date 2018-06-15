/**   
 * Copyright © 2018 zlpay.
 */
package com.zlpay.templete.configuration;

import java.sql.SQLException;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.zlpay.templete.common.properties.DruidDataSourceProperties;

import lombok.extern.slf4j.Slf4j;

/** 
 * @Description: 初始化Druid连接池
 * @author: syuf
 * @date: 2018年6月14日 下午1:58:28  
 */
@Slf4j
@Configuration
@ConditionalOnClass({DruidDataSource.class})
@ConditionalOnProperty(
        name = {"spring.datasource.type"},
        havingValue = "com.alibaba.druid.pool.DruidDataSource",
        matchIfMissing = true
)
@EnableConfigurationProperties(DruidDataSourceProperties.class)
public class DruidConfiguration {
	
	@Bean
    public DruidDataSource dataSource(DataSourceProperties dataSourceProperties, DruidDataSourceProperties properties) {
        DruidDataSource druidDataSource = dataSourceProperties.initializeDataSourceBuilder().type(DruidDataSource.class).build();
        druidDataSource.setMaxActive(properties.getMaxActive());  
        druidDataSource.setInitialSize(properties.getInitialSize());  
        druidDataSource.setMinIdle(properties.getMinIdle());  
        druidDataSource.setMaxWait(properties.getMaxWait());  
        druidDataSource.setTimeBetweenEvictionRunsMillis(properties.getTimeBetweenEvictionRunsMillis());  
        druidDataSource.setMinEvictableIdleTimeMillis(properties.getMinEvictableIdleTimeMillis());  
        druidDataSource.setValidationQuery(properties.getValidationQuery());  
        druidDataSource.setTestOnBorrow(properties.getTestOnBorrow());  
        druidDataSource.setTestOnReturn(properties.getTestOnReturn());  
        druidDataSource.setTestWhileIdle(properties.getTestWhileIdle());  
        druidDataSource.setPoolPreparedStatements(properties.getPoolPreparedStatements());  
        druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(properties.getMaxPoolPreparedStatementPerConnectionSize());  
        druidDataSource.setConnectProperties(properties.getConnectionProperties());
        druidDataSource.setUseGlobalDataSourceStat(properties.getUseGlobalDataSourceStat());  
        try {
			druidDataSource.setFilters(properties.getFilters());
		} catch (SQLException e) {
			log.error("初始化Druid数据库连接池异常!!",e);
			return null;
		}  
        return druidDataSource;
    }
	  
    @Bean  
    public ServletRegistrationBean<StatViewServlet> druidStatViewServlet() {  
        ServletRegistrationBean<StatViewServlet> registrationBean = new ServletRegistrationBean<StatViewServlet>(new StatViewServlet(), "/druid/*");  
        // IP白名单(没有配置或者为空，则允许所有访问)
        registrationBean.addInitParameter("allow", "");  
        // IP黑名单 (存在共同时，deny优先于allow)
        registrationBean.addInitParameter("deny", "172.17.96.217");  
        registrationBean.addInitParameter("loginUsername", "");  
        registrationBean.addInitParameter("loginPassword", "");  
        // 禁用HTML页面上的“Reset All”功能
        registrationBean.addInitParameter("resetEnable", "true");  
  
        return registrationBean;  
    }  
  
    @Bean  
    public FilterRegistrationBean<WebStatFilter> druidWebStatViewFilter() {  
        FilterRegistrationBean<WebStatFilter> registrationBean = new FilterRegistrationBean<WebStatFilter>(new WebStatFilter());  
        registrationBean.addInitParameter("urlPatterns", "/*");  
        registrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");  
  
        return registrationBean;  
  
    }  

}
