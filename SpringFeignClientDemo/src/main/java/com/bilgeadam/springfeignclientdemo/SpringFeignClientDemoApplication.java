package com.bilgeadam.springfeignclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringFeignClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFeignClientDemoApplication.class, args);
	}

}
