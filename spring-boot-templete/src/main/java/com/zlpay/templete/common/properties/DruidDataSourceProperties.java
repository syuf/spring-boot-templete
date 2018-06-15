/**   
 * Copyright © 2018 zlpay.
 */
package com.zlpay.templete.common.properties;

import java.util.Properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * @Description: Druid配置信息
 * @author: syuf
 * @date: 2018年6月14日 下午2:00:48
 */
@ConfigurationProperties(prefix = "spring.datasource.druid")
@Data
public class DruidDataSourceProperties {

	/**
	 * 初始化大小，最小，最大
	 */
	private int initialSize;
	private int minIdle;
	private int maxActive;
	/**
	 * 配置获取连接等待超时的时间
	 */
	private int maxWait;
	/**
	 * 配置监控统计拦截的filters，去掉后监控界面sql无法统计
	 */
	private String filters;
	/**
	 * 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
	 */
	private int timeBetweenEvictionRunsMillis;
	/**
	 * 配置一个连接在池中最小生存的时间，单位是毫秒
	 */
	private int minEvictableIdleTimeMillis;
	private String validationQuery;
	private Boolean testWhileIdle;
	private Boolean testOnBorrow;
	private Boolean testOnReturn;
	/**
	 * 打开PSCache，并且指定每个连接上PSCache的大小
	 */
	private Boolean poolPreparedStatements;
	private int MaxPoolPreparedStatementPerConnectionSize;
	/**
	 * 合并多个DruidDataSource的监控数据
	 */
	private Boolean useGlobalDataSourceStat;
	/**
	 * 通过connectProperties属性来打开mergeSql功能；慢SQL记录
	 */
	private Properties connectionProperties = new Properties() {
		private static final long serialVersionUID = 2854644900507853700L;
		{
			put("druid.stat.mergeSql", "true");
			put("druid.stat.slowSqlMillis", "5000");
		}
	};

}
