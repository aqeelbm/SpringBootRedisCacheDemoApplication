package com.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootRedisCacheDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRedisCacheDemoApplication.class, args);
	}

}
