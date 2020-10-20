package com.cube.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class SpringBootNacosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNacosApplication.class, args);
	}

}
