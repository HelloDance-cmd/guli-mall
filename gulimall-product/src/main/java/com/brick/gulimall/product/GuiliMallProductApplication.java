package com.brick.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.brick.gulimall.product.dao")
@SpringBootApplication
public class GuiliMallProductApplication {
	public static void main(String[] args) {
		SpringApplication.run(GuiliMallProductApplication.class, args);
	}
}
