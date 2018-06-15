/**   
 * Copyright © 2018 zlpay.
 */
package com.zlpay.templete.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Description: Security配置
 * @author: syuf
 * @date: 2018年6月13日 下午8:38:25
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// http.formLogin() // 定义当需要用户登录时候，转到的登录页面。
		// .loginPage("/login.html") // 设置登录页面
		// .loginProcessingUrl("/user/login") // 自定义的登录接口
		// .and().authorizeRequests() // 定义哪些URL需要被保护、哪些不需要被保护
		// .antMatchers("/login.html").permitAll() // 设置所有人都可以访问登录页面
		// .anyRequest() // 任何请求,登录后可以访问
		// .authenticated().and().csrf().disable(); // 关闭csrf防护
		http.formLogin() // 定义当需要用户登录时候，转到的登录页面。
				.and().authorizeRequests() // 定义哪些URL需要被保护、哪些不需要被保护
				.anyRequest() // 任何请求,登录后可以访问
				.authenticated();
	}
}
