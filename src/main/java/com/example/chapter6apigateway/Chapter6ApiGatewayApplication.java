package com.example.chapter6apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Chapter6ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Chapter6ApiGatewayApplication.class, args);
	}

}
