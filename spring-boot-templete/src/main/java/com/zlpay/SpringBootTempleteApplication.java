package com.zlpay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zlpay.templete.mapper")
public class SpringBootTempleteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTempleteApplication.class, args);
	}
}
