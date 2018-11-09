package com.learn.springcloud;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceProvideClient {
	public static void main(String[] args) {
		//1,单服务提供者启动方式
//		SpringApplication.run(ServiceProvideClient.class, args);
		//2,模拟多服务启动
		Scanner scan = new Scanner(System.in);
		String profiles = scan.nextLine();
		new SpringApplicationBuilder(ServiceProvideClient.class).profiles(profiles).run(args);
	}
}
