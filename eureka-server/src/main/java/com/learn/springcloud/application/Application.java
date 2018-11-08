package com.learn.springcloud.application;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		
		//1,单服务器注册启动方式
//		new SpringApplicationBuilder(Application.class).web(true).run(args);
		//2，模拟两台eureka高可用集群注册方式
		Scanner scan = new Scanner(System.in);
		String profiles = scan.nextLine();
		new SpringApplicationBuilder(Application.class).profiles(profiles).run(args);
	}
}
