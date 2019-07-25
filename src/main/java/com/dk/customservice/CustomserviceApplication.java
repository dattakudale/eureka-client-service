package com.dk.customservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages= {"com.dk.customservice"})
@SpringBootApplication
@EnableDiscoveryClient
public class CustomserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomserviceApplication.class, args);
	}

}
