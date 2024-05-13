package com.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RequestMapping("/client")
public class ClientApplication {
	@GetMapping("/test")
	public String test(){
		return "its working";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}
