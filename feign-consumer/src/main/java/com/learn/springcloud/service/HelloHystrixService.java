package com.learn.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class HelloHystrixService implements HelloService{

	@Override
	public String hello() {
		return "Consumer feign [client] error";
	}

}
