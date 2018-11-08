package com.learn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceProvideClient {
	public static void main(String[] args) {
		SpringApplication.run(ServiceProvideClient.class, args);
	}
}
