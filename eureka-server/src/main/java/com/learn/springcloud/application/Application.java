package com.learn.springcloud.application;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		
		//1,��������ע��������ʽ
//		new SpringApplicationBuilder(Application.class).web(true).run(args);
		//2��ģ����̨eureka�߿��ü�Ⱥע�᷽ʽ
		Scanner scan = new Scanner(System.in);
		String profiles = scan.nextLine();
		new SpringApplicationBuilder(Application.class).profiles(profiles).run(args);
	}
}
