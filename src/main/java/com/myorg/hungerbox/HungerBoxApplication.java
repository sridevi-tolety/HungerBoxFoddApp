package com.myorg.hungerbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.myorg.hungerbox")
public class HungerBoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(HungerBoxApplication.class, args);
	}

}
