package com.learn.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "hello-service",fallback = HelloHystrixService.class)
public interface HelloService {
	@RequestMapping("/hello")
	String hello();
}
