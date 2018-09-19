package com.cssl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.cssl.dao")
public class Taoshopping01Application {

	public static void main(String[] args) {
		SpringApplication.run(Taoshopping01Application.class, args);
	}
}
